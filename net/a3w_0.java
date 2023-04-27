/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 */
package net;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import net.Ei;
import net.M0;
import net.P8;
import net.T7;
import net.WN;
import net.a3_;
import net.aBW;
import net.aL0;
import net.ag4_0;

/*
 * Renamed from net.a3w
 */
public class a3w_0
extends a3_<T7> {
    @Override
    public String a() {
        return aBW.f;
    }

    private static JsonParseException a(JsonParseException jsonParseException) {
        return jsonParseException;
    }

    public T7 a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = WN.c(jsonElement);
        float[] fArray = new float[256];
        float[] fArray2 = new float[256];
        float[] fArray3 = new float[256];
        float f = 1.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        if (M0.c(jsonObject, aBW.a)) {
            if (!WN.h(M0.d(jsonObject, aBW.c))) {
                throw new JsonParseException(aL0.a(aL0.a(new StringBuilder(), aBW.o), M0.d(jsonObject, aBW.h)).toString());
            }
            JsonObject jsonObject2 = M0.b(jsonObject, aBW.v);
            if (M0.c(jsonObject2, aBW.r)) {
                if (!WN.h(M0.d(jsonObject2, aBW.s))) {
                    throw new JsonParseException(aL0.a(aL0.a(new StringBuilder(), aBW.n), M0.d(jsonObject2, aBW.b)).toString());
                }
                JsonObject jsonObject3 = M0.b(jsonObject2, aBW.d);
                f = Ei.a(jsonObject3, aBW.g, f);
                ag4_0.a(0.0, 3.4028234663852886E38, f, aBW.x);
                f2 = Ei.a(jsonObject3, aBW.k, f2);
                ag4_0.a(0.0, 3.4028234663852886E38, f2, aBW.y);
                f3 = Ei.a(jsonObject3, aBW.l, f2);
                ag4_0.a(0.0, 3.4028234663852886E38, f3, aBW.j);
            }
            int n = 0;
            while (true) {
                JsonElement jsonElement2 = M0.d(jsonObject2, P8.g(n));
                float f4 = f;
                float f5 = f2;
                float f6 = f3;
                JsonObject jsonObject4 = Ei.d(jsonElement2, aL0.a(aL0.c(aL0.a(new StringBuilder(), aBW.u), n), aBW.m).toString());
                f4 = Ei.a(jsonObject4, aBW.p, f);
                ag4_0.a(0.0, 3.4028234663852886E38, f4, aBW.q);
                f5 = Ei.a(jsonObject4, aBW.t, f2);
                ag4_0.a(0.0, 3.4028234663852886E38, f5, aBW.w);
                f6 = Ei.a(jsonObject4, aBW.e, f3);
                ag4_0.a(0.0, 3.4028234663852886E38, f6, aBW.i);
                fArray[n] = f4;
                fArray2[n] = f5;
                fArray3[n] = f6;
                ++n;
            }
        }
        return new T7(fArray, fArray3, fArray2);
    }
}


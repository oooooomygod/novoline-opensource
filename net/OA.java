/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 */
package net;

import cc.novoline.invoke.ListInvoker;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import net.Ei;
import net.JX;
import net.M0;
import net.N6;
import net.P0;
import net.Ti;
import net.V_;
import net.aET;
import net.aag_1;
import net.adt_0;
import net.aem;
import net.ag4_0;
import net.wt_0;

public class OA
implements JsonDeserializer<JX> {
    private static JsonParseException a(JsonParseException jsonParseException) {
        return jsonParseException;
    }

    public JX a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = Ei.d(jsonElement, V_.l);
        JX jX = new JX();
        adt_0.a(jX, Ei.a(jsonObject, V_.n, false));
        N6 n6 = wt_0.a(Ei.a(jsonObject, V_.w, wt_0.b(N6.MASTER)));
        adt_0.a(jX, n6);
        ag4_0.a((Object)n6, V_.b, new Object[0]);
        if (M0.c(jsonObject, V_.c)) {
            JsonArray jsonArray = Ei.b(jsonObject, V_.j);
            for (int i = 0; i < aem.a(jsonArray); ++i) {
                JsonElement jsonElement2 = aem.a(jsonArray, i);
                Ti ti = new Ti();
                if (Ei.a(jsonElement2)) {
                    aag_1.a(ti, Ei.c(jsonElement2, V_.r));
                } else {
                    JsonObject jsonObject2 = Ei.d(jsonElement2, V_.p);
                    aag_1.a(ti, Ei.f(jsonObject2, V_.m));
                    if (M0.c(jsonObject2, V_.v)) {
                        aET aET2 = P0.a(Ei.f(jsonObject2, V_.u));
                        ag4_0.a((Object)aET2, V_.d, new Object[0]);
                        aag_1.a(ti, aET2);
                    }
                    if (M0.c(jsonObject2, V_.e)) {
                        float f = Ei.i(jsonObject2, V_.a);
                        ag4_0.a(f > 0.0f, V_.i, new Object[0]);
                        aag_1.a(ti, f);
                    }
                    if (M0.c(jsonObject2, V_.k)) {
                        float f = Ei.i(jsonObject2, V_.q);
                        ag4_0.a(f > 0.0f, V_.t, new Object[0]);
                        aag_1.b(ti, f);
                    }
                    if (M0.c(jsonObject2, V_.f)) {
                        int n = Ei.e(jsonObject2, V_.o);
                        ag4_0.a(true, V_.g, new Object[0]);
                        aag_1.a(ti, n);
                    }
                    if (M0.c(jsonObject2, V_.h)) {
                        aag_1.a(ti, Ei.d(jsonObject2, V_.s));
                    }
                }
                ListInvoker.add(adt_0.c(jX), ti);
            }
        }
        return jX;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonPrimitive
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSerializer
 */
package net;

import cc.novoline.invoke.ListInvoker;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import net.Ei;
import net.M0;
import net.P8;
import net.WN;
import net.a0F;
import net.a3_;
import net.aDf;
import net.aL0;
import net.aby_1;
import net.aem;
import net.ag4_0;
import net.bc_0;
import net.my_0;

public class a3C
extends a3_<bc_0>
implements JsonSerializer<bc_0> {
    public bc_0 a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        int n;
        ArrayList arrayList = my_0.c();
        JsonObject jsonObject = Ei.d(jsonElement, a0F.j);
        int n2 = Ei.a(jsonObject, a0F.d, 1);
        if (n2 != 1) {
            ag4_0.a(1L, Integer.MAX_VALUE, n2, a0F.q);
        }
        if (M0.c(jsonObject, a0F.r)) {
            try {
                JsonArray jsonArray = Ei.b(jsonObject, a0F.A);
                for (n = 0; n < aem.a(jsonArray); ++n) {
                    JsonElement jsonElement2 = aem.a(jsonArray, n);
                    aby_1 aby_12 = this.a(n, jsonElement2);
                    ListInvoker.add(arrayList, aby_12);
                }
            }
            catch (ClassCastException classCastException) {
                throw new JsonParseException(aL0.a(aL0.a(new StringBuilder(), a0F.p), M0.d(jsonObject, a0F.f)).toString(), (Throwable)classCastException);
            }
        }
        int n3 = Ei.a(jsonObject, a0F.v, -1);
        n = Ei.a(jsonObject, a0F.B, -1);
        if (n3 != -1) {
            ag4_0.a(1L, Integer.MAX_VALUE, n3, a0F.g);
        }
        if (n != -1) {
            ag4_0.a(1L, Integer.MAX_VALUE, n, a0F.o);
        }
        boolean bl = Ei.a(jsonObject, a0F.l, false);
        return new bc_0(arrayList, n3, n, n2, bl);
    }

    public JsonElement a(bc_0 bc_02, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();
        M0.a(jsonObject, a0F.s, P8.d(aDf.d(bc_02)));
        if (aDf.a(bc_02) != -1) {
            M0.a(jsonObject, a0F.u, P8.d(aDf.a(bc_02)));
        }
        if (aDf.c(bc_02) != -1) {
            M0.a(jsonObject, a0F.x, P8.d(aDf.c(bc_02)));
        }
        if (aDf.f(bc_02) > 0) {
            JsonArray jsonArray = new JsonArray();
            for (int i = 0; i < aDf.f(bc_02); ++i) {
                if (aDf.c(bc_02, i)) {
                    JsonObject jsonObject2 = new JsonObject();
                    M0.a(jsonObject2, a0F.m, P8.d(aDf.b(bc_02, i)));
                    M0.a(jsonObject2, a0F.a, P8.d(aDf.a(bc_02, i)));
                    aem.a(jsonArray, (JsonElement)jsonObject2);
                    continue;
                }
                aem.a(jsonArray, (JsonElement)new JsonPrimitive((Number)P8.d(aDf.b(bc_02, i))));
            }
            M0.a(jsonObject, a0F.t, (JsonElement)jsonArray);
        }
        return jsonObject;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }

    private aby_1 a(int n, JsonElement jsonElement) {
        if (WN.k(jsonElement)) {
            return new aby_1(Ei.a(jsonElement, aL0.a(aL0.c(aL0.a(new StringBuilder(), a0F.e), n), a0F.c).toString()));
        }
        if (WN.h(jsonElement)) {
            JsonObject jsonObject = Ei.d(jsonElement, aL0.a(aL0.c(aL0.a(new StringBuilder(), a0F.b), n), a0F.i).toString());
            int n2 = Ei.a(jsonObject, a0F.y, -1);
            if (M0.c(jsonObject, a0F.n)) {
                ag4_0.a(1L, Integer.MAX_VALUE, n2, a0F.k);
            }
            int n3 = Ei.e(jsonObject, a0F.w);
            ag4_0.a(0L, Integer.MAX_VALUE, n3, a0F.h);
            return new aby_1(n3, n2);
        }
        return null;
    }

    @Override
    public String a() {
        return a0F.z;
    }
}


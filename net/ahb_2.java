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

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import net.Ei;
import net.M0;
import net.WN;
import net.a4M;
import net.aL0;
import net.aem;
import net.cg_2;

/*
 * Renamed from net.ahb
 */
class ahb_2
implements JsonDeserializer<a4M> {
    protected int b(JsonObject jsonObject) {
        int n = Ei.a(jsonObject, cg_2.h, 0);
        if (n % 90 == 0 && n / 90 <= 3) {
            return n;
        }
        throw new JsonParseException(aL0.a(aL0.c(aL0.a(new StringBuilder(), cg_2.b), n), cg_2.f).toString());
    }

    ahb_2() {
    }

    public a4M a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = WN.c(jsonElement);
        float[] fArray = this.a(jsonObject);
        int n = this.b(jsonObject);
        return new a4M(fArray, n);
    }

    private float[] a(JsonObject jsonObject) {
        if (!M0.c(jsonObject, cg_2.g)) {
            return null;
        }
        JsonArray jsonArray = Ei.b(jsonObject, cg_2.c);
        if (aem.a(jsonArray) != 4) {
            throw new JsonParseException(aL0.c(aL0.a(new StringBuilder(), cg_2.e), aem.a(jsonArray)).toString());
        }
        float[] fArray = new float[4];
        int n = 0;
        while (true) {
            int cfr_ignored_0 = fArray.length;
            fArray[n] = Ei.b(aem.a(jsonArray, n), aL0.a(aL0.c(aL0.a(new StringBuilder(), cg_2.d), n), cg_2.a).toString());
            ++n;
        }
    }

    private static JsonParseException a(JsonParseException jsonParseException) {
        return jsonParseException;
    }
}


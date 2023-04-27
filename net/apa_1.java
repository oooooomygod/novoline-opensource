/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 */
package net;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import net.HL;
import net.M0;
import net.WN;
import net.aN0;
import net.aSZ;
import net.avu_0;

/*
 * Renamed from net.apA
 */
class apa_1
implements JsonDeserializer<HL> {
    public HL a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = WN.c(jsonElement);
        aSZ aSZ2 = this.a(jsonDeserializationContext, jsonObject, avu_0.d);
        aSZ aSZ3 = this.a(jsonDeserializationContext, jsonObject, avu_0.c);
        aSZ aSZ4 = this.a(jsonDeserializationContext, jsonObject, avu_0.a);
        aSZ aSZ5 = this.a(jsonDeserializationContext, jsonObject, avu_0.e);
        aSZ aSZ6 = this.a(jsonDeserializationContext, jsonObject, avu_0.f);
        aSZ aSZ7 = this.a(jsonDeserializationContext, jsonObject, avu_0.b);
        return new HL(aSZ2, aSZ3, aSZ4, aSZ5, aSZ6, aSZ7);
    }

    private static JsonParseException a(JsonParseException jsonParseException) {
        return jsonParseException;
    }

    private aSZ a(JsonDeserializationContext jsonDeserializationContext, JsonObject jsonObject, String string) {
        return M0.c(jsonObject, string) ? (aSZ)aN0.a(jsonDeserializationContext, M0.d(jsonObject, string), aSZ.class) : aSZ.d;
    }

    apa_1() {
    }
}


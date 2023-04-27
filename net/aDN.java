/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSerializer
 */
package net;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import net.AS;
import net.WN;
import net.a0z_0;
import net.a8d_0;

class aDN
implements JsonDeserializer<a8d_0<K>>,
JsonSerializer<a8d_0<K>> {
    a0z_0 a;

    private aDN(a0z_0 a0z_02) {
        this.a = a0z_02;
    }

    public a8d_0<K> a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        if (WN.h(jsonElement)) {
            JsonObject jsonObject = WN.c(jsonElement);
            a8d_0 a8d_02 = this.a.a(jsonObject);
            return a8d_02;
        }
        return null;
    }

    public JsonElement a(a8d_0<K> a8d_02, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();
        a8d_02.a(jsonObject);
        return jsonObject;
    }

    aDN(a0z_0 a0z_02, AS aS) {
        this(a0z_02);
    }
}


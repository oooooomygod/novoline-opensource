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
import net.Ei;
import net.M0;
import net.P8;
import net.TK;
import net.aEW;
import net.sm_0;

/*
 * Renamed from net.afg
 */
public class afg_0
implements JsonDeserializer<aEW>,
JsonSerializer<aEW> {
    public aEW a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = Ei.d(jsonElement, sm_0.e);
        return new aEW(Ei.f(jsonObject, sm_0.b), Ei.e(jsonObject, sm_0.c));
    }

    public JsonElement a(aEW aEW2, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();
        M0.a(jsonObject, sm_0.d, TK.a(aEW2));
        M0.a(jsonObject, sm_0.a, P8.d(TK.b(aEW2)));
        return jsonObject;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSerializer
 */
package net;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import deobf.IChatComponent;
import java.lang.reflect.Type;
import net.M0;
import net.P8;
import net.WN;
import net.WS;
import net.a3_;
import net.a4H;
import net.aN0;
import net.aW1;
import net.aqd_0;

public class a3Y
extends a3_<aqd_0>
implements JsonSerializer<aqd_0> {
    @Override
    public String a() {
        return aW1.b;
    }

    public JsonElement a(aqd_0 aqd_02, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();
        M0.a(jsonObject, aW1.a, P8.d(WS.a(aqd_02)));
        M0.a(jsonObject, aW1.c, a4H.a(jsonSerializationContext, WS.b(aqd_02)));
        return jsonObject;
    }

    private static JsonParseException a(JsonParseException jsonParseException) {
        return jsonParseException;
    }

    public aqd_0 a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = WN.c(jsonElement);
        IChatComponent cfr_ignored_0 = (IChatComponent)aN0.a(jsonDeserializationContext, M0.d(jsonObject, aW1.d), IChatComponent.class);
        throw new JsonParseException(aW1.f);
    }
}


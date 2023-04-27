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
import deobf.IChatComponent;
import deobf.ServerStatusResponse;
import java.lang.reflect.Type;
import net.Ei;
import net.M0;
import net.a4H;
import net.a8K;
import net.aEW;
import net.aN0;
import net.ahp_0;
import net.t6_0;

/*
 * Renamed from net.aeE
 */
public class aee_1
implements JsonDeserializer<ServerStatusResponse>,
JsonSerializer<ServerStatusResponse> {
    public ServerStatusResponse a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = Ei.d(jsonElement, ahp_0.l);
        ServerStatusResponse serverStatusResponse = new ServerStatusResponse();
        if (M0.c(jsonObject, ahp_0.f)) {
            a8K.a(serverStatusResponse, (IChatComponent)aN0.a(jsonDeserializationContext, M0.d(jsonObject, ahp_0.c), IChatComponent.class));
        }
        if (M0.c(jsonObject, ahp_0.b)) {
            a8K.a(serverStatusResponse, (t6_0)aN0.a(jsonDeserializationContext, M0.d(jsonObject, ahp_0.e), t6_0.class));
        }
        if (M0.c(jsonObject, ahp_0.d)) {
            a8K.a(serverStatusResponse, (aEW)aN0.a(jsonDeserializationContext, M0.d(jsonObject, ahp_0.h), aEW.class));
        }
        if (M0.c(jsonObject, ahp_0.i)) {
            a8K.a(serverStatusResponse, Ei.f(jsonObject, ahp_0.j));
        }
        return serverStatusResponse;
    }

    private static JsonParseException a(JsonParseException jsonParseException) {
        return jsonParseException;
    }

    public JsonElement a(ServerStatusResponse serverStatusResponse, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();
        if (a8K.c(serverStatusResponse) != null) {
            M0.a(jsonObject, ahp_0.k, a4H.a(jsonSerializationContext, a8K.c(serverStatusResponse)));
        }
        if (a8K.d(serverStatusResponse) != null) {
            M0.a(jsonObject, ahp_0.a, a4H.a(jsonSerializationContext, a8K.d(serverStatusResponse)));
        }
        if (a8K.b(serverStatusResponse) != null) {
            M0.a(jsonObject, ahp_0.g, a4H.a(jsonSerializationContext, a8K.b(serverStatusResponse)));
        }
        if (a8K.a(serverStatusResponse) != null) {
            M0.a(jsonObject, ahp_0.m, a8K.a(serverStatusResponse));
        }
        return jsonObject;
    }
}


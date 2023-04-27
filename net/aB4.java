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
import net.ChatStyle;
import net.HX;
import net.M0;
import net.WN;
import net.a4H;
import net.aa6_0;
import net.add_2;
import net.jl_2;
import net.uz_0;
import net.wn_0;

public class aB4
implements JsonDeserializer<ChatStyle>,
JsonSerializer<ChatStyle> {
    private static JsonParseException a(JsonParseException jsonParseException) {
        return jsonParseException;
    }

    public JsonElement a(ChatStyle chatStyle, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject;
        if (HX.d(chatStyle)) {
            return null;
        }
        JsonObject jsonObject2 = new JsonObject();
        if (ChatStyle.j(chatStyle) != null) {
            M0.a(jsonObject2, add_2.H, ChatStyle.j(chatStyle));
        }
        if (ChatStyle.i(chatStyle) != null) {
            M0.a(jsonObject2, add_2.u, ChatStyle.i(chatStyle));
        }
        if (ChatStyle.d(chatStyle) != null) {
            M0.a(jsonObject2, add_2.C, ChatStyle.d(chatStyle));
        }
        if (ChatStyle.c(chatStyle) != null) {
            M0.a(jsonObject2, add_2.x, ChatStyle.c(chatStyle));
        }
        if (ChatStyle.e(chatStyle) != null) {
            M0.a(jsonObject2, add_2.f, ChatStyle.e(chatStyle));
        }
        if (ChatStyle.b(chatStyle) != null) {
            M0.a(jsonObject2, add_2.b, a4H.a(jsonSerializationContext, (Object)ChatStyle.b(chatStyle)));
        }
        if (ChatStyle.h(chatStyle) != null) {
            M0.a(jsonObject2, add_2.r, a4H.a(jsonSerializationContext, ChatStyle.h(chatStyle)));
        }
        if (ChatStyle.g(chatStyle) != null) {
            jsonObject = new JsonObject();
            M0.a(jsonObject, add_2.l, jl_2.a(wn_0.b(ChatStyle.g(chatStyle))));
            M0.a(jsonObject, add_2.d, wn_0.a(ChatStyle.g(chatStyle)));
            M0.a(jsonObject2, add_2.h, (JsonElement)jsonObject);
        }
        if (ChatStyle.a(chatStyle) != null) {
            jsonObject = new JsonObject();
            M0.a(jsonObject, add_2.I, uz_0.b(aa6_0.a(ChatStyle.a(chatStyle))));
            M0.a(jsonObject, add_2.c, a4H.a(jsonSerializationContext, aa6_0.b(ChatStyle.a(chatStyle))));
            M0.a(jsonObject2, add_2.m, (JsonElement)jsonObject);
        }
        return jsonObject2;
    }

    public ChatStyle a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        if (WN.h(jsonElement)) {
            new ChatStyle();
            WN.c(jsonElement);
            return null;
        }
        return null;
    }
}


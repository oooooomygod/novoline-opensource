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
 *  com.mojang.authlib.GameProfile
 */
package net;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.mojang.authlib.GameProfile;
import deobf.PlayerProfileCache;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.util.Date;
import java.util.UUID;
import net.M0;
import net.WN;
import net.a4Z;
import net.aZ2;
import net.aq5;
import net.auo_1;
import net.awc_1;
import net.ayp_0;

/*
 * Renamed from net.cA
 */
class ca_0
implements JsonDeserializer<ayp_0>,
JsonSerializer<ayp_0> {
    PlayerProfileCache a;

    public ayp_0 a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        if (WN.h(jsonElement)) {
            PlayerProfileCache playerProfileCache;
            UUID uUID;
            JsonObject jsonObject = WN.c(jsonElement);
            JsonElement jsonElement2 = M0.d(jsonObject, auo_1.d);
            JsonElement jsonElement3 = M0.d(jsonObject, auo_1.c);
            JsonElement jsonElement4 = M0.d(jsonObject, auo_1.a);
            String string = WN.f(jsonElement3);
            String string2 = WN.f(jsonElement2);
            Date date = null;
            try {
                date = aZ2.a(PlayerProfileCache.e, WN.f(jsonElement4));
            }
            catch (ParseException parseException) {
                date = null;
            }
            try {
                uUID = awc_1.a(string);
                playerProfileCache = this.a;
                playerProfileCache.getClass();
            }
            catch (Throwable throwable) {
                return null;
            }
            ayp_0 ayp_02 = new ayp_0(playerProfileCache, new GameProfile(uUID, string2), date, null);
            return ayp_02;
        }
        return null;
    }

    public JsonElement a(ayp_0 ayp_02, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();
        M0.a(jsonObject, auo_1.b, a4Z.d(ayp_02.b()));
        a4Z.a(ayp_02.b());
        M0.a(jsonObject, auo_1.e, auo_1.f);
        M0.a(jsonObject, auo_1.g, aZ2.a(PlayerProfileCache.e, ayp_02.a()));
        return jsonObject;
    }

    private ca_0(PlayerProfileCache playerProfileCache) {
        this.a = playerProfileCache;
    }

    ca_0(PlayerProfileCache playerProfileCache, aq5 aq52) {
        this(playerProfileCache);
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}


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
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSerializer
 *  com.mojang.authlib.GameProfile
 */
package net;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.mojang.authlib.GameProfile;
import java.lang.reflect.Type;
import net.Ei;
import net.M0;
import net.P8;
import net.a4Z;
import net.aL0;
import net.aMQ;
import net.aem;
import net.amr_1;
import net.awc_1;
import net.t6_0;

/*
 * Renamed from net.aQr
 */
public class aqr_0
implements JsonDeserializer<t6_0>,
JsonSerializer<t6_0> {
    private static JsonParseException a(JsonParseException jsonParseException) {
        return jsonParseException;
    }

    public t6_0 a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonArray jsonArray;
        JsonObject jsonObject = Ei.d(jsonElement, amr_1.g);
        t6_0 t6_02 = new t6_0(Ei.e(jsonObject, amr_1.e), Ei.e(jsonObject, amr_1.i));
        if (Ei.c(jsonObject, amr_1.n) && aem.a(jsonArray = Ei.b(jsonObject, amr_1.h)) > 0) {
            GameProfile[] gameProfileArray = new GameProfile[aem.a(jsonArray)];
            for (int i = 0; i < gameProfileArray.length; ++i) {
                JsonObject jsonObject2 = Ei.d(aem.a(jsonArray, i), aL0.a(aL0.c(aL0.a(new StringBuilder(), amr_1.o), i), amr_1.l).toString());
                String string = Ei.f(jsonObject2, amr_1.k);
                gameProfileArray[i] = new GameProfile(awc_1.a(string), Ei.f(jsonObject2, amr_1.f));
            }
            aMQ.a(t6_02, gameProfileArray);
        }
        return t6_02;
    }

    public JsonElement a(t6_0 t6_02, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();
        M0.a(jsonObject, amr_1.d, P8.d(aMQ.b(t6_02)));
        M0.a(jsonObject, amr_1.c, P8.d(aMQ.c(t6_02)));
        if (aMQ.a(t6_02) != null && aMQ.a(t6_02).length > 0) {
            JsonArray jsonArray = new JsonArray();
            for (int i = 0; i < aMQ.a(t6_02).length; ++i) {
                JsonObject jsonObject2 = new JsonObject();
                a4Z.a(aMQ.a(t6_02)[i]);
                M0.a(jsonObject2, amr_1.m, amr_1.b);
                M0.a(jsonObject2, amr_1.j, a4Z.d(aMQ.a(t6_02)[i]));
                aem.a(jsonArray, (JsonElement)jsonObject2);
            }
            M0.a(jsonObject, amr_1.a, (JsonElement)jsonArray);
        }
        return jsonObject;
    }
}


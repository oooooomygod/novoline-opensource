/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonPrimitive
 */
package net;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.util.Set;

public class M0 {
    private static String b = "QadFeb";

    public static void a(JsonObject jsonObject, String string, String string2) {
        jsonObject.addProperty(string, string2);
    }

    public static void a(JsonObject jsonObject, String string, Boolean bl) {
        jsonObject.addProperty(string, bl);
    }

    public static JsonElement d(JsonObject jsonObject, String string) {
        return jsonObject.get(string);
    }

    public static boolean c(JsonObject jsonObject, String string) {
        return jsonObject.has(string);
    }

    public static Set a(JsonObject jsonObject) {
        return jsonObject.entrySet();
    }

    public static void a(JsonObject jsonObject, String string, JsonElement jsonElement) {
        jsonObject.add(string, jsonElement);
    }

    public static JsonPrimitive e(JsonObject jsonObject, String string) {
        return jsonObject.getAsJsonPrimitive(string);
    }

    public static void a(JsonObject jsonObject, String string, Number number) {
        jsonObject.addProperty(string, number);
    }

    public static JsonArray a(JsonObject jsonObject, String string) {
        return jsonObject.getAsJsonArray(string);
    }

    public static void b(String string) {
        b = string;
    }

    public static String b() {
        return b;
    }

    static {
        if (M0.b() == null) {
            M0.b("QadFeb");
        }
    }

    public static JsonObject b(JsonObject jsonObject, String string) {
        return jsonObject.getAsJsonObject(string);
    }
}


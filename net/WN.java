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

public class WN {
    private static String b = "IX4LLc";

    public static JsonArray g(JsonElement jsonElement) {
        return jsonElement.getAsJsonArray();
    }

    public static boolean l(JsonElement jsonElement) {
        return jsonElement.isJsonNull();
    }

    public static void b(String string) {
        b = string;
    }

    public static float i(JsonElement jsonElement) {
        return jsonElement.getAsFloat();
    }

    public static String f(JsonElement jsonElement) {
        return jsonElement.getAsString();
    }

    public static String b() {
        return b;
    }

    public static boolean a(JsonElement jsonElement) {
        return jsonElement.isJsonArray();
    }

    static {
        if (WN.b() == null) {
            WN.b("IX4LLc");
        }
    }

    public static JsonObject c(JsonElement jsonElement) {
        return jsonElement.getAsJsonObject();
    }

    public static boolean h(JsonElement jsonElement) {
        return jsonElement.isJsonObject();
    }

    public static long j(JsonElement jsonElement) {
        return jsonElement.getAsLong();
    }

    public static boolean k(JsonElement jsonElement) {
        return jsonElement.isJsonPrimitive();
    }

    public static JsonPrimitive d(JsonElement jsonElement) {
        return jsonElement.getAsJsonPrimitive();
    }

    public static int e(JsonElement jsonElement) {
        return jsonElement.getAsInt();
    }

    public static boolean b(JsonElement jsonElement) {
        return jsonElement.getAsBoolean();
    }
}


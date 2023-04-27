/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.JsonElement
 */
package net;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import java.io.Reader;
import java.lang.reflect.Type;

public class a4W {
    public static Object a(Gson gson, String string, Type type) {
        return gson.fromJson(string, type);
    }

    public static Object a(Gson gson, JsonElement jsonElement, Class clazz) {
        return gson.fromJson(jsonElement, clazz);
    }

    public static Object a(Gson gson, Reader reader, Class clazz) {
        return gson.fromJson(reader, clazz);
    }

    public static String a(Gson gson, JsonElement jsonElement) {
        return gson.toJson(jsonElement);
    }

    public static Object a(Gson gson, JsonElement jsonElement, Type type) {
        return gson.fromJson(jsonElement, type);
    }

    public static Object a(Gson gson, String string, Class clazz) {
        return gson.fromJson(string, clazz);
    }

    public static JsonElement b(Gson gson, Object object) {
        return gson.toJsonTree(object);
    }

    public static Object a(Gson gson, Reader reader, Type type) {
        return gson.fromJson(reader, type);
    }

    public static String a(Gson gson, Object object) {
        return gson.toJson(object);
    }
}


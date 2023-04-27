/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 */
package net;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import java.util.Iterator;

public class aem {
    public static Iterator b(JsonArray jsonArray) {
        return jsonArray.iterator();
    }

    public static int a(JsonArray jsonArray) {
        return jsonArray.size();
    }

    public static JsonElement a(JsonArray jsonArray, int n) {
        return jsonArray.get(n);
    }

    public static void a(JsonArray jsonArray, JsonElement jsonElement) {
        jsonArray.add(jsonElement);
    }
}


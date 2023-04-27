/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonPrimitive
 */
package net;

import com.google.gson.JsonPrimitive;

/*
 * Renamed from net.aEt
 */
public class aet_0 {
    public static String e(JsonPrimitive jsonPrimitive) {
        return jsonPrimitive.getAsString();
    }

    public static int a(JsonPrimitive jsonPrimitive) {
        return jsonPrimitive.getAsInt();
    }

    public static boolean d(JsonPrimitive jsonPrimitive) {
        return jsonPrimitive.isNumber();
    }

    public static boolean b(JsonPrimitive jsonPrimitive) {
        return jsonPrimitive.isString();
    }

    public static boolean c(JsonPrimitive jsonPrimitive) {
        return jsonPrimitive.isBoolean();
    }
}


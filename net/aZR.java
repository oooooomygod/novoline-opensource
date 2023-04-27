/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package net;

import org.json.JSONArray;
import org.json.JSONObject;

public class aZR {
    private static boolean b;

    public static JSONObject g(JSONObject jSONObject, String string) {
        return jSONObject.getJSONObject(string);
    }

    public static String d(JSONObject jSONObject, String string) {
        return jSONObject.getString(string);
    }

    public static JSONObject a(JSONObject jSONObject, String string, Object object) {
        return jSONObject.put(string, object);
    }

    public static boolean c(JSONObject jSONObject, String string) {
        return jSONObject.isNull(string);
    }

    public static JSONObject a(JSONObject jSONObject, String string, boolean bl) {
        return jSONObject.put(string, bl);
    }

    static {
        if (!aZR.a()) {
            aZR.b(true);
        }
    }

    public static boolean b(JSONObject jSONObject, String string) {
        return jSONObject.getBoolean(string);
    }

    public static int f(JSONObject jSONObject, String string) {
        return jSONObject.getInt(string);
    }

    public static Object e(JSONObject jSONObject, String string) {
        return jSONObject.get(string);
    }

    public static void b(boolean bl) {
        b = bl;
    }

    public static boolean b() {
        return b;
    }

    public static JSONArray a(JSONObject jSONObject, String string) {
        return jSONObject.getJSONArray(string);
    }

    public static boolean a() {
        aZR.b();
        return true;
    }
}


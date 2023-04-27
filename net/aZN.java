/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package net;

import com.google.gson.JsonObject;

public abstract class aZN {
    public int d;
    private static String b;
    public JsonObject c = new JsonObject();

    public abstract JsonObject a();

    static {
        if (aZN.c() != null) {
            aZN.b("tDA9Mb");
        }
    }

    public static String c() {
        return b;
    }

    public abstract aZN a(JsonObject var1);

    public abstract void b();

    public static void b(String string) {
        b = string;
    }
}


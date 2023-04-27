/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.http.client.methods.HttpGet
 */
package net;

import org.apache.http.client.methods.HttpGet;

public class Y2 {
    private static String[] b;

    public static void b(String[] stringArray) {
        b = stringArray;
    }

    public static void a(HttpGet httpGet, String string, String string2) {
        httpGet.setHeader(string, string2);
    }

    static {
        if (Y2.b() == null) {
            Y2.b(new String[4]);
        }
    }

    public static String[] b() {
        return b;
    }
}


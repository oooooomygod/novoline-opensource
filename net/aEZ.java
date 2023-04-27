/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.reflect.TypeToken
 */
package net;

import com.google.gson.reflect.TypeToken;

public class aEZ {
    private static boolean b;

    public static boolean b() {
        return b;
    }

    public static void b(boolean bl) {
        b = bl;
    }

    public static boolean c() {
        aEZ.b();
        return true;
    }

    static {
        if (aEZ.c()) {
            aEZ.b(true);
        }
    }

    public static Class a(TypeToken typeToken) {
        return typeToken.getRawType();
    }
}


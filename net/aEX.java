/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.skidunion.L;

public class aEX {
    private static int b;

    public static void b(int n) {
        b = n;
    }

    static {
        if (aEX.c() != 0) {
            aEX.b(80);
        }
    }

    public static String a(String string, String string2, String string3) {
        return L.a(string, string2, string3);
    }

    public static int b() {
        return b;
    }

    public static String b(String string, String string2, String string3) {
        return L.b(string, string2, string3);
    }

    public static int c() {
        aEX.b();
        return 54;
    }
}


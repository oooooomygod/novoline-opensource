/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.skidunion.S;

public class aQ_ {
    private static int b;

    static {
        if (aQ_.c() == 0) {
            aQ_.b(126);
        }
    }

    public static void b(int n) {
        b = n;
    }

    public static String b(S s, String string) {
        return s.b(string);
    }

    public static int c() {
        aQ_.b();
        return 85;
    }

    public static String a(S s, String string) {
        return s.a(string);
    }

    public static int b() {
        return b;
    }
}


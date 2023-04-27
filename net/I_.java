/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.aqx_2;

public class I_ {
    private static String[] b;

    public static void a(aqx_2 aqx_22, double d) {
        aqx_22.b(d);
    }

    public static void b(String[] stringArray) {
        b = stringArray;
    }

    public static double b(aqx_2 aqx_22) {
        return aqx_22.o();
    }

    public static void a(aqx_2 aqx_22, boolean bl) {
        aqx_22.c(bl);
    }

    static {
        if (I_.b() != null) {
            I_.b(new String[4]);
        }
    }

    public static void b(aqx_2 aqx_22, double d) {
        aqx_22.c(d);
    }

    public static void c(aqx_2 aqx_22, double d) {
        aqx_22.a(d);
    }

    public static double d(aqx_2 aqx_22) {
        return aqx_22.m();
    }

    public static double a(aqx_2 aqx_22) {
        return aqx_22.f();
    }

    public static String[] b() {
        return b;
    }

    public static boolean c(aqx_2 aqx_22) {
        return aqx_22.k();
    }
}


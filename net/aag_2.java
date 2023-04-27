/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.skidunion.Protection;

/*
 * Renamed from net.aag
 */
public class aag_2 {
    private static boolean b;

    static {
        if (aag_2.a()) {
            aag_2.b(true);
        }
    }

    public static boolean a() {
        aag_2.b();
        return true;
    }

    public static boolean b(Protection protection) {
        return protection.e();
    }

    public static boolean b() {
        return b;
    }

    public static boolean c(Protection protection) {
        return protection.k();
    }

    public static void b(boolean bl) {
        b = bl;
    }

    public static String a(Protection protection) {
        return protection.g();
    }

    public static void d(Protection protection) {
        protection.f();
    }

    public static void a(Protection protection, Object object) {
        protection.a(object);
    }

    public static void a(Protection protection, String string) {
        protection.a(string);
    }
}


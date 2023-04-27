/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.agt_1;

/*
 * Renamed from net.ua
 */
public class ua_2 {
    private static boolean b;

    public static int a(int n, double d) {
        return agt_1.a(n, d);
    }

    public static void b(boolean bl) {
        b = bl;
    }

    public static int a(int n) {
        return agt_1.b(n);
    }

    static {
        if (!ua_2.a()) {
            ua_2.b(true);
        }
    }

    public static boolean a() {
        ua_2.b();
        return true;
    }

    public static int b(int n) {
        return agt_1.a(n);
    }

    public static int b(int n, double d) {
        return agt_1.b(n, d);
    }

    public static void a(double d) {
        agt_1.a(d);
    }

    public static double[] a(double d, double d2) {
        return agt_1.a(d, d2);
    }

    public static double a(boolean bl) {
        return agt_1.a(bl);
    }

    public static boolean b() {
        return b;
    }
}


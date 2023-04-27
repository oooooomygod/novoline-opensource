/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.ahe_1;

/*
 * Renamed from net.abe
 */
public class abe_2 {
    private static int b;

    static {
        if (abe_2.b() != 0) {
            abe_2.b(103);
        }
    }

    public static void b(int n) {
        b = n;
    }

    public static float a(ahe_1 ahe_12) {
        return ahe_12.b();
    }

    public static int b() {
        return b;
    }

    public static void a(ahe_1 ahe_12, boolean bl) {
        ahe_12.c(bl);
    }

    public static int c() {
        abe_2.b();
        return 29;
    }

    public static void b(ahe_1 ahe_12) {
        ahe_12.d();
    }
}


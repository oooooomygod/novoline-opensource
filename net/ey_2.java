/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.skidunion.ay;

/*
 * Renamed from net.ey
 */
public class ey_2 {
    private static boolean b;

    public static boolean b() {
        return b;
    }

    static {
        if (ey_2.b()) {
            ey_2.b(true);
        }
    }

    public static boolean a() {
        ey_2.b();
        return true;
    }

    public static String a(ay ay2) {
        return ay2.c();
    }

    public static void b(boolean bl) {
        b = bl;
    }
}


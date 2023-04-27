/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.ah6_0;
import net.ayb_0;

/*
 * Renamed from net.c
 */
public class c_0 {
    private static boolean b;

    public static void b(boolean bl) {
        b = bl;
    }

    static {
        if (!c_0.a()) {
            c_0.b(true);
        }
    }

    public static boolean b() {
        return b;
    }

    public static ayb_0 a(ah6_0 ah6_02, ayb_0 ayb_02) {
        return ah6_02.a(ayb_02);
    }

    public static boolean a() {
        c_0.b();
        return true;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.awv_1;
import net.k_0;

/*
 * Renamed from net.Wn
 */
public class wn_0 {
    private static boolean b;

    public static k_0 b(awv_1 awv_12) {
        return awv_12.b();
    }

    public static boolean b() {
        return b;
    }

    public static boolean a() {
        wn_0.b();
        return true;
    }

    static {
        if (wn_0.a()) {
            wn_0.b(true);
        }
    }

    public static void b(boolean bl) {
        b = bl;
    }

    public static String a(awv_1 awv_12) {
        return awv_12.a();
    }
}


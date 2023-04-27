/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.skidunion.u_0;

public class aVU {
    private static int[] b;

    static {
        if (aVU.b() != null) {
            aVU.b(new int[3]);
        }
    }

    public static int[] b() {
        return b;
    }

    public static void b(int[] nArray) {
        b = nArray;
    }

    public static String b(u_0 u_02) {
        return u_02.b();
    }

    public static boolean a(u_0 u_02) {
        return u_02.a();
    }

    public static void a(u_0 u_02, boolean bl) {
        u_02.a(bl);
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.xv_1;

/*
 * Renamed from net.Ie
 */
public class ie_0 {
    private static int[] b;

    public static int d(xv_1 xv_12) {
        return xv_12.b();
    }

    public static void b(int[] nArray) {
        b = nArray;
    }

    static {
        if (ie_0.b() == null) {
            ie_0.b(new int[1]);
        }
    }

    public static double c(xv_1 xv_12) {
        return xv_12.d();
    }

    public static double a(xv_1 xv_12) {
        return xv_12.a();
    }

    public static double b(xv_1 xv_12) {
        return xv_12.c();
    }

    public static int[] b() {
        return b;
    }

    public static void a(xv_1 xv_12, int n) {
        xv_12.a(n);
    }
}


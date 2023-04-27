/*
 * Decompiled with CFR 0.152.
 */
package net;

/*
 * Renamed from net.v5
 */
public class v5_0 {
    private static int[] a = new int[65536];

    public static int a(double d, double d2) {
        int n = (int)((1.0 - (d2 *= d)) * 255.0);
        int n2 = (int)((1.0 - d) * 255.0);
        int n3 = n << 8 | n2;
        return n3 > a.length ? -65281 : a[n3];
    }

    public static void a(int[] nArray) {
        a = nArray;
    }
}


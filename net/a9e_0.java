/*
 * Decompiled with CFR 0.152.
 */
package net;

/*
 * Renamed from net.a9e
 */
public class a9e_0 {
    private static int[] a = new int[65536];

    public static int c() {
        return 4764952;
    }

    public static int a(double d, double d2) {
        int n = (int)((1.0 - d) * 255.0);
        int n2 = (int)((1.0 - (d2 *= d)) * 255.0);
        return a[n2 << 8 | n];
    }

    public static int b() {
        return 8431445;
    }

    public static void a(int[] nArray) {
        a = nArray;
    }

    public static int a() {
        return 0x619961;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.acR
 */
public class acr_0 {
    private static long b = a1c.a(2652016447468850655L, 1280568109202666307L, null).a(132918455212978L);
    private static String c = "variant";
    public static String a = "variant";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x5E5A0150ECF0L;
        long l5 = l4 ^ 0x356EE83ECBC7L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 40);
        int cfr_ignored_2 = (int)(l5 << 56 >>> 56);
        char[] cArray = "B</\u0000\\;%".toCharArray();
        int n = 0;
        int n2 = 74;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x7E));
            n2 = n2;
        }
    }

    public static void b(int n, int n2, byte by) {
        long cfr_ignored_0 = ((long)n << 32 | (long)n2 << 40 >>> 32 | (long)by << 56 >>> 56) ^ b;
        a = c;
    }
}


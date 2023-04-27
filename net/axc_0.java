/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.aXc
 */
public class axc_0 {
    private static String c = "Basic";
    private static long b = a1c.a(8838289186198951133L, 2029477901336918024L, null).a(50783340537450L);
    public static String a = "Basic";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0xA3E9538F0B0L;
        long l5 = l4 ^ 0x1D6C3A350E22L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 40);
        int cfr_ignored_2 = (int)(l5 << 56 >>> 56);
        char[] cArray = "J\u0005ycx".toCharArray();
        int n = 0;
        int n2 = 12;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 4));
            n2 = n2;
        }
    }

    public static void b(int n, int n2, byte by) {
        long cfr_ignored_0 = ((long)n << 32 | (long)n2 << 40 >>> 32 | (long)by << 56 >>> 56) ^ b;
        a = c;
    }
}


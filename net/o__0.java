/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.o_
 */
public class o__0 {
    private static long b = a1c.a(-8463168989143398808L, 6207886836335181529L, null).a(233189338827302L);
    public static String a = " M";
    private static String c = " M";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x5FC40B2D463L;
        long l5 = l4 ^ 0x42011E5B0DE9L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 56);
        int cfr_ignored_2 = (int)(l5 << 40 >>> 40);
        char[] cArray = "|Q".toCharArray();
        int n = 0;
        int n2 = 35;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x7F));
            n2 = n2;
        }
    }

    public static void b(int n, byte by, int n2) {
        long cfr_ignored_0 = ((long)n << 32 | (long)by << 56 >>> 32 | (long)n2 << 40 >>> 40) ^ b;
        a = c;
    }
}


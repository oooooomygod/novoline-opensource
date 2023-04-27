/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class atW {
    private static long b = a1c.a(4522773332614710839L, 389794576904336332L, null).a(231099488387193L);
    public static String a = "Drew: {}";
    private static String c = "Drew: {}";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x1D97AEC958A8L;
        long l5 = l4 ^ 0x7BFFB8F39DF8L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        long cfr_ignored_1 = l5 << 32 >>> 32;
        char[] cArray = "SQ\u0004\u0017Lh(j".toCharArray();
        int n = 0;
        int n2 = 71;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x50));
            n2 = n2;
        }
    }

    public static void b(int n, long l4) {
        long cfr_ignored_0 = ((long)n << 32 | l4 << 32 >>> 32) ^ b;
        a = c;
    }
}


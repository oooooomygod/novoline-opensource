/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.a9f
 */
public class a9f_0 {
    private static String c = "username";
    public static String a = "username";
    private static long b = a1c.a(4270534541197540599L, 597585699670796604L, null).a(279079797013244L);

    public static void b(long l4, byte by) {
        long cfr_ignored_0 = (l4 << 8 | (long)by << 56 >>> 56) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x7B636B9B6C35L;
        long l5 = l4 ^ 0x26181BFD41FBL;
        long cfr_ignored_0 = l5 >>> 8;
        int cfr_ignored_1 = (int)(l5 << 56 >>> 56);
        char[] cArray = "XFR\u0000\r\u0015SH".toCharArray();
        int n = 0;
        int n2 = 94;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x73));
            n2 = n2;
        }
    }
}


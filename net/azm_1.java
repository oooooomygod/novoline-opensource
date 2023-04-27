/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.azM
 */
public class azm_1 {
    private static long b = a1c.a(-4419263187768671630L, 3576147865716797950L, null).a(153235777321815L);
    private static String c = "message";
    public static String a = "message";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x61BF9E090F5CL;
        long l5 = l4 ^ 0xD4AE9E1007AL;
        int cfr_ignored_0 = (int)(l5 >>> 56);
        int cfr_ignored_1 = (int)(l5 << 8 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 40 >>> 40);
        char[] cArray = "z\u000fhI~nq".toCharArray();
        int n = 0;
        int n2 = 53;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x22));
            n2 = n2;
        }
    }

    public static void b(byte by, int n, int n2) {
        long cfr_ignored_0 = ((long)by << 56 | (long)n << 32 >>> 8 | (long)n2 << 40 >>> 40) ^ b;
        a = c;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.api
 */
public class api_2 {
    public static String a = "Idling...";
    private static long b = a1c.a(-239857398270935938L, -3753840300028138008L, null).a(198731005701114L);
    private static String c = "Idling...";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x239919C35AFDL;
        long l5 = l4 ^ 0x6352F7F8BEEDL;
        long cfr_ignored_0 = l5 >>> 8;
        int cfr_ignored_1 = (int)(l5 << 56 >>> 56);
        char[] cArray = "\u0011;#<B{Evq".toCharArray();
        int n = 0;
        int n2 = 4;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x5C));
            n2 = n2;
        }
    }

    public static void b(long l4, byte by) {
        long cfr_ignored_0 = (l4 << 8 | (long)by << 56 >>> 56) ^ b;
        a = c;
    }
}


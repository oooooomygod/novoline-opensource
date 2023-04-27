/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.wz
 */
public class wz_2 {
    private static long b = a1c.a(-5338991906198145280L, -7988196258716864982L, null).a(216466565807779L);
    private static String c = "Netty Local Client IO #%d";
    public static String a = "Netty Local Client IO #%d";

    public static void b(char c, long l4) {
        long cfr_ignored_0 = ((long)c << 48 | l4 << 16 >>> 16) ^ b;
        a = wz_2.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x48B12E7CCDABL;
        long l5 = l4 ^ 0x43E433F1BB26L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        long cfr_ignored_1 = l5 << 16 >>> 16;
        char[] cArray = "\u0012E3h0*13C&piI\u00115E)hiC2|\u0003bx".toCharArray();
        int n = 0;
        int n2 = 62;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x62));
            n2 = n2;
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.avw
 */
public class avw_2 {
    private static long b = a1c.a(1624939180028463067L, -4277364776716664554L, null).a(89712814163249L);
    private static String c = "Not implemented";
    public static String a = "Not implemented";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x12D0EEB5B342L;
        long l5 = l4 ^ 0x295A456E2FD3L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "\bDM\u00113Az*NTT4Xo\"".toCharArray();
        int n = 0;
        int n2 = 54;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x70));
            n2 = n2;
        }
    }

    public static void b(int n, char c, char c2) {
        long cfr_ignored_0 = ((long)n << 32 | (long)c << 48 >>> 32 | (long)c2 << 48 >>> 48) ^ b;
        a = avw_2.c;
    }
}


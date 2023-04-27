/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.kk
 */
public class kk_2 {
    public static String a = "commands.generic.snytax";
    private static String c = "commands.generic.snytax";
    private static long b = a1c.a(2443363785540302757L, -1682356184025568513L, null).a(68196907726227L);

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x404D26BAC18DL;
        long l5 = l4 ^ 0x1200D06115L;
        long cfr_ignored_0 = l5 >>> 16;
        int cfr_ignored_1 = (int)(l5 << 48 >>> 48);
        char[] cArray = "\"G.W\u00044+2\u0006$_\u000b?=(KmI\u000b#; P".toCharArray();
        int n = 0;
        int n2 = 105;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x28));
            n2 = n2;
        }
    }

    public static void b(long l4, char c) {
        long cfr_ignored_0 = (l4 << 16 | (long)c << 48 >>> 48) ^ b;
        a = kk_2.c;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.aqG
 */
public class aqg_1 {
    private static long b = a1c.a(-789248326570134948L, 480491514930227170L, null).a(57900517834737L);
    private static String c = "dig.wood";
    public static String a = "dig.wood";

    public static void b(long l4, byte by) {
        long cfr_ignored_0 = (l4 << 8 | (long)by << 56 >>> 56) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x15CDFA7C34EL;
        long l5 = l4 ^ 0x1CF7524E8EF1L;
        long cfr_ignored_0 = l5 >>> 8;
        int cfr_ignored_1 = (int)(l5 << 56 >>> 56);
        char[] cArray = "Nv2f;+QN".toCharArray();
        int n = 0;
        int n2 = 6;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x2C));
            n2 = n2;
        }
    }
}


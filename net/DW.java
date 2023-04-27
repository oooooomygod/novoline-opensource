/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class DW {
    private static long b = a1c.a(2093391948733229104L, 8756938980818574091L, null).a(233304861630852L);
    private static String c = " Spikes";
    public static String a = " Spikes";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x4F7D25581F5DL;
        long l5 = l4 ^ 0x2A0241820C87L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "\u001ciI\u0019`$`".toCharArray();
        int n = 0;
        int n2 = 87;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x6B));
            n2 = n2;
        }
    }

    public static void b(int n, short s, int n2) {
        long cfr_ignored_0 = ((long)n << 32 | (long)s << 48 >>> 32 | (long)n2 << 48 >>> 48) ^ b;
        a = c;
    }
}


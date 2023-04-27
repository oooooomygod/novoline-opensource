/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class E9 {
    public static String a = "color";
    private static String c = "color";
    private static long b = a1c.a(-1231734559962303911L, 2504566824714228948L, null).a(8833374273072L);

    public static void b(char c, long l4) {
        long cfr_ignored_0 = ((long)c << 48 | l4 << 16 >>> 16) ^ b;
        a = E9.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x3A2DA293E60BL;
        long l5 = l4 ^ 0x58C822AFF747L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        long cfr_ignored_1 = l5 << 16 >>> 16;
        char[] cArray = "\u0013\u000e\u0011?G".toCharArray();
        int n = 0;
        int n2 = 69;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x35));
            n2 = n2;
        }
    }
}


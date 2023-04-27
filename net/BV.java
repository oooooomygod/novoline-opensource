/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class BV {
    private static long b = a1c.a(1928269303169436104L, 5557780604325091507L, null).a(56292057341393L);
    private static String c = "java.skidders";
    public static String a = "java.skidders";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x5031E6BDF1F5L;
        long l5 = l4 ^ 0xE24E896ADCEL;
        long cfr_ignored_0 = l5 >>> 16;
        int cfr_ignored_1 = (int)(l5 << 48 >>> 48);
        char[] cArray = "y\u0006G\u00199 Wz\u0003U\u001de ".toCharArray();
        int n = 0;
        int n2 = 109;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x7E));
            n2 = n2;
        }
    }

    public static void b(long l4, char c) {
        long cfr_ignored_0 = (l4 << 16 | (long)c << 48 >>> 48) ^ b;
        a = BV.c;
    }
}


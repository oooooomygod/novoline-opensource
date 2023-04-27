/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class F6 {
    private static String c = "dummy";
    private static long b = a1c.a(-87913215164484048L, 5201634721133375262L, null).a(208911155336586L);
    public static String a = "dummy";

    public static void b(short s, int n, int n2) {
        long cfr_ignored_0 = ((long)s << 48 | (long)n << 32 >>> 16 | (long)n2 << 48 >>> 48) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x33CD99472466L;
        long l5 = l4 ^ 0x148532281D69L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "l|a\u0006R".toCharArray();
        int n = 0;
        int n2 = 55;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x3F));
            n2 = n2;
        }
    }
}


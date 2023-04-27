/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class a6T {
    private static String c = "color";
    public static String a = "color";
    private static long b = a1c.a(-4304056845132017767L, -5394525835545678625L, null).a(81832213157022L);

    public static void b(byte by, int n, int n2) {
        long cfr_ignored_0 = ((long)by << 56 | (long)n << 32 >>> 8 | (long)n2 << 40 >>> 40) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x630E4C90EC44L;
        long l5 = l4 ^ 0x6677A376938AL;
        int cfr_ignored_0 = (int)(l5 >>> 56);
        int cfr_ignored_1 = (int)(l5 << 8 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 40 >>> 40);
        char[] cArray = "\u001a\u001fdOA".toCharArray();
        int n = 0;
        int n2 = 75;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x32));
            n2 = n2;
        }
    }
}


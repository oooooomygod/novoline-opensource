/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class aNX {
    private static long b = a1c.a(-852215515470492919L, -1692372682099218981L, null).a(246478560726925L);
    public static String a = "name";
    private static String c = "name";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x87C1619139DL;
        long l5 = l4 ^ 0x7C5778A5B3E8L;
        int cfr_ignored_0 = (int)(l5 >>> 56);
        int cfr_ignored_1 = (int)(l5 << 8 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 40 >>> 40);
        char[] cArray = "\u001d}Q\u0000".toCharArray();
        int n = 0;
        int n2 = 90;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x29));
            n2 = n2;
        }
    }

    public static void b(byte by, int n, int n2) {
        long cfr_ignored_0 = ((long)by << 56 | (long)n << 32 >>> 8 | (long)n2 << 40 >>> 40) ^ b;
        a = c;
    }
}


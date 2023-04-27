/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class a47 {
    public static String a = "packet";
    private static long b = a1c.a(8658148338816211458L, -576208065204866321L, null).a(98187321786054L);
    private static String c = "packet";

    public static void b(char c, char c2, int n) {
        long cfr_ignored_0 = ((long)c << 48 | (long)c2 << 48 >>> 16 | (long)n << 32 >>> 32) ^ b;
        a = a47.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x40B8BA2B8518L;
        long l5 = l4 ^ 0x5E53C9E1DD47L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 32 >>> 32);
        char[] cArray = "\u0000%QK\u00044".toCharArray();
        int n = 0;
        int n2 = 43;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x5B));
            n2 = n2;
        }
    }
}


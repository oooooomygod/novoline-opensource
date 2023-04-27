/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class aPR {
    private static long b = a1c.a(-5556529073198285453L, -248386546360687072L, null).a(91321022356149L);
    public static String a = "configs";
    private static String c = "configs";

    public static void b(char c, int n, char c2) {
        long cfr_ignored_0 = ((long)c << 48 | (long)n << 32 >>> 16 | (long)c2 << 48 >>> 48) ^ b;
        a = aPR.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x3DF463B43046L;
        long l5 = l4 ^ 0x75481AA7A033L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "r\u0010pSyI]".toCharArray();
        int n = 0;
        int n2 = 86;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x47));
            n2 = n2;
        }
    }
}


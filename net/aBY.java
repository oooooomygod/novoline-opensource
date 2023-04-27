/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class aBY {
    public static String a = "variants";
    private static long b = a1c.a(6885748784892971651L, -2376329873798411741L, null).a(152555213521216L);
    private static String c = "variants";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x5B9C8BE8238DL;
        long l5 = l4 ^ 0x184E8FEE1B63L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "f<\u0000dC@Uc".toCharArray();
        int n = 0;
        int n2 = 106;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x7A));
            n2 = n2;
        }
    }

    public static void b(int n, char c, short s) {
        long cfr_ignored_0 = ((long)n << 32 | (long)c << 48 >>> 32 | (long)s << 48 >>> 48) ^ b;
        a = aBY.c;
    }
}


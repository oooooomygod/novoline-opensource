/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class aYY {
    private static long b = a1c.a(3431880874715380655L, -7455327421158010002L, null).a(19048770180848L);
    private static String c = ".mcr";
    public static String a = ".mcr";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x7918407F9E47L;
        long l5 = l4 ^ 0xB9C0274DE9EL;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "'3\"|".toCharArray();
        int n = 0;
        int n2 = 62;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x37));
            n2 = n2;
        }
    }

    public static void b(int n, short s, int n2) {
        long cfr_ignored_0 = ((long)n << 32 | (long)s << 48 >>> 32 | (long)n2 << 48 >>> 48) ^ b;
        a = c;
    }
}


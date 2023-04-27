/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class UM {
    public static String a = "Mega Spruce Taiga";
    private static long b = a1c.a(1381168635245904377L, 4226764937498595596L, null).a(86718564461986L);
    private static String c = "Mega Spruce Taiga";

    public static void b(int n, char c, int n2) {
        long cfr_ignored_0 = ((long)n << 32 | (long)c << 48 >>> 32 | (long)n2 << 48 >>> 48) ^ b;
        a = UM.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x1A66553FDDBEL;
        long l5 = l4 ^ 0x722A91E45484L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "y7\u0007\b\f:\u0007F'\u0003\f\f=\u0016]5\u0001".toCharArray();
        int n = 0;
        int n2 = 6;
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


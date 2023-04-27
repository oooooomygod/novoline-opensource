/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class aXY {
    private static String c = "self";
    private static long b = a1c.a(-8733970176658665044L, 316034130789108024L, null).a(273087973471001L);
    public static String a = "self";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x5528146E7C96L;
        long l5 = l4 ^ 0x4D94A5A76F9DL;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "<lYG".toCharArray();
        int n = 0;
        int n2 = 1;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x4E));
            n2 = n2;
        }
    }

    public static void b(char c, int n, int n2) {
        long cfr_ignored_0 = ((long)c << 48 | (long)n << 32 >>> 16 | (long)n2 << 48 >>> 48) ^ b;
        a = aXY.c;
    }
}


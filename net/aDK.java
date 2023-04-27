/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class aDK {
    private static long b = a1c.a(-9158193972631632807L, -7977704137266886551L, null).a(190597274385135L);
    private static String c = "1.8.8";
    public static String a = "1.8.8";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x51A233D2C7ABL;
        long l5 = l4 ^ 0x5247D9799D43L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "\u007f\tX!R".toCharArray();
        int n = 0;
        int n2 = 92;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x12));
            n2 = n2;
        }
    }

    public static void b(char c, int n, char c2) {
        long cfr_ignored_0 = ((long)c << 48 | (long)n << 32 >>> 16 | (long)c2 << 48 >>> 48) ^ b;
        a = aDK.c;
    }
}


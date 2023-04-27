/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class aEH {
    private static long b = a1c.a(-139800232146809471L, -7762862279172095451L, null).a(72122042768451L);
    public static String a = "knockback";
    private static String c = "knockback";

    public static void b(int n, short s, short s3) {
        long cfr_ignored_0 = ((long)n << 32 | (long)s << 48 >>> 32 | (long)s3 << 48 >>> 48) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x7B0340A44E50L;
        long l5 = l4 ^ 0x2E92190BAE1BL;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "Od\u001573\nkGa".toCharArray();
        int n = 0;
        int n2 = 99;
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


/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class aVK {
    public static String a = "jump";
    private static long b = a1c.a(-7330871192294229701L, -8194825563507454655L, null).a(271530795779246L);
    private static String c = "jump";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x2C1DFB081B0BL;
        long l5 = l4 ^ 0x196B5C5C3166L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "\u000f\u0000\u0017M".toCharArray();
        int n = 0;
        int n2 = 44;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x49));
            n2 = n2;
        }
    }

    public static void b(int n, short s, short s3) {
        long cfr_ignored_0 = ((long)n << 32 | (long)s << 48 >>> 32 | (long)s3 << 48 >>> 48) ^ b;
        a = c;
    }
}


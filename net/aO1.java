/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class aO1 {
    private static long b = a1c.a(477847444807324286L, 621578833189714927L, null).a(94326446298662L);
    public static String a = "token";
    private static String c = "token";

    public static void b(long l4, byte by) {
        long cfr_ignored_0 = (l4 << 8 | (long)by << 56 >>> 56) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x6C51C4609D48L;
        long l5 = l4 ^ 0x635FEABD96DBL;
        long cfr_ignored_0 = l5 >>> 8;
        int cfr_ignored_1 = (int)(l5 << 56 >>> 56);
        char[] cArray = "0\u0015hTe".toCharArray();
        int n = 0;
        int n2 = 111;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x2B));
            n2 = n2;
        }
    }
}


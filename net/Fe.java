/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class Fe {
    private static long b = a1c.a(-6744700900507695449L, -3609772601066463033L, null).a(84098744505780L);
    private static String c = "sprint";
    public static String a = "sprint";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x675DB2B0B803L;
        long l5 = l4 ^ 0xB9A6BFF031CL;
        long cfr_ignored_0 = l5 >>> 8;
        int cfr_ignored_1 = (int)(l5 << 56 >>> 56);
        char[] cArray = "\u001enEJ\u0006 ".toCharArray();
        int n = 0;
        int n2 = 119;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x1A));
            n2 = n2;
        }
    }

    public static void b(long l4, byte by) {
        long cfr_ignored_0 = (l4 << 8 | (long)by << 56 >>> 56) ^ b;
        a = c;
    }
}


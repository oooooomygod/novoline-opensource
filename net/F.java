/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class F {
    private static String c = "icon-";
    public static String a = "icon-";
    private static long b = a1c.a(-5978059105086279221L, -2573114660743247617L, null).a(160222782482781L);

    public static void b(int n, short s, int n2) {
        long cfr_ignored_0 = ((long)n << 32 | (long)s << 48 >>> 32 | (long)n2 << 48 >>> 48) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x3F276FE87BC9L;
        long l5 = l4 ^ 0x4780EA14AEBL;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "z5\u0001\u0005;".toCharArray();
        int n = 0;
        int n2 = 12;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x1F));
            n2 = n2;
        }
    }
}


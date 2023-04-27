/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class TD {
    private static long b = a1c.a(6930775343229593723L, -5292539928509016104L, null).a(195158625865922L);
    private static String c = " II";
    public static String a = " II";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x35D2642D0376L;
        long l5 = l4 ^ 0x7A88A38E7C82L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "/\bU".toCharArray();
        int n = 0;
        int n2 = 9;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 6));
            n2 = n2;
        }
    }

    public static void b(short s, int n, int n2) {
        long cfr_ignored_0 = ((long)s << 48 | (long)n << 32 >>> 16 | (long)n2 << 48 >>> 48) ^ b;
        a = c;
    }
}


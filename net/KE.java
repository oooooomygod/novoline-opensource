/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class KE {
    private static String c = "Value not a UUID";
    public static String a = "Value not a UUID";
    private static long b = a1c.a(4441497439278791948L, -2979482402219369568L, null).a(233874817995233L);

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x7D526AA60E51L;
        long l5 = l4 ^ 0x40BF8B183603L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 56);
        int cfr_ignored_2 = (int)(l5 << 40 >>> 40);
        char[] cArray = "\u0010>Q\u001c4\u0019:)+\u001d\bql\u0001\u000f\u001b".toCharArray();
        int n = 0;
        int n2 = 27;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x5D));
            n2 = n2;
        }
    }

    public static void b(int n, byte by, int n2) {
        long cfr_ignored_0 = ((long)n << 32 | (long)by << 56 >>> 32 | (long)n2 << 40 >>> 40) ^ b;
        a = c;
    }
}


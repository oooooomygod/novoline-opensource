/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.aCe
 */
public class ace_0 {
    private static String c = " cannot support property ";
    public static String a = " cannot support property ";
    private static long b = a1c.a(3605455212487767843L, -3013551414366973847L, null).a(191960842748384L);

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x29CE53CEE1F6L;
        long l5 = l4 ^ 0x7377063A6FC9L;
        long cfr_ignored_0 = l5 >>> 32;
        int cfr_ignored_1 = (int)(l5 << 32 >>> 32);
        char[] cArray = "\u0016%</\u0001MM\u00165(1\u001fMKBf-3\u0000R\\D2$a".toCharArray();
        int n = 0;
        int n2 = 49;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 7));
            n2 = n2;
        }
    }

    public static void b(long l4, int n) {
        long cfr_ignored_0 = (l4 << 32 | (long)n << 32 >>> 32) ^ b;
        a = c;
    }
}


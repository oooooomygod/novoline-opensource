/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.mB
 */
public class mb_0 {
    public static String a = "facing";
    private static long b = a1c.a(1569466445628089315L, 1957842747992765405L, null).a(51350012523377L);
    private static String c = "facing";

    public static void b(int n, byte by, int n2) {
        long cfr_ignored_0 = ((long)n << 32 | (long)by << 56 >>> 32 | (long)n2 << 40 >>> 40) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0xE4618DECBE6L;
        long l5 = l4 ^ 0x3BCACDEC6389L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 56);
        int cfr_ignored_2 = (int)(l5 << 40 >>> 40);
        char[] cArray = "m<T'*\u007f".toCharArray();
        int n = 0;
        int n2 = 39;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x2C));
            n2 = n2;
        }
    }
}


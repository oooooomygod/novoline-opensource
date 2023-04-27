/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class aF7 {
    private static String c = "ChunkNibbleArrays should be 2048 bytes not: ";
    public static String a = "ChunkNibbleArrays should be 2048 bytes not: ";
    private static long b = a1c.a(-322662879209875385L, 5811980351141563156L, null).a(121243753843203L);

    public static void b(char c, int n, short s) {
        long cfr_ignored_0 = ((long)c << 48 | (long)n << 32 >>> 16 | (long)s << 48 >>> 48) ^ b;
        a = aF7.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x49048A8EE227L;
        long l5 = l4 ^ 0x7557592E92CBL;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "2A2J\tTm\u0013K+A#hv\u0010P4\u0004\u0011rk\u0004E#\u0004\u0000\u007f$C\u0019s\u001cBx}\u0005L4\u0004\fupK\t".toCharArray();
        int n = 0;
        int n2 = 90;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x2B));
            n2 = n2;
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.dc
 */
public class dc_1 {
    public static String a = "untouching";
    private static String c = "untouching";
    private static long b = a1c.a(2956417715652477305L, 7432973340999452270L, null).a(145231587913072L);

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x251D4EB03EDEL;
        long l5 = l4 ^ 0x6D3A34D7677EL;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 32);
        char[] cArray = "\u001cI\"*0z\f\u0000I1".toCharArray();
        int n = 0;
        int n2 = 19;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x7A));
            n2 = n2;
        }
    }

    public static void b(int n, int n2) {
        long cfr_ignored_0 = ((long)n << 32 | (long)n2 << 32 >>> 32) ^ b;
        a = c;
    }
}


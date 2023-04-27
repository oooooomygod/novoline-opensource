/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.air
 */
public class air_2 {
    private static long b = a1c.a(-1358456206925387314L, 2333017874318105328L, null).a(262041538746771L);
    public static String a = "resourcePack.available.title";
    private static String c = "resourcePack.available.title";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x4A16D8C640BBL;
        long l5 = l4 ^ 0x2FCEC2EA9B0EL;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 40);
        int cfr_ignored_2 = (int)(l5 << 56 >>> 56);
        char[] cArray = "\u007f?)$M3'h\n;(So%{;3'Y#(ht.\"L-!".toCharArray();
        int n = 0;
        int n2 = 11;
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

    public static void b(int n, int n2, byte by) {
        long cfr_ignored_0 = ((long)n << 32 | (long)n2 << 40 >>> 32 | (long)by << 56 >>> 56) ^ b;
        a = c;
    }
}


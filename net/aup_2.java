/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.aup
 */
public class aup_2 {
    private static long b = a1c.a(5550376396624784791L, -8156799421699898647L, null).a(3894054893518L);
    public static String a = "arrowDamage";
    private static String c = "arrowDamage";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x69864A6F3310L;
        long l5 = l4 ^ 0x5536EDEFD679L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "aV%T\u0002XBmE0^".toCharArray();
        int n = 0;
        int n2 = 27;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x1B));
            n2 = n2;
        }
    }

    public static void b(int n, int n2, char c) {
        long cfr_ignored_0 = ((long)n << 32 | (long)n2 << 48 >>> 32 | (long)c << 48 >>> 48) ^ b;
        a = aup_2.c;
    }
}


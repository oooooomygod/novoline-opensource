/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.aqE
 */
public class aqe_1 {
    public static String a = "message";
    private static long b = a1c.a(-2070137976245585471L, -3688552739017646402L, null).a(133892718628112L);
    private static String c = "message";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x574C003A6367L;
        long l5 = l4 ^ 0x7E56141CE055L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "z7+-\u0007O]".toCharArray();
        int n = 0;
        int n2 = 27;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0xC));
            n2 = n2;
        }
    }

    public static void b(char c, int n, int n2) {
        long cfr_ignored_0 = ((long)c << 48 | (long)n << 32 >>> 16 | (long)n2 << 48 >>> 48) ^ b;
        a = aqe_1.c;
    }
}


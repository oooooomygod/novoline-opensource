/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.qY
 */
public class qy_1 {
    private static String c = "0x02";
    private static long b = a1c.a(-2412900640086958448L, -3841721925368228397L, null).a(194179324629167L);
    public static String a = "0x02";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x5E913A0468F9L;
        long l5 = l4 ^ 0x65680D06E82AL;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "JhsX".toCharArray();
        int n = 0;
        int n2 = 75;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x31));
            n2 = n2;
        }
    }

    public static void b(int n, char c, char c2) {
        long cfr_ignored_0 = ((long)n << 32 | (long)c << 48 >>> 32 | (long)c2 << 48 >>> 48) ^ b;
        a = qy_1.c;
    }
}


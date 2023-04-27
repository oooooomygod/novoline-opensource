/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.aab
 */
public class aab_2 {
    private static long b = a1c.a(-5454008162590984222L, 6352769461167246238L, null).a(56083313175320L);
    public static String a = "Map colour ID must be between 0 and 63 (inclusive)";
    private static String c = "Map colour ID must be between 0 and 63 (inclusive)";

    public static void b(int n, int n2, byte by) {
        long cfr_ignored_0 = ((long)n << 32 | (long)n2 << 40 >>> 32 | (long)by << 56 >>> 56) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x53B79B773A2FL;
        long l5 = l4 ^ 0x59BB98AFE7D1L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 40);
        int cfr_ignored_2 = (int)(l5 << 56 >>> 56);
        char[] cArray = " #A\u0019_\u000eX\u00027C\u0019u%\u0014\u00007BM\u001c\u0003QM TMK\u0004Q\u0003b\u0001\u0019]\u000fPMt\u0002\u0019\u0014\bZ\u000e.DJU\u0017QD".toCharArray();
        int n = 0;
        int n2 = 50;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x5F));
            n2 = n2;
        }
    }
}


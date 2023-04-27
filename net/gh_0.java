/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.Gh
 */
public class gh_0 {
    public static String a = "Select File to Open";
    private static String c = "Select File to Open";
    private static long b = a1c.a(2019930361744545533L, -2096890721861425028L, null).a(153675724341665L);

    public static void b(int n, int n2) {
        long cfr_ignored_0 = ((long)n << 32 | (long)n2 << 32 >>> 32) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x1D1D436F18BBL;
        long l5 = l4 ^ 0x149F7823C6DEL;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 32);
        char[] cArray = "\u0016YvVQ\b\u0013\u0003UvV\u0012\b\\esjV\\".toCharArray();
        int n = 0;
        int n2 = 64;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 5));
            n2 = n2;
        }
    }
}


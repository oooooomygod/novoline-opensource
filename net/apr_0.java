/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.aPr
 */
public class apr_0 {
    private static String c = "sneak";
    public static String a = "sneak";
    private static long b = a1c.a(5080141299422824958L, -5131885961320902814L, null).a(261229730049304L);

    public static void b(int n, char c, int n2) {
        long cfr_ignored_0 = ((long)n << 32 | (long)c << 48 >>> 32 | (long)n2 << 48 >>> 48) ^ b;
        a = apr_0.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x4C08E3B94CE8L;
        long l5 = l4 ^ 0xD7224DA19D3L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "J\u0006d_\"".toCharArray();
        int n = 0;
        int n2 = 11;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x32));
            n2 = n2;
        }
    }
}


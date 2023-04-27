/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.Kx
 */
public class kx_0 {
    private static long b = a1c.a(-2283457625560040228L, -4384418537420909605L, null).a(139175434686412L);
    public static String a = "Stop failed: ";
    private static String c = "Stop failed: ";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x153B710A8996L;
        long l5 = l4 ^ 0x6CA9B8A3DFFDL;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "kGc\u0012\u0010i\u0003Q_i\u0006\n/".toCharArray();
        int n = 0;
        int n2 = 86;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x6E));
            n2 = n2;
        }
    }

    public static void b(int n, char c, int n2) {
        long cfr_ignored_0 = ((long)n << 32 | (long)c << 48 >>> 32 | (long)n2 << 48 >>> 48) ^ b;
        a = kx_0.c;
    }
}


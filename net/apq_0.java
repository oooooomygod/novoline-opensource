/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.aPq
 */
public class apq_0 {
    private static long b = a1c.a(-4519174500574945677L, -2592281668408064401L, null).a(206044686171687L);
    private static String c = "gui.button.press";
    public static String a = "gui.button.press";

    public static void b(int n, int n2, short s) {
        long cfr_ignored_0 = ((long)n << 32 | (long)n2 << 48 >>> 32 | (long)s << 48 >>> 48) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x2292AB133CCBL;
        long l5 = l4 ^ 0x5EC5E84D3341L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "u\u0019h\u0001\u0001\u000b\u0013f\u0003o\u0001\u0013\f\u0002a\u001f".toCharArray();
        int n = 0;
        int n2 = 112;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x62));
            n2 = n2;
        }
    }
}


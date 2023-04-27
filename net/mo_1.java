/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.mO
 */
public class mo_1 {
    private static String c = "Couldn't load layered image";
    public static String a = "Couldn't load layered image";
    private static long b = a1c.a(896031785335198978L, 3435393138525152595L, null).a(57405015848320L);

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x28C8E771D34DL;
        long l5 = l4 ^ 0x7C7E39F0CB1AL;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 32 >>> 32);
        char[] cArray = "uo\u007f\u001a\u0016=0B f\u0019\u001377Zas\u0013\u00006s\u0016ig\u0017\u00156".toCharArray();
        int n = 0;
        int n2 = 99;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x55));
            n2 = n2;
        }
    }

    public static void b(char c, short s, int n) {
        long cfr_ignored_0 = ((long)c << 48 | (long)s << 48 >>> 16 | (long)n << 32 >>> 32) ^ b;
        a = mo_1.c;
    }
}


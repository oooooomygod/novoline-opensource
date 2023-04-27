/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.arq
 */
public class arq_2 {
    private static String c = "type";
    public static String a = "type";
    private static long b = a1c.a(-5346610948185661476L, -5104533034580747128L, null).a(248446747088976L);

    public static void b(int n, char c, short s) {
        long cfr_ignored_0 = ((long)n << 32 | (long)c << 48 >>> 32 | (long)s << 48 >>> 48) ^ b;
        a = arq_2.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x59B73E7A9903L;
        long l5 = l4 ^ 0x11E7F8151FE9L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "~WN`".toCharArray();
        int n = 0;
        int n2 = 64;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x4A));
            n2 = n2;
        }
    }
}


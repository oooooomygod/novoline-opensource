/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.aBt
 */
public class abt_0 {
    private static long b = a1c.a(-6268670454061601393L, 8839968582855680792L, null).a(44366168377695L);
    private static String c = "INSTANCE";
    public static String a = "INSTANCE";

    public static void b(int n, short s, char c) {
        long cfr_ignored_0 = ((long)n << 32 | (long)s << 48 >>> 32 | (long)c << 48 >>> 48) ^ b;
        a = abt_0.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x68972564BD76L;
        long l5 = l4 ^ 0x297B30D27A8CL;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "Ja=qz5\"F".toCharArray();
        int n = 0;
        int n2 = 54;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x35));
            n2 = n2;
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class UB {
    private static String c = "fire";
    private static long b = a1c.a(-3114148232412034597L, 7063591758560534755L, null).a(175331600209965L);
    public static String a = "fire";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x5597D4CEFAE5L;
        long l5 = l4 ^ 0x2C1C5F5A0564L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "w\u0005We".toCharArray();
        int n = 0;
        int n2 = 115;
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

    public static void b(int n, short s, char c) {
        long cfr_ignored_0 = ((long)n << 32 | (long)s << 48 >>> 32 | (long)c << 48 >>> 48) ^ b;
        a = UB.c;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class FS {
    private static long b = a1c.a(-2374261466934316921L, 5963586300475800280L, null).a(170541033145649L);
    public static String a = "0x03";
    private static String c = "0x03";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x5466DB794B10L;
        long l5 = l4 ^ 0x3989141BB7FFL;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 32 >>> 32);
        char[] cArray = "~6\")".toCharArray();
        int n = 0;
        int n2 = 60;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x72));
            n2 = n2;
        }
    }

    public static void b(char c, short s, int n) {
        long cfr_ignored_0 = ((long)c << 48 | (long)s << 48 >>> 16 | (long)n << 32 >>> 32) ^ b;
        a = FS.c;
    }
}


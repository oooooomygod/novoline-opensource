/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class a5J {
    private static String c = "packet_handler";
    private static long b = a1c.a(-2598921676238858405L, -2548758870806200379L, null).a(52917063195239L);
    public static String a = "packet_handler";

    public static void b(short s, char c, int n) {
        long cfr_ignored_0 = ((long)s << 48 | (long)c << 48 >>> 16 | (long)n << 32 >>> 32) ^ b;
        a = a5J.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x552059A3FB9EL;
        long l5 = l4 ^ 0x7C5EBEF8454AL;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 32 >>> 32);
        char[] cArray = ":hpg?\u00192\"h}h6\b\u001f".toCharArray();
        int n = 0;
        int n2 = 3;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x49));
            n2 = n2;
        }
    }
}


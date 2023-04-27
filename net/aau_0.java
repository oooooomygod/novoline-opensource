/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.aAu
 */
public class aau_0 {
    private static String c = "walk";
    public static String a = "walk";
    private static long b = a1c.a(778987671926648050L, 2262032952594710840L, null).a(261915288677327L);

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x1CE476FF179DL;
        long l5 = l4 ^ 0x7C25ED7C8AAAL;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        long cfr_ignored_1 = l5 << 16 >>> 16;
        char[] cArray = "\u0012$Z$".toCharArray();
        int n = 0;
        int n2 = 71;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x22));
            n2 = n2;
        }
    }

    public static void b(char c, long l4) {
        long cfr_ignored_0 = ((long)c << 48 | l4 << 16 >>> 16) ^ b;
        a = aau_0.c;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class aIM {
    private static long b = a1c.a(506110966529552309L, 4280492062670972066L, null).a(173694145878339L);
    public static String a = "AbstractGroup{color=";
    private static String c = "AbstractGroup{color=";

    public static void b(int n, short s, char c) {
        long cfr_ignored_0 = ((long)n << 32 | (long)s << 48 >>> 32 | (long)c << 48 >>> 48) ^ b;
        a = aIM.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x1CCB7DDEDDDEL;
        long l5 = l4 ^ 0x4E21FFDE8604L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "\u0004{\u0013r\u0003'x1^\u0012i\u00046`&v\fi\u0003{".toCharArray();
        int n = 0;
        int n2 = 104;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x2D));
            n2 = n2;
        }
    }
}


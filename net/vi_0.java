/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.Vi
 */
public class vi_0 {
    public static String f = "";
    public static String c = "*";
    private static long g = a1c.a(1623493914360860379L, -2601023033109298274L, null).a(133345313056028L);
    public static String e = "";
    public static String d = "";
    public static String a = "";
    private static String h = ", ";
    public static String b = ", ";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = g ^ 0x508197257DFL;
        long l5 = l4 ^ 0x67DB963E4CB4L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "w5".toCharArray();
        int n = 0;
        int n2 = 122;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x21));
            n2 = n2;
        }
    }

    public static void b(char c, int n, short s) {
        long cfr_ignored_0 = ((long)c << 48 | (long)n << 32 >>> 16 | (long)s << 48 >>> 48) ^ g;
        f = "";
        a = "";
        d = "";
        vi_0.c = "*";
        e = "";
        b = h;
    }
}


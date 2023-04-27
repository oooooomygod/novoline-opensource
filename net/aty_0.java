/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.aty
 */
public class aty_0 {
    public static String a = "";
    private static String g = "Working...";
    public static String c = "";
    public static String d = "%";
    public static String b = "Working...";
    private static long f = a1c.a(407564283995320127L, -5014762192078816202L, null).a(189389629109691L);
    public static String e = " ";

    public static void b(char c, long l4) {
        long cfr_ignored_0 = ((long)c << 48 | l4 << 16 >>> 16) ^ f;
        e = " ";
        d = "%";
        a = "";
        aty_0.c = "";
        b = g;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = f ^ 0x48C1DF8DD2DBL;
        long l5 = l4 ^ 0x6854F205E730L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        long cfr_ignored_1 = l5 << 16 >>> 16;
        char[] cArray = "_*\u0004AM(V&kX".toCharArray();
        int n = 0;
        int n2 = 112;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x78));
            n2 = n2;
        }
    }
}


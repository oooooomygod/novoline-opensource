/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.aa4
 */
public class aa4_0 {
    public static String a = "";
    public static String c = "|";
    private static long e = a1c.a(265373360439049052L, -1357496942778311805L, null).a(227480716269106L);
    public static String b = "Search";
    public static String d = "H";
    private static String f = "Search";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = e ^ 0x2C85981E6FF3L;
        long l5 = l4 ^ 0x75BB4E4225F3L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "\u0003\u001dT\u001bqx".toCharArray();
        int n = 0;
        int n2 = 57;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x69));
            n2 = n2;
        }
    }

    public static void b(short s, int n, char c) {
        long cfr_ignored_0 = ((long)s << 48 | (long)n << 32 >>> 16 | (long)c << 48 >>> 48) ^ e;
        aa4_0.c = "|";
        d = "H";
        a = "";
        b = f;
    }
}


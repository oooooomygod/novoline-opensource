/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.a8z
 */
public class a8z_0 {
    public static String k = "m";
    public static String i = "m";
    public static String g = "m";
    public static String a = "m";
    public static String f = " ";
    public static String b = " ";
    public static String h = "m";
    public static String e = " ";
    public static String l = "m";
    public static String c = " ";
    public static String d = " ";
    public static String j = "m";
    public static String o = "name";
    private static String q = "name";
    public static String n = " ";
    private static long p = a1c.a(2406371056276915023L, 1144979084757502572L, null).a(111855816989857L);
    public static String m = " ";

    public static void b(short s, int n, short s3) {
        long cfr_ignored_0 = ((long)s << 48 | (long)n << 32 >>> 16 | (long)s3 << 48 >>> 48) ^ p;
        b = " ";
        o = q;
        k = "m";
        h = "m";
        a8z_0.n = " ";
        m = " ";
        a = "m";
        l = "m";
        j = "m";
        i = "m";
        c = " ";
        g = "m";
        f = " ";
        e = " ";
        d = " ";
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = p ^ 0x7EBD9F85130DL;
        long l5 = l4 ^ 0x6D7387F19173L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "IZ\u0011 ".toCharArray();
        int n = 0;
        int n2 = 58;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x1D));
            n2 = n2;
        }
    }
}


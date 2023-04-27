/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.an5
 */
public class an5_0 {
    private static String g = "Stella ";
    public static String e = "";
    public static String b = "";
    public static String d = "";
    public static String a = "";
    public static String c = "Stella ";
    private static long f = a1c.a(1083640788266145249L, -2175607051385855697L, null).a(27265693812903L);

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = f ^ 0x465EFC343FBL;
        long l5 = l4 ^ 0x6A3BE2E8CBC2L;
        long cfr_ignored_0 = l5 >>> 8;
        int cfr_ignored_1 = (int)(l5 << 56 >>> 56);
        char[] cArray = "uZxX?\u0001~".toCharArray();
        int n = 0;
        int n2 = 118;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x50));
            n2 = n2;
        }
    }

    public static void b(long l4, byte by) {
        long cfr_ignored_0 = (l4 << 8 | (long)by << 56 >>> 56) ^ f;
        a = "";
        b = "";
        e = "";
        d = "";
        c = g;
    }
}


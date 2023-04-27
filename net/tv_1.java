/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.tV
 */
public class tv_1 {
    private static long d = a1c.a(8714182916683071869L, 7972574888880585284L, null).a(51359348839219L);
    public static String c = " ";
    private static String e = "/reg ";
    public static String b = "/reg ";
    public static String a = "";

    public static void b(int n, char c, short s) {
        long cfr_ignored_0 = ((long)n << 32 | (long)c << 48 >>> 32 | (long)s << 48 >>> 48) ^ d;
        tv_1.c = " ";
        a = "";
        b = e;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = d ^ 0x251CF10F763L;
        long l5 = l4 ^ 0x50D580617B3L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "H+}s)".toCharArray();
        int n = 0;
        int n2 = 64;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x27));
            n2 = n2;
        }
    }
}


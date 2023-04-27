/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.Tg
 */
public class tg_0 {
    public static String a = "type";
    private static String c = "type";
    private static long b = a1c.a(7831152202879198596L, -7339642693484444915L, null).a(104954197411494L);

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x4C9FFDE61651L;
        long l5 = l4 ^ 0x1730C05E6184L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "J\u0001|\u001a".toCharArray();
        int n = 0;
        int n2 = 102;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x58));
            n2 = n2;
        }
    }

    public static void b(int n, short s, short s3) {
        long cfr_ignored_0 = ((long)n << 32 | (long)s << 48 >>> 32 | (long)s3 << 48 >>> 48) ^ b;
        a = c;
    }
}


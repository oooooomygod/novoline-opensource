/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.a2h
 */
public class a2h_0 {
    private static String c = "user";
    private static long b = a1c.a(1990890220116607272L, 6171156011043971564L, null).a(32647447797672L);
    public static String a = "user";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x7A39C8A785ECL;
        long l5 = l4 ^ 0x6D37143DBCF3L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "\u000fe8b".toCharArray();
        int n = 0;
        int n2 = 60;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x46));
            n2 = n2;
        }
    }

    public static void b(short s, int n, char c) {
        long cfr_ignored_0 = ((long)s << 48 | (long)n << 32 >>> 16 | (long)c << 48 >>> 48) ^ b;
        a = a2h_0.c;
    }
}


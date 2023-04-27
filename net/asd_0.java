/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.aSd
 */
public class asd_0 {
    private static String c = "Realms-connect-task";
    private static long b = a1c.a(-6421228115686051161L, -2374763073340176397L, null).a(91854245686461L);
    public static String a = "Realms-connect-task";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x1F99C474E97AL;
        long l5 = l4 ^ 0x7507FDC5B5EFL;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 32 >>> 32);
        char[] cArray = "{\u00030y%7\rJ\t?{-'T\u0004\u00120f#".toCharArray();
        int n = 0;
        int n2 = 98;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x4B));
            n2 = n2;
        }
    }

    public static void b(short s, short s3, int n) {
        long cfr_ignored_0 = ((long)s << 48 | (long)s3 << 48 >>> 16 | (long)n << 32 >>> 32) ^ b;
        a = c;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.an2
 */
public class an2_0 {
    private static String c = "swordTrail";
    public static String a = "swordTrail";
    private static long b = a1c.a(-6751327610952411490L, -4869773737882525105L, null).a(247976113454944L);

    public static void b(short s, int n, short s3) {
        long cfr_ignored_0 = ((long)s << 48 | (long)n << 32 >>> 16 | (long)s3 << 48 >>> 48) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x313BB533AB89L;
        long l5 = l4 ^ 0x2E6B22549445L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "\u0013ZM\u0005\u0017b7\u0001DN".toCharArray();
        int n = 0;
        int n2 = 27;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x7B));
            n2 = n2;
        }
    }
}


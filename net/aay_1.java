/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.aay
 */
public class aay_1 {
    public static String a = "Key binding";
    private static long b = a1c.a(992110317553053551L, 6890650674375204375L, null).a(231740842388195L);
    private static String c = "Key binding";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x5E8930866443L;
        long l5 = l4 ^ 0x2916D613A9CBL;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "\u0012Q/n\u0016\u0015<=]8)".toCharArray();
        int n = 0;
        int n2 = 37;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x7C));
            n2 = n2;
        }
    }

    public static void b(int n, short s, short s3) {
        long cfr_ignored_0 = ((long)n << 32 | (long)s << 48 >>> 32 | (long)s3 << 48 >>> 48) ^ b;
        a = c;
    }
}


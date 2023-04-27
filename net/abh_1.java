/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.abH
 */
public class abh_1 {
    private static long b = a1c.a(-3817412447737656494L, 6165365408084927096L, null).a(134318547426410L);
    private static String c = "This is a utility class and cannot be instantiated";
    public static String a = "This is a utility class and cannot be instantiated";

    public static void b(int n, char c, short s) {
        long cfr_ignored_0 = ((long)n << 32 | (long)c << 48 >>> 32 | (long)s << 48 >>> 48) ^ b;
        a = abh_1.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x197236911EE1L;
        long l5 = l4 ^ 0x3395F9104942L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "F\tDO\u007f*\u00142\u0000\rI+*\u000b{\u0015T\u001c</\u0006a\u0012\r]1'Gq\u0000CR07Gp\u0004\rU10\u0013s\u000fYU>7\u0002v".toCharArray();
        int n = 0;
        int n2 = 77;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x5F));
            n2 = n2;
        }
    }
}


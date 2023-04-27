/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.dU
 */
public class du_1 {
    private static long b = a1c.a(8101218604904695938L, 5368791174081859689L, null).a(51799528543528L);
    private static String c = "textures/entity/spider/cave_spider.png";
    public static String a = "textures/entity/spider/cave_spider.png";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x66D53BAC2C8EL;
        long l5 = l4 ^ 0x2ECFF3570AE2L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "JC\u001bbQ\u0011LM\t\u0006xP\n]G\t\u0010fM\u0007LL\t\u0000wR\u0006vMV\nrA\u0011\u0007NH\u0004".toCharArray();
        int n = 0;
        int n2 = 71;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x79));
            n2 = n2;
        }
    }

    public static void b(int n, short s, short s3) {
        long cfr_ignored_0 = ((long)n << 32 | (long)s << 48 >>> 32 | (long)s3 << 48 >>> 48) ^ b;
        a = c;
    }
}


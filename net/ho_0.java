/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.Ho
 */
public class ho_0 {
    public static String a = "age";
    private static String c = "age";
    private static long b = a1c.a(4786850462664547358L, -6646439516906275833L, null).a(254659001884171L);

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x2968B3634A08L;
        long l5 = l4 ^ 0x7C4E8447D743L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 32 >>> 32);
        char[] cArray = "j\u0012+".toCharArray();
        int n = 0;
        int n2 = 103;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x6C));
            n2 = n2;
        }
    }

    public static void b(short s, short s3, int n) {
        long cfr_ignored_0 = ((long)s << 48 | (long)s3 << 48 >>> 16 | (long)n << 32 >>> 32) ^ b;
        a = c;
    }
}


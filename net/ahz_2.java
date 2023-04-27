/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.ahz
 */
public class ahz_2 {
    private static long b = a1c.a(327540410132019008L, 5777171191698995661L, null).a(11221648638483L);
    private static String c = "C:\\WINDOWS\\Fonts";
    public static String a = "C:\\WINDOWS\\Fonts";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x4FD8ADFDF946L;
        long l5 = l4 ^ 0x380D1BE55FB1L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "q7:h\u0000\u0005D}Z5c\u000f$nF~".toCharArray();
        int n = 0;
        int n2 = 109;
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

    public static void b(int n, short s, short s3) {
        long cfr_ignored_0 = ((long)n << 32 | (long)s << 48 >>> 32 | (long)s3 << 48 >>> 48) ^ b;
        a = c;
    }
}


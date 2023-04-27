/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.awj
 */
public class awj_2 {
    private static long b = a1c.a(1561556227367687658L, 9189223121534144073L, null).a(215531348850025L);
    public static String a = "Flower Forest";
    private static String c = "Flower Forest";

    public static void b(int n, short s, short s3) {
        long cfr_ignored_0 = ((long)n << 32 | (long)s << 48 >>> 32 | (long)s3 << 48 >>> 48) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x15AF893DCF7BL;
        long l5 = l4 ^ 0x1C6EBC79ACE4L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "ZN\u0012:C\u0001\u0006ZM\u000f(U\u0007".toCharArray();
        int n = 0;
        int n2 = 76;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x50));
            n2 = n2;
        }
    }
}


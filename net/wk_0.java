/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.Wk
 */
public class wk_0 {
    private static String c = "random.bow";
    public static String a = "random.bow";
    private static long b = a1c.a(676066230410968240L, -2699731763745379531L, null).a(277112894850252L);

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x1B80740DED5AL;
        long l5 = l4 ^ 0xC22C513425DL;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 40);
        int cfr_ignored_2 = (int)(l5 << 56 >>> 56);
        char[] cArray = "j\u0017fTT|\u007fz\u0019\u007f".toCharArray();
        int n = 0;
        int n2 = 52;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x2C));
            n2 = n2;
        }
    }

    public static void b(int n, int n2, byte by) {
        long cfr_ignored_0 = ((long)n << 32 | (long)n2 << 40 >>> 32 | (long)by << 56 >>> 56) ^ b;
        a = c;
    }
}


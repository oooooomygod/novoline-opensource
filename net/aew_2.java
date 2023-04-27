/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.aew
 */
public class aew_2 {
    private static String c = "INSTANCE";
    private static long b = a1c.a(-1762671937285611007L, -6492896058948967569L, null).a(231486494972389L);
    public static String a = "INSTANCE";

    public static void b(long l4, byte by) {
        long cfr_ignored_0 = (l4 << 8 | (long)by << 56 >>> 56) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x1D23F7EDFFBEL;
        long l5 = l4 ^ 0x1AED3DA49B13L;
        long cfr_ignored_0 = l5 >>> 8;
        int cfr_ignored_1 = (int)(l5 << 56 >>> 56);
        char[] cArray = "5:c\t34\u00169".toCharArray();
        int n = 0;
        int n2 = 33;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x5D));
            n2 = n2;
        }
    }
}


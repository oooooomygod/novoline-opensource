/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class a9M {
    public static String a = "half";
    private static long b = a1c.a(-2231873730979667195L, -332760263618892908L, null).a(38580859317847L);
    private static String c = "half";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x1F82B8420784L;
        long l5 = l4 ^ 0x306B394ECFD1L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 40);
        int cfr_ignored_2 = (int)(l5 << 56 >>> 56);
        char[] cArray = "G n_".toCharArray();
        int n = 0;
        int n2 = 63;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x10));
            n2 = n2;
        }
    }

    public static void b(int n, int n2, byte by) {
        long cfr_ignored_0 = ((long)n << 32 | (long)n2 << 40 >>> 32 | (long)by << 56 >>> 56) ^ b;
        a = c;
    }
}


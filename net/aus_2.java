/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.aus
 */
public class aus_2 {
    private static long b = a1c.a(-3303543383500100748L, 6190023019523113678L, null).a(132608923739257L);
    public static String a = "1.8.8";
    private static String c = "1.8.8";

    public static void b(byte by, int n, int n2) {
        long cfr_ignored_0 = ((long)by << 56 | (long)n << 32 >>> 8 | (long)n2 << 40 >>> 40) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x31AC40F0211CL;
        long l5 = l4 ^ 0x1BA2E3354E83L;
        int cfr_ignored_0 = (int)(l5 >>> 56);
        int cfr_ignored_1 = (int)(l5 << 8 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 40 >>> 40);
        char[] cArray = "\u0014P\n`v".toCharArray();
        int n = 0;
        int n2 = 15;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x2A));
            n2 = n2;
        }
    }
}


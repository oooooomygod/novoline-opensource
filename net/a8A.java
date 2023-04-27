/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class a8A {
    private static long b = a1c.a(318280966637898652L, -6446064713647764184L, null).a(47421575853891L);
    private static String c = " total; ";
    public static String a = " total; ";

    public static void b(int n, int n2, byte by) {
        long cfr_ignored_0 = ((long)n << 32 | (long)n2 << 40 >>> 32 | (long)by << 56 >>> 56) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x2D93D16F7112L;
        long l5 = l4 ^ 0xB368CD15299L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 40);
        int cfr_ignored_2 = (int)(l5 << 56 >>> 56);
        char[] cArray = "B\"@Lt/RB".toCharArray();
        int n = 0;
        int n2 = 70;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x24));
            n2 = n2;
        }
    }
}


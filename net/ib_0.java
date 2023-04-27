/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.Ib
 */
public class ib_0 {
    private static long b = a1c.a(9163438603006405680L, 8019222754435236461L, null).a(257234338585418L);
    public static String a = "cause";
    private static String c = "cause";

    public static void b(int n, char c, int n2) {
        long cfr_ignored_0 = ((long)n << 32 | (long)c << 48 >>> 32 | (long)n2 << 48 >>> 48) ^ b;
        a = ib_0.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x5FF6C6A30492L;
        long l5 = l4 ^ 0x6C03793FEC3EL;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "\bL&p\u0012".toCharArray();
        int n = 0;
        int n2 = 95;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x34));
            n2 = n2;
        }
    }
}


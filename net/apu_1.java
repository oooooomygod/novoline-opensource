/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.apu
 */
public class apu_1 {
    private static long b = a1c.a(7676742385009389446L, -9085163322869627299L, null).a(269812738600668L);
    private static String c = "digging";
    public static String a = "digging";

    public static void b(long l4, byte by) {
        long cfr_ignored_0 = (l4 << 8 | (long)by << 56 >>> 56) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x1F207516B9DAL;
        long l5 = l4 ^ 0x68D3534F7B04L;
        long cfr_ignored_0 = l5 >>> 8;
        int cfr_ignored_1 = (int)(l5 << 56 >>> 56);
        char[] cArray = "4\u0011==s6e".toCharArray();
        int n = 0;
        int n2 = 126;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x2E));
            n2 = n2;
        }
    }
}


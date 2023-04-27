/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.a0n
 */
public class a0n_0 {
    public static String a = "fishingSpeed";
    private static String c = "fishingSpeed";
    private static long b = a1c.a(6209979481984129861L, -2150571738380666740L, null).a(1802759613882L);

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x3CFF19E8244DL;
        long l5 = l4 ^ 0x758A1212B47BL;
        int cfr_ignored_0 = (int)(l5 >>> 56);
        long cfr_ignored_1 = l5 << 8 >>> 8;
        char[] cArray = "RAVv\u000fC7gX@{\u0002".toCharArray();
        int n = 0;
        int n2 = 124;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x48));
            n2 = n2;
        }
    }

    public static void b(byte by, long l4) {
        long cfr_ignored_0 = ((long)by << 56 | l4 << 8 >>> 8) ^ b;
        a = c;
    }
}


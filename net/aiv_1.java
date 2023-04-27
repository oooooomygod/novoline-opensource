/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.aiV
 */
public class aiv_1 {
    private static String c = "NULL";
    public static String a = "NULL";
    private static long b = a1c.a(-8436424763506140284L, -295793656591856506L, null).a(128727639824617L);

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x463DB686F1C8L;
        long l5 = l4 ^ 0x63F770F923BCL;
        int cfr_ignored_0 = (int)(l5 >>> 56);
        int cfr_ignored_1 = (int)(l5 << 8 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 40 >>> 40);
        char[] cArray = "|mCd".toCharArray();
        int n = 0;
        int n2 = 81;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x63));
            n2 = n2;
        }
    }

    public static void b(byte by, int n, int n2) {
        long cfr_ignored_0 = ((long)by << 56 | (long)n << 32 >>> 8 | (long)n2 << 40 >>> 40) ^ b;
        a = c;
    }
}


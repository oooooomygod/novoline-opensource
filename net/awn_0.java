/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.aWn
 */
public class awn_0 {
    private static long b = a1c.a(-2575354648653488298L, 5615948884286863503L, null).a(182979049561829L);
    private static String c = "mining";
    public static String a = "mining";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x11BBD878FA9FL;
        long l5 = l4 ^ 0x17BEE1A813EBL;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "Qi*m1#".toCharArray();
        int n = 0;
        int n2 = 74;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x76));
            n2 = n2;
        }
    }

    public static void b(int n, char c, short s) {
        long cfr_ignored_0 = ((long)n << 32 | (long)c << 48 >>> 32 | (long)s << 48 >>> 48) ^ b;
        a = awn_0.c;
    }
}


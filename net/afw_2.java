/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.afw
 */
public class afw_2 {
    private static String c = "layers";
    public static String a = "layers";
    private static long b = a1c.a(-519725006818756162L, -807105796934660164L, null).a(195650191887604L);

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x71C4F8423423L;
        long l5 = l4 ^ 0x3B6BD845362DL;
        long cfr_ignored_0 = l5 >>> 32;
        int cfr_ignored_1 = (int)(l5 << 32 >>> 32);
        char[] cArray = "G\u0010H\u000b_u".toCharArray();
        int n = 0;
        int n2 = 37;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0xE));
            n2 = n2;
        }
    }

    public static void b(long l4, int n) {
        long cfr_ignored_0 = (l4 << 32 | (long)n << 32 >>> 32) ^ b;
        a = c;
    }
}


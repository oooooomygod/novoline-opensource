/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class aST {
    public static String b = "[";
    private static long c = a1c.a(-4491462728901847478L, 1002331974416467300L, null).a(271658270518930L);
    private static String d = " bytes]";
    public static String a = " bytes]";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = c ^ 0x4BA63E59FFAFL;
        long l5 = l4 ^ 0x5DF5F87001B4L;
        long cfr_ignored_0 = l5 >>> 8;
        int cfr_ignored_1 = (int)(l5 << 56 >>> 56);
        char[] cArray = "\u001fT.\u001f\u0002*N".toCharArray();
        int n = 0;
        int n2 = 126;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x41));
            n2 = n2;
        }
    }

    public static void b(long l4, byte by) {
        long cfr_ignored_0 = (l4 << 8 | (long)by << 56 >>> 56) ^ c;
        a = d;
        b = "[";
    }
}


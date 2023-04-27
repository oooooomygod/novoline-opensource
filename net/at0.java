/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class at0 {
    private static String c = "INSTANCE";
    public static String a = "INSTANCE";
    private static long b = a1c.a(6461860019856200058L, 2913735222748644460L, null).a(22301293373834L);

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x619A46033D99L;
        long l5 = l4 ^ 0x4C615879C738L;
        long cfr_ignored_0 = l5 >>> 16;
        int cfr_ignored_1 = (int)(l5 << 48 >>> 48);
        char[] cArray = "\u001e>;.2gY\u0012".toCharArray();
        int n = 0;
        int n2 = 75;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x1C));
            n2 = n2;
        }
    }

    public static void b(long l4, char c) {
        long cfr_ignored_0 = (l4 << 16 | (long)c << 48 >>> 48) ^ b;
        a = at0.c;
    }
}


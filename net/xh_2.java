/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.xh
 */
public class xh_2 {
    private static long b = a1c.a(1459619533153303577L, 1233997495723549960L, null).a(242336383175273L);
    private static String c = "length wider than 21-bit";
    public static String a = "length wider than 21-bit";

    public static void b(long l4, short s) {
        long cfr_ignored_0 = (l4 << 16 | (long)s << 48 >>> 48) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x6B761D291D3FL;
        long l5 = l4 ^ 0x51CFAC4308D0L;
        long cfr_ignored_0 = l5 >>> 16;
        int cfr_ignored_1 = (int)(l5 << 48 >>> 48);
        char[] cArray = "\u0019P\u0012`pm\u0000\u0002\\\u0018bv%T\u001dT\u0012'64\r\u0017\\\b".toCharArray();
        int n = 0;
        int n2 = 72;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x3D));
            n2 = n2;
        }
    }
}


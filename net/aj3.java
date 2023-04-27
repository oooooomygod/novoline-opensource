/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class aj3 {
    public static String a = "item.fireCharge.use";
    private static long b = a1c.a(-3563740125727366350L, -2322243822556290658L, null).a(25529577181095L);
    private static String c = "item.fireCharge.use";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x2757B736B75FL;
        long l5 = l4 ^ 0xB2940749CB2L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "\u0011N\u0000V2\u0001r\n_&S}\u0015|\u001d\u0014\u0010Hy".toCharArray();
        int n = 0;
        int n2 = 93;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x25));
            n2 = n2;
        }
    }

    public static void b(int n, char c, short s) {
        long cfr_ignored_0 = ((long)n << 32 | (long)c << 48 >>> 32 | (long)s << 48 >>> 48) ^ b;
        a = aj3.c;
    }
}


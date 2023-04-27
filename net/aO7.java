/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class aO7 {
    private static long b = a1c.a(1747956273345370154L, -4895696978740373480L, null).a(110054289196912L);
    private static String c = "Use .vclip (height)";
    public static String a = "Use .vclip (height)";

    public static void b(long l4, char c) {
        long cfr_ignored_0 = (l4 << 16 | (long)c << 48 >>> 48) ^ b;
        a = aO7.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0xF409DC46EFFL;
        long l5 = l4 ^ 0x4F01CE43867EL;
        long cfr_ignored_0 = l5 >>> 16;
        int cfr_ignored_1 = (int)(l5 << 48 >>> 48);
        char[] cArray = "\u0012\u007fHO@\u0003\r+e]OF\u001d\u000b.kE\u001bG".toCharArray();
        int n = 0;
        int n2 = 65;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 6));
            n2 = n2;
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class a06 {
    private static String c = "textures/gui/container/generic_54.png";
    private static long b = a1c.a(3569846568523148191L, -8887580273858935701L, null).a(19336691256460L);
    public static String a = "textures/gui/container/generic_54.png";

    public static void b(int n, char c, short s) {
        long cfr_ignored_0 = ((long)n << 32 | (long)c << 48 >>> 32 | (long)s << 48 >>> 48) ^ b;
        a = a06.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x5820A4A9F94BL;
        long l5 = l4 ^ 0x27B2C814DC6EL;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "\u000bT#\u0016\u0003,o\f\u001e<\u0017\u001fqi\u0010_/\u0003\u001f0o\r\u001e<\u0007\u0018;x\u0016R\u0004WBpz\u0011V".toCharArray();
        int n = 0;
        int n2 = 59;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x44));
            n2 = n2;
        }
    }
}


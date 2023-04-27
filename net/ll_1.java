/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.lL
 */
public class ll_1 {
    private static long b = a1c.a(3074217617599737964L, 400801432593865493L, null).a(181764007910597L);
    public static String a = "gui.button.press";
    private static String c = "gui.button.press";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x4D001C3FD77FL;
        long l5 = l4 ^ 0x4A21B7CF0F87L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 32 >>> 32);
        char[] cArray = "9\"\u0007$Qxc*8\u0000$C\u007fr-$".toCharArray();
        int n = 0;
        int n2 = 86;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 8));
            n2 = n2;
        }
    }

    public static void b(char c, short s, int n) {
        long cfr_ignored_0 = ((long)c << 48 | (long)s << 48 >>> 16 | (long)n << 32 >>> 32) ^ b;
        a = ll_1.c;
    }
}


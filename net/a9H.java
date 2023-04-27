/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class a9H {
    public static String a = "event";
    private static String c = "event";
    private static long b = a1c.a(-8041942917017057307L, -1719671636770569403L, null).a(146244678354814L);

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x1BEDF755A3FL;
        long l5 = l4 ^ 0x7EC11C977E80L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = ")\\b\u000f'".toCharArray();
        int n = 0;
        int n2 = 120;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x34));
            n2 = n2;
        }
    }

    public static void b(char c, int n, char c2) {
        long cfr_ignored_0 = ((long)c << 48 | (long)n << 32 >>> 16 | (long)c2 << 48 >>> 48) ^ b;
        a = a9H.c;
    }
}


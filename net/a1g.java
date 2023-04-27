/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class a1g {
    private static String c = "Advanced";
    public static String a = "Advanced";
    private static long b = a1c.a(-3206276353447224511L, 856060812887541632L, null).a(276706928614813L);

    public static void b(long l4, char c) {
        long cfr_ignored_0 = (l4 << 16 | (long)c << 48 >>> 48) ^ b;
        a = a1g.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0xFA381CA3776L;
        long l5 = l4 ^ 0xC7368C8814FL;
        long cfr_ignored_0 = l5 >>> 16;
        int cfr_ignored_1 = (int)(l5 << 48 >>> 48);
        char[] cArray = ")`7AYm)\f".toCharArray();
        int n = 0;
        int n2 = 7;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x6F));
            n2 = n2;
        }
    }
}


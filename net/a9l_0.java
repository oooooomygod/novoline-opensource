/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.a9l
 */
public class a9l_0 {
    private static String c = " total; ";
    public static String a = " total; ";
    private static long b = a1c.a(-358361832907948488L, -2132666958432488656L, null).a(84205897938772L);

    public static void b(int n, char c, char c2) {
        long cfr_ignored_0 = ((long)n << 32 | (long)c << 48 >>> 32 | (long)c2 << 48 >>> 48) ^ b;
        a = a9l_0.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x3A2F5763BB51L;
        long l5 = l4 ^ 0x7D2AC678753EL;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "o4SW\u0005+\u0001o".toCharArray();
        int n = 0;
        int n2 = 30;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x51));
            n2 = n2;
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.a8m
 */
public class a8m_0 {
    private static String c = "message";
    private static long b = a1c.a(4945340810623482167L, 8900189912147910549L, null).a(14832805802221L);
    public static String a = "message";

    public static void b(char c, int n, short s) {
        long cfr_ignored_0 = ((long)c << 48 | (long)n << 32 >>> 16 | (long)s << 48 >>> 48) ^ b;
        a = a8m_0.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0xA0938E33D9CL;
        long l5 = l4 ^ 0x14969857F64CL;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "ON\u001bi<?!".toCharArray();
        int n = 0;
        int n2 = 76;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x6E));
            n2 = n2;
        }
    }
}


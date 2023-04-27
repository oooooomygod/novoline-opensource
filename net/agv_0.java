/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.aGv
 */
public class agv_0 {
    private static String c = "minecraft";
    private static long b = a1c.a(-1121748633215195271L, 6116544803623863010L, null).a(88473413532991L);
    public static String a = "minecraft";

    public static void b(char c, int n, short s) {
        long cfr_ignored_0 = ((long)c << 48 | (long)n << 32 >>> 16 | (long)s << 48 >>> 48) ^ b;
        a = agv_0.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x6EF3C7165743L;
        long l5 = l4 ^ 0x1CDEE2E43AC5L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "F\bn\u000fP\u0015MM\u0015".toCharArray();
        int n = 0;
        int n2 = 125;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x56));
            n2 = n2;
        }
    }
}


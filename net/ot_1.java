/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.oT
 */
public class ot_1 {
    private static long b = a1c.a(4443970068899632430L, -6772323205248116241L, null).a(62891951628032L);
    private static String c = "_min";
    public static String a = "_min";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x576D98BC5815L;
        long l5 = l4 ^ 0x327FA6B60E0AL;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "O\u00006q".toCharArray();
        int n = 0;
        int n2 = 6;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x16));
            n2 = n2;
        }
    }

    public static void b(int n, char c, short s) {
        long cfr_ignored_0 = ((long)n << 32 | (long)c << 48 >>> 32 | (long)s << 48 >>> 48) ^ b;
        a = ot_1.c;
    }
}


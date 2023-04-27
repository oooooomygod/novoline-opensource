/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.aQq
 */
public class aqq_0 {
    private static String c = "oxygen";
    public static String a = "oxygen";
    private static long b = a1c.a(8939469878305793191L, 3576368106156802439L, null).a(122913091569591L);

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x6349ECE35245L;
        long l5 = l4 ^ 0x9452F7D528CL;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "\u0005{tpW ".toCharArray();
        int n = 0;
        int n2 = 105;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 3));
            n2 = n2;
        }
    }

    public static void b(int n, int n2, short s) {
        long cfr_ignored_0 = ((long)n << 32 | (long)n2 << 48 >>> 32 | (long)s << 48 >>> 48) ^ b;
        a = c;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.ail
 */
public class ail_2 {
    private static String c = "mobGriefing";
    private static long b = a1c.a(479299301132792830L, -5724651179430832278L, null).a(149588237486820L);
    public static String a = "mobGriefing";

    public static void b(char c, int n, short s) {
        long cfr_ignored_0 = ((long)c << 48 | (long)n << 32 >>> 16 | (long)s << 48 >>> 48) ^ b;
        a = ail_2.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x519D1794791AL;
        long l5 = l4 ^ 0x24AD5DF7DD5CL;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "8x\u0017\u0006x4+3~\u001b&".toCharArray();
        int n = 0;
        int n2 = 31;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x4A));
            n2 = n2;
        }
    }
}


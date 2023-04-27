/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class HE {
    private static long b = a1c.a(8791326885242528619L, 1495258396264182261L, null).a(118579962812022L);
    private static String c = "mobGriefing";
    public static String a = "mobGriefing";

    public static void b(int n, char c, short s) {
        long cfr_ignored_0 = ((long)n << 32 | (long)c << 48 >>> 32 | (long)s << 48 >>> 48) ^ b;
        a = HE.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x56974D2A66DDL;
        long l5 = l4 ^ 0x7214A4256F0BL;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "&\f\u0003oOw6-\n\u000fO".toCharArray();
        int n = 0;
        int n2 = 43;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x60));
            n2 = n2;
        }
    }
}


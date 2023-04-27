/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class aEA {
    public static String a = "textures/entity/sheep/sheep.png";
    private static String c = "textures/entity/sheep/sheep.png";
    private static long b = a1c.a(-3095996487227613279L, 6775137582752817718L, null).a(102419412433789L);

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x3AA8747F7840L;
        long l5 = l4 ^ 0x1A45993AE3C9L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "j|\u0005\b:0\u001cm6\u0018\u0012;+\rg6\u000e\u0014*'\t1j\u0015\u0019*2Wnw\u001a".toCharArray();
        int n = 0;
        int n2 = 100;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x7A));
            n2 = n2;
        }
    }

    public static void b(int n, short s, int n2) {
        long cfr_ignored_0 = ((long)n << 32 | (long)s << 48 >>> 32 | (long)n2 << 48 >>> 48) ^ b;
        a = c;
    }
}


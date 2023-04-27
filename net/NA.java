/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class NA {
    private static long b = a1c.a(1172667161164360599L, -341523905136404801L, null).a(217454934519381L);
    private static String c = "variant";
    public static String a = "variant";

    public static void b(int n, int n2, char c) {
        long cfr_ignored_0 = ((long)n << 32 | (long)n2 << 48 >>> 32 | (long)c << 48 >>> 48) ^ b;
        a = NA.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x3F35B532FEE7L;
        long l5 = l4 ^ 0x6884C36984C9L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "QWW0L?<".toCharArray();
        int n = 0;
        int n2 = 19;
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
}


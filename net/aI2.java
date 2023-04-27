/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class aI2 {
    private static long b = a1c.a(-1826967226240892529L, -2952453584717355229L, null).a(264371397800275L);
    private static String c = "(Reflector) Class not present: ";
    public static String a = "(Reflector) Class not present: ";

    public static void b(int n, int n2) {
        long cfr_ignored_0 = ((long)n << 32 | (long)n2 << 32 >>> 32) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x89015D67785L;
        long l5 = l4 ^ 0x65EF6BDE0D6FL;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 32);
        char[] cArray = "WW.,(RI\u000bj9cdtF\u001ev8j*X^_u9/7RD\u000b?k".toCharArray();
        int n = 0;
        int n2 = 15;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x70));
            n2 = n2;
        }
    }
}


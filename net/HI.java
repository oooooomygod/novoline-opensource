/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class HI {
    private static String c = "SortedMapFactory{comparator=";
    public static String a = "SortedMapFactory{comparator=";
    private static long b = a1c.a(-4683462768441859247L, -232403689711649930L, null).a(59040083704321L);

    public static void b(int n, short s, char c) {
        long cfr_ignored_0 = ((long)n << 32 | (long)s << 48 >>> 32 | (long)c << 48 >>> 48) ^ b;
        a = HI.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x42186CAFBA1AL;
        long l5 = l4 ^ 0x2208E96BF31AL;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "\n]qYK\u000f*8BELM\u001f\b+KxNA\u0006\u00178@bYA\u0019Z".toCharArray();
        int n = 0;
        int n2 = 34;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x7B));
            n2 = n2;
        }
    }
}


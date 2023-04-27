/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class X3 {
    public static String a = "stand";
    private static long b = a1c.a(-1664313958944623324L, 4540119791221278134L, null).a(50308004622936L);
    private static String c = "stand";

    public static void b(long l4, char c) {
        long cfr_ignored_0 = (l4 << 16 | (long)c << 48 >>> 48) ^ b;
        a = X3.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x7C061C65FB29L;
        long l5 = l4 ^ 0x723E138868F4L;
        long cfr_ignored_0 = l5 >>> 16;
        int cfr_ignored_1 = (int)(l5 << 48 >>> 48);
        char[] cArray = "\u0006\u000f;k\u0014".toCharArray();
        int n = 0;
        int n2 = 73;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x3C));
            n2 = n2;
        }
    }
}


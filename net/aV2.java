/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class aV2 {
    private static long b = a1c.a(4243272169731113453L, -3763716683775467678L, null).a(147737326365981L);
    private static String c = "Don't know how to search for ";
    public static String a = "Don't know how to search for ";

    public static void b(int n, short s, int n2) {
        long cfr_ignored_0 = ((long)n << 32 | (long)s << 48 >>> 32 | (long)n2 << 48 >>> 48) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0xE52CCA00F1EL;
        long l5 = l4 ^ 0x14F7C516FD6L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "=\u0011\u000fJg\u0012\u0013\u0017\u0011\u0016M{]\u000fY\n\u000eM`W\u0019\u000b\u001d\tMu]\nY".toCharArray();
        int n = 0;
        int n2 = 73;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x30));
            n2 = n2;
        }
    }
}


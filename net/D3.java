/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class D3 {
    private static long b = a1c.a(7828064169358115515L, -6871575382987604909L, null).a(95865996017307L);
    public static String a = "Tried to change immutable property";
    private static String c = "Tried to change immutable property";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x75DFEB5F4183L;
        long l5 = l4 ^ 0x246CFDE844FCL;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        long cfr_ignored_1 = l5 << 32 >>> 32;
        char[] cArray = "\u001d^0\u0004\f\u000e^&\f:\t\t@M,\f0\f\u0005[^(N5\u0004H^X&\\<\u0013\u001cW".toCharArray();
        int n = 0;
        int n2 = 83;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x1A));
            n2 = n2;
        }
    }

    public static void b(int n, long l4) {
        long cfr_ignored_0 = ((long)n << 32 | l4 << 32 >>> 32) ^ b;
        a = c;
    }
}


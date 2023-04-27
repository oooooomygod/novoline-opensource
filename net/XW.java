/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class XW {
    private static String c = "INSTANCE";
    public static String a = "INSTANCE";
    private static long b = a1c.a(8062002882456356027L, 246710655962710946L, null).a(214902277637818L);

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x69F96ECA0D5L;
        long l5 = l4 ^ 0x5D2322580E8L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "S\u0016\u0012u\u0013zb_".toCharArray();
        int n = 0;
        int n2 = 3;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x19));
            n2 = n2;
        }
    }

    public static void b(char c, int n, short s) {
        long cfr_ignored_0 = ((long)c << 48 | (long)n << 32 >>> 16 | (long)s << 48 >>> 48) ^ b;
        a = XW.c;
    }
}


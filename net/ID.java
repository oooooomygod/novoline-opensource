/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class ID {
    public static String a = "username";
    private static long b = a1c.a(-3184888191644662135L, 5945818627086726790L, null).a(95692428151804L);
    private static String c = "username";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0xAF006C4B47FL;
        long l5 = l4 ^ 0x6235734FE16CL;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 56);
        int cfr_ignored_2 = (int)(l5 << 40 >>> 40);
        char[] cArray = "*\fhsJ|O:".toCharArray();
        int n = 0;
        int n2 = 93;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 2));
            n2 = n2;
        }
    }

    public static void b(int n, byte by, int n2) {
        long cfr_ignored_0 = ((long)n << 32 | (long)by << 56 >>> 32 | (long)n2 << 40 >>> 40) ^ b;
        a = c;
    }
}


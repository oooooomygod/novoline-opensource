/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class aGV {
    public static String a = "random.explode";
    private static String c = "random.explode";
    private static long b = a1c.a(-6428695153114599701L, 2084975040320771787L, null).a(31673267627559L);

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x7F34EDE3C4DEL;
        long l5 = l4 ^ 0x39476CB6AE31L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "fJ5jv\u0005GqS+bv\f\f".toCharArray();
        int n = 0;
        int n2 = 27;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0xF));
            n2 = n2;
        }
    }

    public static void b(int n, short s, char c) {
        long cfr_ignored_0 = ((long)n << 32 | (long)s << 48 >>> 32 | (long)c << 48 >>> 48) ^ b;
        a = aGV.c;
    }
}


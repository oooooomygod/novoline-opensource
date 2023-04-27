/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class aLJ {
    private static long b = a1c.a(-5671339378791037695L, 3174185308281652297L, null).a(145001463533855L);
    private static String c = "resourcePack.selected.title";
    public static String a = "resourcePack.selected.title";

    public static void b(int n, short s, short s3) {
        long cfr_ignored_0 = ((long)n << 32 | (long)s << 48 >>> 32 | (long)s3 << 48 >>> 48) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x2B9BAA2BCE1DL;
        long l5 = l4 ^ 0x4ABE9A5584A2L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "\u001cU\u007f\u001b\u007fgO\u000b`m\u0017a;_\u000b\\i\u0017~pH@De\u0000fp".toCharArray();
        int n = 0;
        int n2 = 16;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x7E));
            n2 = n2;
        }
    }
}


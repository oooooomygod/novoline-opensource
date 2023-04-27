/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class aKC {
    public static String a = "mob.villager";
    private static long b = a1c.a(-5700642847817623169L, -1692017995699781073L, null).a(240668545237354L);
    private static String c = "mob.villager";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x3BF975ACDD51L;
        long l5 = l4 ^ 0x61E3C45DA540L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        long cfr_ignored_1 = l5 << 16 >>> 16;
        char[] cArray = "\b\u0011\u000egl\u001f \t\u001f\u000b,h".toCharArray();
        int n = 0;
        int n2 = 120;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x1D));
            n2 = n2;
        }
    }

    public static void b(short s, long l4) {
        long cfr_ignored_0 = ((long)s << 48 | l4 << 16 >>> 16) ^ b;
        a = c;
    }
}


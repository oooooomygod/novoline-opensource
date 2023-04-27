/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.ayd
 */
public class ayd_2 {
    private static long b = a1c.a(-6302314557764558785L, 8741467672575270061L, null).a(116797239640096L);
    public static String a = "gui.cancel";
    private static String c = "gui.cancel";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x6DAE825F3F55L;
        long l5 = l4 ^ 0x5A34813ACD13L;
        long cfr_ignored_0 = l5 >>> 32;
        int cfr_ignored_1 = (int)(l5 << 32 >>> 32);
        char[] cArray = ",#\u0011Fj\u000eE(3\u0014".toCharArray();
        int n = 0;
        int n2 = 23;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x5C));
            n2 = n2;
        }
    }

    public static void b(long l4, int n) {
        long cfr_ignored_0 = (l4 << 32 | (long)n << 32 >>> 32) ^ b;
        a = c;
    }
}


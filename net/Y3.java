/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class Y3 {
    private static long b = a1c.a(5162108835840909007L, 8179498509813623294L, null).a(115271176161001L);
    private static String c = "Press a key to select a command, and again to use it.";
    public static String a = "Press a key to select a command, and again to use it.";

    public static void b(char c, char c2, int n) {
        long cfr_ignored_0 = ((long)c << 48 | (long)c2 << 48 >>> 16 | (long)n << 32 >>> 32) ^ b;
        a = Y3.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x380EC6EC78D3L;
        long l5 = l4 ^ 0x2AE05EA78BB9L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 32 >>> 32);
        char[] cArray = "\u0019x\u0012\u0005\u0010L6ia\u0012\u000fC\u00188iy\u0012\u001a\u0006\u000f#ikW\u0015\f\u0001:(d\u0013ZC\r9-*\u0016\u0011\u0002\u00059i~\u0018V\u0016\u001f2ic\u0003X".toCharArray();
        int n = 0;
        int n2 = 117;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x3C));
            n2 = n2;
        }
    }
}


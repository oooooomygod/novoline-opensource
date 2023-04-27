/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class OX {
    public static String a = "textures/particle/particles.png";
    private static long b = a1c.a(-4448302329021301513L, -95389238243658584L, null).a(46886047511862L);
    private static String c = "textures/particle/particles.png";

    public static void b(short s, short s3, int n) {
        long cfr_ignored_0 = ((long)s << 48 | (long)s3 << 48 >>> 16 | (long)n << 32 >>> 32) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x3179B7D4C9BL;
        long l5 = l4 ^ 0x6F3A4226385BL;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 32 >>> 32);
        char[] cArray = "\u001bA\u000eV:\u0014I\u001c\u000b\u0006C=\u0012E\fH\u0013\r?\u0007^\u001bM\u0015N*\u0015\u0002\u001fJ\u0011".toCharArray();
        int n = 0;
        int n2 = 13;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x62));
            n2 = n2;
        }
    }
}


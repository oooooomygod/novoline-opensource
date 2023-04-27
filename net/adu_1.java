/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.adU
 */
public class adu_1 {
    private static long b = a1c.a(2811562143067599519L, 847804776992877182L, null).a(242411662149787L);
    public static String a = "textures/entity/wolf/wolf_collar.png";
    private static String c = "textures/entity/wolf/wolf_collar.png";

    public static void b(char c, int n, short s) {
        long cfr_ignored_0 = ((long)c << 48 | (long)n << 32 >>> 16 | (long)s << 48 >>> 48) ^ b;
        a = adu_1.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x6AF8ADB74A9EL;
        long l5 = l4 ^ 0x4EB44D74F4FCL;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "Q\rm!B\u001d\u0013VGp;C\u0006\u0002\\Gb:[\tYR\u0007y3h\f\u0019I\u0004t'\u0019\u001f\u0018B".toCharArray();
        int n = 0;
        int n2 = 69;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x60));
            n2 = n2;
        }
    }
}


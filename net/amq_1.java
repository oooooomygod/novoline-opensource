/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.amQ
 */
public class amq_1 {
    private static String c = "Unsupported mob type for TemptGoal";
    private static long b = a1c.a(-6356127341033496701L, -7186864435435041568L, null).a(265186547082675L);
    public static String a = "Unsupported mob type for TemptGoal";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x7CCF4DF5841FL;
        long l5 = l4 ^ 0x7DE139366F19L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 32 >>> 32);
        char[] cArray = "6\u000exr?i\b\u0011\u0014ncot\b\u0001@\u007f~?|G\u0005\u000fy'\u001b|\n\u0013\u0014Lh.u".toCharArray();
        int n = 0;
        int n2 = 1;
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

    public static void b(char c, char c2, int n) {
        long cfr_ignored_0 = ((long)c << 48 | (long)c2 << 48 >>> 16 | (long)n << 32 >>> 32) ^ b;
        a = amq_1.c;
    }
}


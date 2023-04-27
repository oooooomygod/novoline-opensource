/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.aqn
 */
public class aqn_2 {
    private static String c = "<NULL>";
    public static String a = "<NULL>";
    private static long b = a1c.a(-727685751336120240L, 8812849888335178179L, null).a(230309904534400L);

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x1C2608B31758L;
        long l5 = l4 ^ 0x10A16A6E3D1CL;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "+X5A>\u0010".toCharArray();
        int n = 0;
        int n2 = 62;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x29));
            n2 = n2;
        }
    }

    public static void b(int n, int n2, int n3) {
        long cfr_ignored_0 = ((long)n << 32 | (long)n2 << 48 >>> 32 | (long)n3 << 48 >>> 48) ^ b;
        a = c;
    }
}


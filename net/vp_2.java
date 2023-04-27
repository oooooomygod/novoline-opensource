/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.vp
 */
public class vp_2 {
    private static long b = a1c.a(1409348846853853077L, 3787499389711858080L, null).a(270896607739531L);
    private static String c = "textures/entity/squid.png";
    public static String a = "textures/entity/squid.png";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x42660D876187L;
        long l5 = l4 ^ 0x66274B14FEAL;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "P{ \u0014(n W1=\u000e)u1]1+\u0011(u!\nn6\u0007".toCharArray();
        int n = 0;
        int n2 = 74;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x6E));
            n2 = n2;
        }
    }

    public static void b(short s, int n, int n2) {
        long cfr_ignored_0 = ((long)s << 48 | (long)n << 32 >>> 16 | (long)n2 << 48 >>> 48) ^ b;
        a = c;
    }
}


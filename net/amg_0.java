/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.aMg
 */
public class amg_0 {
    private static String c = "0x13";
    public static String a = "0x13";
    private static long b = a1c.a(1940865416373716663L, -4553370431525606560L, null).a(93226591287831L);

    public static void b(short s, int n, int n2) {
        long cfr_ignored_0 = ((long)s << 48 | (long)n << 32 >>> 16 | (long)n2 << 48 >>> 48) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x4DF35D617A4FL;
        long l5 = l4 ^ 0x29711B1D8C2EL;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "S)\u0012+".toCharArray();
        int n = 0;
        int n2 = 119;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x14));
            n2 = n2;
        }
    }
}


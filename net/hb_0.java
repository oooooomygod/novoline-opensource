/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.Hb
 */
public class hb_0 {
    private static long b = a1c.a(-860794730962463199L, -6555498522327724867L, null).a(52010800450022L);
    public static String a = "variant";
    private static String c = "variant";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x7C57AD7E3843L;
        long l5 = l4 ^ 0x322E5C5554A8L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "\u000b\u0011\u0006xG\u001f8".toCharArray();
        int n = 0;
        int n2 = 31;
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

    public static void b(int n, char c, int n2) {
        long cfr_ignored_0 = ((long)n << 32 | (long)c << 48 >>> 32 | (long)n2 << 48 >>> 48) ^ b;
        a = hb_0.c;
    }
}


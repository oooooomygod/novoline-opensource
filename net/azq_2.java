/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.azq
 */
public class azq_2 {
    private static long b = a1c.a(-7670415734906738774L, 802215905565744909L, null).a(241009847150474L);
    private static String c = "S0x08";
    public static String a = "S0x08";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x5A71803BB6ADL;
        long l5 = l4 ^ 0x238FE41F2336L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 32 >>> 32);
        char[] cArray = "a\"`\u0018T".toCharArray();
        int n = 0;
        int n2 = 94;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x6C));
            n2 = n2;
        }
    }

    public static void b(short s, char c, int n) {
        long cfr_ignored_0 = ((long)s << 48 | (long)c << 48 >>> 16 | (long)n << 32 >>> 32) ^ b;
        a = azq_2.c;
    }
}


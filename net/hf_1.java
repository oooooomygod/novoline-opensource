/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.hF
 */
public class hf_1 {
    private static long b = a1c.a(-4535330527019928115L, 8694457383060717511L, null).a(97138456018290L);
    private static String c = "doFireTick";
    public static String a = "doFireTick";

    public static void b(short s, char c, int n) {
        long cfr_ignored_0 = ((long)s << 48 | (long)c << 48 >>> 16 | (long)n << 32 >>> 32) ^ b;
        a = hf_1.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x76B90ACC55F9L;
        long l5 = l4 ^ 0x4D8C7AAA7998L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 32 >>> 32);
        char[] cArray = ">Q]\u000fpI\u00113]p".toCharArray();
        int n = 0;
        int n2 = 10;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x50));
            n2 = n2;
        }
    }
}


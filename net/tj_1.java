/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.tj
 */
public class tj_1 {
    private static String e = "normal";
    private static long d = a1c.a(-5464889103285178112L, -5392746361775342763L, null).a(241703554231361L);
    public static String c = "normal";
    public static String a = "=";
    public static String b = ",";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = d ^ 0x1A664209DF15L;
        long l5 = l4 ^ 0x2896B9F22E6L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "lEz\u001b?\u001f".toCharArray();
        int n = 0;
        int n2 = 113;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x73));
            n2 = n2;
        }
    }

    public static void b(short s, int n, int n2) {
        long cfr_ignored_0 = ((long)s << 48 | (long)n << 32 >>> 16 | (long)n2 << 48 >>> 48) ^ d;
        a = "=";
        c = e;
        b = ",";
    }
}


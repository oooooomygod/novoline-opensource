/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.a7o
 */
public class a7o_0 {
    public static String a = "swimming";
    private static long b = a1c.a(2227344906518646619L, -2962504337651963883L, null).a(210308054782941L);
    private static String c = "swimming";

    public static void b(short s, long l4) {
        long cfr_ignored_0 = ((long)s << 48 | l4 << 16 >>> 16) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x67837EB683FAL;
        long l5 = l4 ^ 0x1C4AD41785D2L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        long cfr_ignored_1 = l5 << 16 >>> 16;
        char[] cArray = "=0(B,$:)".toCharArray();
        int n = 0;
        int n2 = 32;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x6E));
            n2 = n2;
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.ayX
 */
public class ayx_1 {
    private static String c = "0x04";
    private static long b = a1c.a(6387954782381639057L, -752184096692302696L, null).a(135739311517236L);
    public static String a = "0x04";

    public static void b(char c, short s, int n) {
        long cfr_ignored_0 = ((long)c << 48 | (long)s << 48 >>> 16 | (long)n << 32 >>> 32) ^ b;
        a = ayx_1.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x53FD1F071EDDL;
        long l5 = l4 ^ 0x3982BBE7634FL;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 32 >>> 32);
        char[] cArray = "\u0004`5\u000f".toCharArray();
        int n = 0;
        int n2 = 51;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 7));
            n2 = n2;
        }
    }
}


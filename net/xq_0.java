/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.Xq
 */
public class xq_0 {
    private static long d = a1c.a(-8871645106671869671L, -8853465622355126083L, null).a(213639708558026L);
    public static String b = ", ";
    private static String e = ", ";
    public static String c = "]";
    public static String a = "[";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = d ^ 0x4D7EDC1ED8DBL;
        long l5 = l4 ^ 0x18AC1F698409L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "u`".toCharArray();
        int n = 0;
        int n2 = 67;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x1A));
            n2 = n2;
        }
    }

    public static void b(char c, int n, int n2) {
        long cfr_ignored_0 = ((long)c << 48 | (long)n << 32 >>> 16 | (long)n2 << 48 >>> 48) ^ d;
        xq_0.c = "]";
        a = "[";
        b = e;
    }
}


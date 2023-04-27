/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.tM
 */
public class tm_1 {
    private static long b = a1c.a(5552740813464570125L, 5722850639977536388L, null).a(148031195722121L);
    public static String a = "Not implemented";
    private static String c = "Not implemented";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x3B582F9C56E6L;
        long l5 = l4 ^ 0x66716E4F4B62L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "\u0004\u001a\n/N\u001b\f&\u0010\u0013jI\u0002\u0019.".toCharArray();
        int n = 0;
        int n2 = 86;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x1C));
            n2 = n2;
        }
    }

    public static void b(int n, char c, short s) {
        long cfr_ignored_0 = ((long)n << 32 | (long)c << 48 >>> 32 | (long)s << 48 >>> 48) ^ b;
        a = tm_1.c;
    }
}


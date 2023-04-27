/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.azy
 */
public class azy_2 {
    private static long b = a1c.a(6395819895471201892L, -8777561858815887134L, null).a(132693068189487L);
    public static String a = "This is a utility class and cannot be instantiated";
    private static String c = "This is a utility class and cannot be instantiated";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x5B0B05B651EL;
        long l5 = l4 ^ 0x352AD8C00E83L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "\"=-rT\"9V4dt\u0000\"&\u001f!=!\u0017'+\u0005&d`\u001a/j\u00154*o\u001b?j\u00140dh\u001a8>\u0017;0h\u0015?/\u0012".toCharArray();
        int n = 0;
        int n2 = 119;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 1));
            n2 = n2;
        }
    }

    public static void b(int n, short s, int n2) {
        long cfr_ignored_0 = ((long)n << 32 | (long)s << 48 >>> 32 | (long)n2 << 48 >>> 48) ^ b;
        a = c;
    }
}


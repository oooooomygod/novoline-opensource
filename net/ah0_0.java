/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.ah0
 */
public class ah0_0 {
    private static String c = "Invalid forwards & up combination";
    public static String a = "Invalid forwards & up combination";
    private static long b = a1c.a(4351791105504694715L, -3096968514103713516L, null).a(177793068693070L);

    public static void b(char c, int n, int n2) {
        long cfr_ignored_0 = ((long)c << 48 | (long)n << 32 >>> 16 | (long)n2 << 48 >>> 48) ^ b;
        a = ah0_0.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x319864917A4BL;
        long l5 = l4 ^ 0x2BC762106DBFL;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "a\t\u0013\u00043p4\b\u0001\n\u0017(x\"L\u0014EC\u007fl \b\u0004\n\b=p>I\u0013\f\n1".toCharArray();
        int n = 0;
        int n2 = 106;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x42));
            n2 = n2;
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class V {
    private static String c = "cannot copy value of property from different modules";
    private static long b = a1c.a(-108003765277984122L, 1351381530299240498L, null).a(233598445817633L);
    public static String a = "cannot copy value of property from different modules";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x3DE802DC3E91L;
        long l5 = l4 ^ 0x535F1B1D0433L;
        long cfr_ignored_0 = l5 >>> 8;
        int cfr_ignored_1 = (int)(l5 << 56 >>> 56);
        char[] cArray = "?!gL\f\u000fM?/y[C\r\f05l\u0002\f\u001dM,2fR\u0006\t\u0019%`oP\f\u0016M8)oD\u0006\t\b24)O\f\u001f\u00180%z".toCharArray();
        int n = 0;
        int n2 = 80;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0xC));
            n2 = n2;
        }
    }

    public static void b(long l4, byte by) {
        long cfr_ignored_0 = (l4 << 8 | (long)by << 56 >>> 56) ^ b;
        a = c;
    }
}


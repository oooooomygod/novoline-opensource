/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class XA {
    private static String c = "random.bow";
    private static long b = a1c.a(8828439856017881259L, 3369734553487502511L, null).a(29902455810967L);
    public static String a = "random.bow";

    public static void b(long l4, short s) {
        long cfr_ignored_0 = (l4 << 16 | (long)s << 48 >>> 48) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x3F738B4EEE5AL;
        long l5 = l4 ^ 0x58080FD77073L;
        long cfr_ignored_0 = l5 >>> 16;
        int cfr_ignored_1 = (int)(l5 << 48 >>> 48);
        char[] cArray = "D\u000f\u0001$\u0002\u0007DT\u0001\u0018".toCharArray();
        int n = 0;
        int n2 = 97;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x57));
            n2 = n2;
        }
    }
}


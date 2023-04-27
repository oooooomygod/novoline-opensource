/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class aAY {
    private static long b = a1c.a(8894343660817436625L, -7328375333418318479L, null).a(119173732129068L);
    public static String a = "Unexpected error occurred while executing...";
    private static String c = "Unexpected error occurred while executing...";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x2CB7B17990B8L;
        long l5 = l4 ^ 0xF239CDCB567L;
        long cfr_ignored_0 = l5 >>> 8;
        int cfr_ignored_1 = (int)(l5 << 56 >>> 56);
        char[] cArray = "*\u00152t1\u0018T\u000b\u001e3,$\u000fE\u0010\twc\"\u001eB\r\t2ha\n_\u0016\u00172,$\u0005R\u001c\u000e#e/\u001a\u0019QU".toCharArray();
        int n = 0;
        int n2 = 119;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 8));
            n2 = n2;
        }
    }

    public static void b(long l4, byte by) {
        long cfr_ignored_0 = (l4 << 8 | (long)by << 56 >>> 56) ^ b;
        a = c;
    }
}


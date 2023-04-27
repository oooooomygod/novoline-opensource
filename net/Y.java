/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class Y {
    private static String c = "That name is already taken.";
    private static long b = a1c.a(-602572578823194205L, -6187851988241269719L, null).a(115794206579235L);
    public static String a = "That name is already taken.";

    public static void b(int n, int n2, short s) {
        long cfr_ignored_0 = ((long)n << 32 | (long)n2 << 48 >>> 32 | (long)s << 48 >>> 48) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x123E1F9DB1A0L;
        long l5 = l4 ^ 0x5BDAA340F16DL;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "j\u0006\r\u0007Z-)S\u000bL\u001a\tc)R\u001c\t\u0012\u001e:hJ\u000f\u0007\u0016\u0014m".toCharArray();
        int n = 0;
        int n2 = 33;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x1F));
            n2 = n2;
        }
    }
}


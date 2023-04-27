/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.axd
 */
public class axd_2 {
    public static String a = "Status request has been handled.";
    private static long b = a1c.a(5444724938431624397L, -1537243302445487550L, null).a(207555024175965L);
    private static String c = "Status request has been handled.";

    public static void b(long l4, byte by) {
        long cfr_ignored_0 = (l4 << 8 | (long)by << 56 >>> 56) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x502CEB11BCBFL;
        long l5 = l4 ^ 0x7844E083E516L;
        long cfr_ignored_0 = l5 >>> 8;
        int cfr_ignored_1 = (int)(l5 << 56 >>> 56);
        char[] cArray = "QO\\\u000f-\u001c\u0010p^L\u000e=\u001cD\"S\\\bx\rUgU\u001d\u00139\u0001Tn^YU".toCharArray();
        int n = 0;
        int n2 = 41;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x2B));
            n2 = n2;
        }
    }
}


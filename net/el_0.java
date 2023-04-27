/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.El
 */
public class el_0 {
    private static String c = "NOT_HANDLED";
    private static long b = a1c.a(7836939087768495713L, -7817125599086222728L, null).a(253055844516377L);
    public static String a = "NOT_HANDLED";

    public static void b(int n, byte by, int n2) {
        long cfr_ignored_0 = ((long)n << 32 | (long)by << 56 >>> 32 | (long)n2 << 40 >>> 40) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x379798464E86L;
        long l5 = l4 ^ 0x245203E95721L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 56);
        int cfr_ignored_2 = (int)(l5 << 40 >>> 40);
        char[] cArray = "\u0017e<\fw}#\u001df-\u0017".toCharArray();
        int n = 0;
        int n2 = 3;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x5A));
            n2 = n2;
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.lV
 */
public class lv_1 {
    private static long b = a1c.a(6777306025150461835L, 8271852469422488650L, null).a(94740012691535L);
    private static String c = "Unable to deserialize map property";
    public static String a = "Unable to deserialize map property";

    public static void b(char c, int n, int n2) {
        long cfr_ignored_0 = ((long)c << 48 | (long)n << 32 >>> 16 | (long)n2 << 48 >>> 48) ^ b;
        a = lv_1.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x3C37863D51BAL;
        long l5 = l4 ^ 0x5D52F4B5EC5L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "S{\u0014n\\\u001bDrzUhU\r\u0001t|\u0014`Y\u0004\u0001&x\u0014|\u0010\u000e\u0016ie\u0010~D\u0007".toCharArray();
        int n = 0;
        int n2 = 4;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 2));
            n2 = n2;
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.t4
 */
public class t4_0 {
    private static String c = "/api new";
    private static long b = a1c.a(8127480354784676565L, -8980058733272534670L, null).a(186151905728881L);
    public static String a = "/api new";

    public static void b(char c, int n, char c2) {
        long cfr_ignored_0 = ((long)c << 48 | (long)n << 32 >>> 16 | (long)c2 << 48 >>> 48) ^ b;
        a = t4_0.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x74D63BD83589L;
        long l5 = l4 ^ 0x649DB36B5B1CL;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "gk\r\u001dA\u001a\u007f?".toCharArray();
        int n = 0;
        int n2 = 62;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x76));
            n2 = n2;
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.mG
 */
public class mg_1 {
    public static String a = "Integrated Server (map_client.txt)";
    private static String c = "Integrated Server (map_client.txt)";
    private static long b = a1c.a(6512371548657823886L, -2374550834632294391L, null).a(100042380488261L);

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x28D208A6C1DEL;
        long l5 = l4 ^ 0xAAA2B3C3B6BL;
        long cfr_ignored_0 = l5 >>> 32;
        int cfr_ignored_1 = (int)(l5 << 32 >>> 32);
        char[] cArray = "U/L79nPh$\\r\ryCj$JrvqPl\u001e[>7y_hoL**5".toCharArray();
        int n = 0;
        int n2 = 85;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x49));
            n2 = n2;
        }
    }

    public static void b(long l4, int n) {
        long cfr_ignored_0 = (l4 << 32 | (long)n << 32 >>> 32) ^ b;
        a = c;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.akk
 */
public class akk_1 {
    private static long b = a1c.a(6650372005748125963L, 2181522839031854449L, null).a(178852470819651L);
    private static String c = "INSTANCE";
    public static String a = "INSTANCE";

    public static void b(long l4, byte by) {
        long cfr_ignored_0 = (l4 << 8 | (long)by << 56 >>> 56) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x1BA79570582FL;
        long l5 = l4 ^ 0xA65FB7F971EL;
        long cfr_ignored_0 = l5 >>> 8;
        int cfr_ignored_1 = (int)(l5 << 56 >>> 56);
        char[] cArray = "q|/T\u0005wl}".toCharArray();
        int n = 0;
        int n2 = 66;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x7A));
            n2 = n2;
        }
    }
}


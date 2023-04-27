/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.asu
 */
public class asu_2 {
    private static String c = "map/";
    public static String a = "map/";
    private static long b = a1c.a(6901258809504085652L, -1023605059251682106L, null).a(34729140599820L);

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x592BC5EF3BF1L;
        long l5 = l4 ^ 0xF20EF143287L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 40);
        int cfr_ignored_2 = (int)(l5 << 56 >>> 56);
        char[] cArray = "\u0018J0c".toCharArray();
        int n = 0;
        int n2 = 59;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x4E));
            n2 = n2;
        }
    }

    public static void b(int n, int n2, byte by) {
        long cfr_ignored_0 = ((long)n << 32 | (long)n2 << 40 >>> 32 | (long)by << 56 >>> 56) ^ b;
        a = c;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.aqm
 */
public class aqm_2 {
    private static String c = "This is a utility class and cannot be instantiated";
    public static String a = "This is a utility class and cannot be instantiated";
    private static long b = a1c.a(-7832171597430385897L, 8818049488395991036L, null).a(98501512760297L);

    public static void b(byte by, int n, int n2) {
        long cfr_ignored_0 = ((long)by << 56 | (long)n << 32 >>> 8 | (long)n2 << 40 >>> 40) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x4A2AB8C5BD67L;
        long l5 = l4 ^ 0x4DC2B25173A4L;
        int cfr_ignored_0 = (int)(l5 >>> 56);
        int cfr_ignored_1 = (int)(l5 << 8 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 40 >>> 40);
        char[] cArray = "\n\u000f\fN\u0013o'~\u0006EHGo87\u0013\u001c\u001dPj5-\u0014E\\]bt=\u0006\u000bS\\rt<\u0002ET]u ?\t\u0011TRr1:".toCharArray();
        int n = 0;
        int n2 = 15;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x51));
            n2 = n2;
        }
    }
}


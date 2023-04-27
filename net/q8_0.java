/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.q8
 */
public class q8_0 {
    private static long b = a1c.a(3351010769286892824L, 363928132566396269L, null).a(62663861623137L);
    public static String a = "textures/colormap/grass.png";
    private static String c = "textures/colormap/grass.png";

    public static void b(int n, int n2, int n3) {
        long cfr_ignored_0 = ((long)n << 32 | (long)n2 << 48 >>> 32 | (long)n3 << 48 >>> 48) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x5F488D6B4651L;
        long l5 = l4 ^ 0x5D3F212BF584L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "\u000eEg(zNm\t\u000f|3cSz\u0017AoshNi\tS1,a[".toCharArray();
        int n = 0;
        int n2 = 119;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0xD));
            n2 = n2;
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.Ty
 */
public class ty_0 {
    private static String c = "textures/entity/creeper/creeper.png";
    public static String a = "textures/entity/creeper/creeper.png";
    private static long b = a1c.a(-6058856945019039556L, 4099595273045092039L, null).a(2937377060697L);

    public static void b(byte by, int n, int n2) {
        long cfr_ignored_0 = ((long)by << 56 | (long)n << 32 >>> 8 | (long)n2 << 40 >>> 40) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x261583E31276L;
        long l5 = l4 ^ 0x77853AF76CBL;
        int cfr_ignored_0 = (int)(l5 >>> 56);
        int cfr_ignored_1 = (int)(l5 << 8 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 40 >>> 40);
        char[] cArray = "p^L\u0012pS3w\u0014Q\bqH\"}\u0014W\u0014`D&aI\u001b\u0005wD3t^FHuO1".toCharArray();
        int n = 0;
        int n2 = 85;
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


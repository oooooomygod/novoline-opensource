/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class NX {
    private static String c = "textures/entity/pig/pig_saddle.png";
    private static long b = a1c.a(-5644517946371159792L, 3378016719786570430L, null).a(230233425563636L);
    public static String a = "textures/entity/pig/pig_saddle.png";

    public static void b(short s, int n, short s3) {
        long cfr_ignored_0 = ((long)s << 48 | (long)n << 32 >>> 16 | (long)s3 << 48 >>> 48) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x27256181847AL;
        long l5 = l4 ^ 0x2C11CB9FBCEFL;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "Uf?\u0004R\u00187R,\"\u001eS\u0003&X,7\u0019@E\"Hd\u0018\u0003F\u000e6Mfi\u0000I\r".toCharArray();
        int n = 0;
        int n2 = 34;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 3));
            n2 = n2;
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.avy
 */
public class avy_2 {
    private static long b = a1c.a(4739692780791232009L, -4049190880528084738L, null).a(54421621172965L);
    public static String a = "textures/entity/experience_orb.png";
    private static String c = "textures/entity/experience_orb.png";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x501B864EAA56L;
        long l5 = l4 ^ 0xD244536D331L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 32 >>> 32);
        char[] cArray = "\nJW toM\r\u0000J:ut\\\u0007\u0000J,qxZ\u0017JA7dBG\fM\u0001$oz".toCharArray();
        int n = 0;
        int n2 = 123;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 5));
            n2 = n2;
        }
    }

    public static void b(short s, short s3, int n) {
        long cfr_ignored_0 = ((long)s << 48 | (long)s3 << 48 >>> 16 | (long)n << 32 >>> 32) ^ b;
        a = c;
    }
}


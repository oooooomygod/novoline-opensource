/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class aAv {
    private static String c = "textures/entity/slime/magmacube.png";
    private static long b = a1c.a(5090629544390819158L, 1111267111514238979L, null).a(170577073061174L);
    public static String a = "textures/entity/slime/magmacube.png";

    public static void b(char c, short s, int n) {
        long cfr_ignored_0 = ((long)c << 48 | (long)s << 48 >>> 16 | (long)n << 32 >>> 32) ^ b;
        a = aAv.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x4FCFDCC6F665L;
        long l5 = l4 ^ 0xE1B3E1FF958L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 32 >>> 32);
        char[] cArray = "]he&\u0003N+Z\"x<\u0002U:P\"n>\u001fQ+\u0006`|5\u001b]-\\ox|\u0006R)".toCharArray();
        int n = 0;
        int n2 = 119;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x5E));
            n2 = n2;
        }
    }
}


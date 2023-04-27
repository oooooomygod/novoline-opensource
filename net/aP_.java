/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class aP_ {
    private static long b = a1c.a(5155939515163627627L, 6918597223394745653L, null).a(155487398120069L);
    private static String c = "textures/entity/arrow.png";
    public static String a = "textures/entity/arrow.png";

    public static void b(int n, long l4) {
        long cfr_ignored_0 = ((long)n << 32 | l4 << 32 >>> 32) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x51A6AD53F61BL;
        long l5 = l4 ^ 0x258805DCFD41L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        long cfr_ignored_1 = l5 << 32 >>> 32;
        char[] cArray = "lLUsb(\u000fk\u0006Hic3\u001ea\u0006Lue5\u001d6YC`".toCharArray();
        int n = 0;
        int n2 = 77;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x55));
            n2 = n2;
        }
    }
}


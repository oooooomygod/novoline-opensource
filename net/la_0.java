/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.lA
 */
public class la_0 {
    private static long b = a1c.a(-8679913615207587221L, 9097324253752470311L, null).a(25027431641937L);
    public static String a = "textures/entity/wither/wither_armor.png";
    private static String c = "textures/entity/wither/wither_armor.png";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x3E90C6B35B04L;
        long l5 = l4 ^ 0x4CB58B3B3D08L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        long cfr_ignored_1 = l5 << 16 >>> 16;
        char[] cArray = "<\u0006p\n\u0016W';Lm\u0010\u0017L61L\u007f\u0017\u0017M':L\u007f\u0017\u0017M':<i\f\u000eJ0f\u0013f\u0019".toCharArray();
        int n = 0;
        int n2 = 65;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 9));
            n2 = n2;
        }
    }

    public static void b(char c, long l4) {
        long cfr_ignored_0 = ((long)c << 48 | l4 << 16 >>> 16) ^ b;
        a = la_0.c;
    }
}


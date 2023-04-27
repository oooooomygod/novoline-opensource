/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class PE {
    public static String a = "textures/entity/zombie_pigman.png";
    private static String c = "textures/entity/zombie_pigman.png";
    private static long b = a1c.a(8945218197502142374L, -3598881880741676897L, null).a(180229365770583L);

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x8FE9793E1D7L;
        long l5 = l4 ^ 0x41C667424DF6L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "/|\u00056pOP(6\u0018,qTA\"6\u0007-h_\\>F\r+bPT57\r,b".toCharArray();
        int n = 0;
        int n2 = 97;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x3A));
            n2 = n2;
        }
    }

    public static void b(short s, int n, char c) {
        long cfr_ignored_0 = ((long)s << 48 | (long)n << 32 >>> 16 | (long)c << 48 >>> 48) ^ b;
        a = PE.c;
    }
}


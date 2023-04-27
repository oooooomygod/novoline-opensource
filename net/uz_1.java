/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.uZ
 */
public class uz_1 {
    private static String c = "waterWalker";
    private static long b = a1c.a(-6996478585251176871L, 2157071843327219243L, null).a(184920626767422L);
    public static String a = "waterWalker";

    public static void b(long l4, short s) {
        long cfr_ignored_0 = (l4 << 16 | (long)s << 48 >>> 48) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x79A4C472F34BL;
        long l5 = l4 ^ 0x11F5D2B7CA4EL;
        long cfr_ignored_0 = l5 >>> 16;
        int cfr_ignored_1 = (int)(l5 << 48 >>> 48);
        char[] cArray = "2S9'kDm)Y(0".toCharArray();
        int n = 0;
        int n2 = 52;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x71));
            n2 = n2;
        }
    }
}


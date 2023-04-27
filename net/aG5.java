/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class aG5 {
    public static String a = "assets/";
    private static String c = "assets/";
    private static long b = a1c.a(8127707854327903206L, -2085784130449613048L, null).a(215922844859521L);

    public static void b(int n, int n2, short s) {
        long cfr_ignored_0 = ((long)n << 32 | (long)n2 << 48 >>> 32 | (long)s << 48 >>> 48) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x230EB64EA42AL;
        long l5 = l4 ^ 0x357CAACBC8CEL;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "X\u0011\u0007D5ot".toCharArray();
        int n = 0;
        int n2 = 127;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x46));
            n2 = n2;
        }
    }
}


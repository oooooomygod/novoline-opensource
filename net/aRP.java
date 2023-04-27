/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class aRP {
    private static String c = "riding";
    public static String a = "riding";
    private static long b = a1c.a(5048324532738391236L, 4120707818832550238L, null).a(77664799105775L);

    public static void b(int n, int n2, byte by) {
        long cfr_ignored_0 = ((long)n << 32 | (long)n2 << 40 >>> 32 | (long)by << 56 >>> 56) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x5687DABFC170L;
        long l5 = l4 ^ 0x5AE3F059105FL;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 40);
        int cfr_ignored_2 = (int)(l5 << 56 >>> 56);
        char[] cArray = "\u007f\u0013dB\nO".toCharArray();
        int n = 0;
        int n2 = 64;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x4D));
            n2 = n2;
        }
    }
}


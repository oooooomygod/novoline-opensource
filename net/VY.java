/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class VY {
    private static String c = "mobGriefing";
    public static String a = "mobGriefing";
    private static long b = a1c.a(-8958453061095558726L, 3947277767932110388L, null).a(28753884406704L);

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x371CF9A3C1B0L;
        long l5 = l4 ^ 0x1542CCA15F82L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "5dB<\u001ca\u007f>bN\u001c".toCharArray();
        int n = 0;
        int n2 = 46;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x76));
            n2 = n2;
        }
    }

    public static void b(int n, int n2, char c) {
        long cfr_ignored_0 = ((long)n << 32 | (long)n2 << 48 >>> 32 | (long)c << 48 >>> 48) ^ b;
        a = VY.c;
    }
}


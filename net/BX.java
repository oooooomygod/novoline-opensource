/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class BX {
    private static String c = "generation";
    private static long b = a1c.a(5206838889217101231L, 8713272607644007142L, null).a(192237268760024L);
    public static String a = "generation";

    public static void b(int n, int n2) {
        long cfr_ignored_0 = ((long)n << 32 | (long)n2 << 32 >>> 32) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x1F811575EE30L;
        long l5 = l4 ^ 0x38719E735D21L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 32);
        char[] cArray = "bZkhN?{lPk".toCharArray();
        int n = 0;
        int n2 = 20;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x11));
            n2 = n2;
        }
    }
}


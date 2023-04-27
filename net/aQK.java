/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class aQK {
    private static long b = a1c.a(-567121013534509362L, 1047100705280518034L, null).a(230948165029785L);
    public static String a = "Sunflower Plains";
    private static String c = "Sunflower Plains";

    public static void b(int n, int n2, int n3) {
        long cfr_ignored_0 = ((long)n << 32 | (long)n2 << 48 >>> 32 | (long)n3 << 48 >>> 48) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x44C8C4DBE874L;
        long l5 = l4 ^ 0x16D0E008BB8AL;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "\u000er<2\u00184T8ur\u0004\u0018:J3t".toCharArray();
        int n = 0;
        int n2 = 124;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x21));
            n2 = n2;
        }
    }
}


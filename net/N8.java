/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class N8 {
    private static String c = "canSee";
    private static long b = a1c.a(-3374093426406010445L, 6874538699198588411L, null).a(11636305281078L);
    public static String a = "canSee";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x3AA5F788D632L;
        long l5 = l4 ^ 0x4CC725D9CA66L;
        int cfr_ignored_0 = (int)(l5 >>> 56);
        int cfr_ignored_1 = (int)(l5 << 8 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 40 >>> 40);
        char[] cArray = "\u0011\\p\u0012[&".toCharArray();
        int n = 0;
        int n2 = 124;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0xE));
            n2 = n2;
        }
    }

    public static void b(byte by, int n, int n2) {
        long cfr_ignored_0 = ((long)by << 56 | (long)n << 32 >>> 8 | (long)n2 << 40 >>> 40) ^ b;
        a = c;
    }
}


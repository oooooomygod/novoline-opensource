/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class DR {
    public static String a = "PlayerItemsLayer not registered";
    private static long b = a1c.a(-8068735175386164198L, 2713851562313476633L, null).a(173464140924811L);
    private static String c = "PlayerItemsLayer not registered";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x221AB1A12A5FL;
        long l5 = l4 ^ 0x4C8996597BA3L;
        int cfr_ignored_0 = (int)(l5 >>> 56);
        long cfr_ignored_1 = l5 << 8 >>> 8;
        char[] cArray = "\u0013VdL<-D7_hF\u0015>t&H%[6+-1_b\\*+h1_a".toCharArray();
        int n = 0;
        int n2 = 68;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 7));
            n2 = n2;
        }
    }

    public static void b(byte by, long l4) {
        long cfr_ignored_0 = ((long)by << 56 | l4 << 8 >>> 8) ^ b;
        a = c;
    }
}


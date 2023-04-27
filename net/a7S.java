/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class a7S {
    private static long b = a1c.a(2350928361368222824L, 6513453901507094366L, null).a(50746098334667L);
    private static String c = "mob.horse.leather";
    public static String a = "mob.horse.leather";

    public static void b(int n, char c, char c2) {
        long cfr_ignored_0 = ((long)n << 32 | (long)c << 48 >>> 32 | (long)c2 << 48 >>> 48) ^ b;
        a = a7S.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x1D310AF9A281L;
        long l5 = l4 ^ 0x4E644E740C62L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "k\u00121i+J\u0012u\u0018}+&D\u0014n\u0018!".toCharArray();
        int n = 0;
        int n2 = 61;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x3B));
            n2 = n2;
        }
    }
}


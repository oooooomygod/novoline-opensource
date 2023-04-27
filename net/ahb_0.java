/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.aHb
 */
public class ahb_0 {
    private static String c = "ArrowAttackGoal requires Mob implements RangedAttackMob";
    public static String a = "ArrowAttackGoal requires Mob implements RangedAttackMob";
    private static long b = a1c.a(7289344641976156635L, 5540170700840456590L, null).a(152810457749425L);

    public static void b(int n, byte by, int n2) {
        long cfr_ignored_0 = ((long)n << 32 | (long)by << 56 >>> 32 | (long)n2 << 40 >>> 40) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x5AE50A173E08L;
        long l5 = l4 ^ 0x77FBC2992880L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 56);
        int cfr_ignored_2 = (int)(l5 << 40 >>> 40);
        char[] cArray = "\u0015j+\u0017\u0011\u001e7 y:\u0013!0\"88+\u001d\u0017**&}*X+0!tq4\b\n:.1v-\u000bF\r\":\u007f<\u001c'+75{25\t=".toCharArray();
        int n = 0;
        int n2 = 40;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x7C));
            n2 = n2;
        }
    }
}


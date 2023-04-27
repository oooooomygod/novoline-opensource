/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class atZ {
    public static String a = "doMobSpawning";
    private static String c = "doMobSpawning";
    private static long b = a1c.a(-5212671619302860997L, -8534541529306512231L, null).a(215720393446618L);

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x2A9480A09DCAL;
        long l5 = l4 ^ 0x3467208CD459L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 32 >>> 32);
        char[] cArray = "r!-Z{]Pw9\u000e\\wi".toCharArray();
        int n = 0;
        int n2 = 65;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x57));
            n2 = n2;
        }
    }

    public static void b(short s, short s3, int n) {
        long cfr_ignored_0 = ((long)s << 48 | (long)s3 << 48 >>> 16 | (long)n << 32 >>> 32) ^ b;
        a = c;
    }
}


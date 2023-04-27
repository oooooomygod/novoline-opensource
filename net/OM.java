/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class OM {
    private static String c = "textures/entity/beacon_beam.png";
    public static String a = "textures/entity/beacon_beam.png";
    private static long b = a1c.a(5669344108475056996L, -756360940708509944L, null).a(140427415760680L);

    public static void b(int n, char c, char c2) {
        long cfr_ignored_0 = ((long)n << 32 | (long)c << 48 >>> 32 | (long)c2 << 48 >>> 48) ^ b;
        a = OM.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x38C61A49C74CL;
        long l5 = l4 ^ 0x6C913319365CL;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "2t\"<y\"35>?&x9\"?>8-m39(N8-m=x6\u007f=".toCharArray();
        int n = 0;
        int n2 = 116;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x32));
            n2 = n2;
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class aG0 {
    public static String a = "Unsupported mob for MoveThroughVillageGoal";
    private static String c = "Unsupported mob for MoveThroughVillageGoal";
    private static long b = a1c.a(-1320152095225887775L, 7566939400302446508L, null).a(156686411121932L);

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x21198A9E4078L;
        long l5 = l4 ^ 0x308F39DEAB5AL;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "w\u0010$\u0001Y\u0014$P\n2\u0010\t\t$@^1\u001b[D\u0006M\b2 A\u0016$W\u0019?\"@\b'C\u001923F\u0005'".toCharArray();
        int n = 0;
        int n2 = 96;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x42));
            n2 = n2;
        }
    }

    public static void b(char c, int n, int n2) {
        long cfr_ignored_0 = ((long)c << 48 | (long)n << 32 >>> 16 | (long)n2 << 48 >>> 48) ^ b;
        a = aG0.c;
    }
}


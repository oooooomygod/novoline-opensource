/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.al
 */
public class al_2 {
    private static long b = a1c.a(-340154138188009875L, -8364603752506499349L, null).a(1782446417484L);
    private static String c = "textures/entity/bat.png";
    public static String a = "textures/entity/bat.png";

    public static void b(int n, short s, char c) {
        long cfr_ignored_0 = ((long)n << 32 | (long)s << 48 >>> 32 | (long)c << 48 >>> 48) ^ b;
        a = al_2.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x4722850FF919L;
        long l5 = l4 ^ 0x530868FCD5E5L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "7Gp3%[z0\rm)$@k:\rj&$\u0007o-E".toCharArray();
        int n = 0;
        int n2 = 13;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x4E));
            n2 = n2;
        }
    }
}


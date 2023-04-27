/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class XE {
    private static String c = "textures/entity/pig/pig.png";
    private static long b = a1c.a(1270085356002200017L, 1317862137221671487L, null).a(1625110350792L);
    public static String a = "textures/entity/pig/pig.png";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x691CBE0C0A97L;
        long l5 = l4 ^ 0x2E4B7C4C3CD4L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = ")\u0005\u0011IP\u001e$.O\fSQ\u00055$O\u0019TBC14\u0007GMK\u000b".toCharArray();
        int n = 0;
        int n2 = 92;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 1));
            n2 = n2;
        }
    }

    public static void b(char c, int n, short s) {
        long cfr_ignored_0 = ((long)c << 48 | (long)n << 32 >>> 16 | (long)s << 48 >>> 48) ^ b;
        a = XE.c;
    }
}


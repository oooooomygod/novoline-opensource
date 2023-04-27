/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.uy
 */
public class uy_2 {
    public static String a = "textures/entity/minecart.png";
    private static long b = a1c.a(-746243348080468930L, 6694689394122326400L, null).a(15499833733286L);
    private static String c = "textures/entity/minecart.png";

    public static void b(long l4, int n) {
        long cfr_ignored_0 = (l4 << 32 | (long)n << 32 >>> 32) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x5321DF10C788L;
        long l5 = l4 ^ 0x4D427F4A2102L;
        long cfr_ignored_0 = l5 >>> 32;
        int cfr_ignored_1 = (int)(l5 << 32 >>> 32);
        char[] cArray = " -~e\r1I'gc\u007f\f*X-gkx\u0016&O5:r?\b-K".toCharArray();
        int n = 0;
        int n2 = 8;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x5C));
            n2 = n2;
        }
    }
}


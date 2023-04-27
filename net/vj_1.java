/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.vJ
 */
public class vj_1 {
    private static long b = a1c.a(-4007186915198236169L, 7873756265890895374L, null).a(192383226072222L);
    public static String a = "Movement";
    private static String c = "Movement";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x35E083446426L;
        long l5 = l4 ^ 0x1AE540F50823L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "]?~6\u0018\u0012Vd".toCharArray();
        int n = 0;
        int n2 = 41;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x39));
            n2 = n2;
        }
    }

    public static void b(short s, int n, char c) {
        long cfr_ignored_0 = ((long)s << 48 | (long)n << 32 >>> 16 | (long)c << 48 >>> 48) ^ b;
        a = vj_1.c;
    }
}


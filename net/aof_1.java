/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.aof
 */
public class aof_1 {
    private static long b = a1c.a(6593838231070698513L, -665564884880577668L, null).a(281163128312920L);
    public static String a = "Rcon";
    private static String c = "Rcon";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x596BA34850L;
        long l5 = l4 ^ 0x4D56CF3B8D6BL;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "\u0013\\_2".toCharArray();
        int n = 0;
        int n2 = 115;
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

    public static void b(int n, short s, short s3) {
        long cfr_ignored_0 = ((long)n << 32 | (long)s << 48 >>> 32 | (long)s3 << 48 >>> 48) ^ b;
        a = c;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.hf
 */
public class hf_2 {
    private static long b = a1c.a(472458868689185493L, 5846811496010634720L, null).a(11787486855154L);
    public static String a = "arrowFire";
    private static String c = "arrowFire";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x54345BB16004L;
        long l5 = l4 ^ 0x1B2741C568F0L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "unX\u0002\u0011\u0003dfy".toCharArray();
        int n = 0;
        int n2 = 33;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x35));
            n2 = n2;
        }
    }

    public static void b(short s, int n, char c) {
        long cfr_ignored_0 = ((long)s << 48 | (long)n << 32 >>> 16 | (long)c << 48 >>> 48) ^ b;
        a = hf_2.c;
    }
}


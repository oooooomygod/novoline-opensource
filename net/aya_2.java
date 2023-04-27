/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.aya
 */
public class aya_2 {
    public static String a = "fire.ignite";
    private static String c = "fire.ignite";
    private static long b = a1c.a(-249371200326694902L, 5245620615406469539L, null).a(137531932625291L);

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x900ACE98BD2L;
        long l5 = l4 ^ 0x563597FFF708L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 32 >>> 32);
        char[] cArray = "X\bS01\u001c\u007fP\bU0".toCharArray();
        int n = 0;
        int n2 = 16;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x2E));
            n2 = n2;
        }
    }

    public static void b(short s, short s3, int n) {
        long cfr_ignored_0 = ((long)s << 48 | (long)s3 << 48 >>> 16 | (long)n << 32 >>> 32) ^ b;
        a = c;
    }
}


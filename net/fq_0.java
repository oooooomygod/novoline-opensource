/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.Fq
 */
public class fq_0 {
    private static long b = a1c.a(4407730332986994630L, -3187060340785783970L, null).a(257699283724340L);
    public static String a = "axis";
    private static String c = "axis";

    public static void b(short s, short s3, int n) {
        long cfr_ignored_0 = ((long)s << 48 | (long)s3 << 48 >>> 16 | (long)n << 32 >>> 32) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x5C4EA51B85FCL;
        long l5 = l4 ^ 0x27FB04E22849L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 32 >>> 32);
        char[] cArray = "&3_C".toCharArray();
        int n = 0;
        int n2 = 80;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x17));
            n2 = n2;
        }
    }
}


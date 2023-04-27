/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.awZ
 */
public class awz_1 {
    private static String c = "minecraft";
    private static long b = a1c.a(-5826758804101016790L, 8669127224650813502L, null).a(14190269855346L);
    public static String a = "minecraft";

    public static void b(short s, int n, int n2) {
        long cfr_ignored_0 = ((long)s << 48 | (long)n << 32 >>> 16 | (long)n2 << 48 >>> 48) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x1B80F977B4L;
        long l5 = l4 ^ 0x358EA973F881L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "\u001a)]J$\u000e\u000f\u00114".toCharArray();
        int n = 0;
        int n2 = 11;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x7C));
            n2 = n2;
        }
    }
}


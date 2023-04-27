/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.Se
 */
public class se_0 {
    private static String c = "RandomLevelSource";
    public static String a = "RandomLevelSource";
    private static long b = a1c.a(-3800052115156634925L, -9195469104729584451L, null).a(261840030086639L);

    public static void b(long l4, char c) {
        long cfr_ignored_0 = (l4 << 16 | (long)c << 48 >>> 48) ^ b;
        a = se_0.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x44A537CBA457L;
        long l5 = l4 ^ 0x8F09577D201L;
        long cfr_ignored_0 = l5 >>> 16;
        int cfr_ignored_1 = (int)(l5 << 48 >>> 48);
        char[] cArray = "PE\u0003e\u000e\u001cGgR\bm2\u001e~pG\b".toCharArray();
        int n = 0;
        int n2 = 25;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x1B));
            n2 = n2;
        }
    }
}


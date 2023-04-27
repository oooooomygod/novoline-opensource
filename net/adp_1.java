/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.adP
 */
public class adp_1 {
    private static String c = "  ";
    public static String a = "  ";
    private static long b = a1c.a(-3592846023785213026L, -3879277835378782748L, null).a(254035941250557L);

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x9543C4990EL;
        long l5 = l4 ^ 0x2A6E52A0D245L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = ":E".toCharArray();
        int n = 0;
        int n2 = 109;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x77));
            n2 = n2;
        }
    }

    public static void b(int n, int n2, int n3) {
        long cfr_ignored_0 = ((long)n << 32 | (long)n2 << 48 >>> 32 | (long)n3 << 48 >>> 48) ^ b;
        a = c;
    }
}


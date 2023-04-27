/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.akN
 */
public class akn_1 {
    public static String a = "map_is_scaling";
    private static long b = a1c.a(5386771234387706469L, -5952892534438094019L, null).a(231593797493393L);
    private static String c = "map_is_scaling";

    public static void b(char c, int n, short s) {
        long cfr_ignored_0 = ((long)c << 48 | (long)n << 32 >>> 16 | (long)s << 48 >>> 48) ^ b;
        a = akn_1.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x5B45CB6D6A36L;
        long l5 = l4 ^ 0x54F308E8B90DL;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "G/z\u00026&wY-k16;O".toCharArray();
        int n = 0;
        int n2 = 74;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x60));
            n2 = n2;
        }
    }
}


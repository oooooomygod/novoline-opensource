/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.zV
 */
public class zv_1 {
    private static String c = "Entity_";
    public static String a = "Entity_";
    private static long b = a1c.a(8902945289661520370L, -35093314466683055L, null).a(278469663254807L);

    public static void b(long l4, short s) {
        long cfr_ignored_0 = (l4 << 16 | (long)s << 48 >>> 48) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x31F89C0FBF64L;
        long l5 = l4 ^ 0x7F16C8248193L;
        long cfr_ignored_0 = l5 >>> 16;
        int cfr_ignored_1 = (int)(l5 << 48 >>> 48);
        char[] cArray = "#\u0011-8\u001duM".toCharArray();
        int n = 0;
        int n2 = 101;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 3));
            n2 = n2;
        }
    }
}


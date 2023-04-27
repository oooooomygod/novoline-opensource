/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class atO {
    private static String c = "entity";
    public static String a = "entity";
    private static long b = a1c.a(-545082542445076671L, 2397577281223029962L, null).a(246601751354224L);

    public static void b(int n, int n2) {
        long cfr_ignored_0 = ((long)n << 32 | (long)n2 << 32 >>> 32) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x15A26626FED8L;
        long l5 = l4 ^ 0x2E379C722CE3L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 32);
        char[] cArray = "tu\f:LL".toCharArray();
        int n = 0;
        int n2 = 24;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 9));
            n2 = n2;
        }
    }
}


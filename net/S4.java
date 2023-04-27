/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class S4 {
    private static String c = "color";
    public static String a = "color";
    private static long b = a1c.a(3064364077303659627L, 1380068671267458489L, null).a(263403180121560L);

    public static void b(int n, int n2, short s) {
        long cfr_ignored_0 = ((long)n << 32 | (long)n2 << 48 >>> 32 | (long)s << 48 >>> 48) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x586B7B242F54L;
        long l5 = l4 ^ 0x2543F3146779L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "@k_]A".toCharArray();
        int n = 0;
        int n2 = 102;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x45));
            n2 = n2;
        }
    }
}


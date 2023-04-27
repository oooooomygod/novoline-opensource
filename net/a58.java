/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class a58 {
    public static String a = "color";
    private static long b = a1c.a(-1463863906506076491L, -7913063730411950214L, null).a(35620034644336L);
    private static String c = "color";

    public static void b(int n, int n2) {
        long cfr_ignored_0 = ((long)n << 32 | (long)n2 << 32 >>> 32) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x5CFC25AEF28EL;
        long l5 = l4 ^ 0x261DACA8D851L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 32);
        char[] cArray = "t\n_@I".toCharArray();
        int n = 0;
        int n2 = 42;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x3D));
            n2 = n2;
        }
    }
}


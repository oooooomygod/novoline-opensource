/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class aF_ {
    private static long b = a1c.a(-4564260526901346672L, 6073482323818165765L, null).a(249617066365258L);
    private static String c = "age";
    public static String a = "age";

    public static void b(int n, int n2) {
        long cfr_ignored_0 = ((long)n << 32 | (long)n2 << 32 >>> 32) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x39E7FF0AA66CL;
        long l5 = l4 ^ 0x70B763A907F9L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 32);
        char[] cArray = "iU+".toCharArray();
        int n = 0;
        int n2 = 53;
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


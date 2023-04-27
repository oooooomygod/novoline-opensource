/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.avl
 */
public class avl_1 {
    private static String c = "comparator";
    private static long b = a1c.a(6055758750386413032L, 2435268932741715276L, null).a(34338069693747L);
    public static String a = "comparator";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x5CA53AEE5180L;
        long l5 = l4 ^ 0xDC410661377L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 32);
        char[] cArray = "$ix)uI\u007f3ig".toCharArray();
        int n = 0;
        int n2 = 80;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x17));
            n2 = n2;
        }
    }

    public static void b(int n, int n2) {
        long cfr_ignored_0 = ((long)n << 32 | (long)n2 << 32 >>> 32) ^ b;
        a = c;
    }
}


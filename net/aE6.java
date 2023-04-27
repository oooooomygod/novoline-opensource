/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class aE6 {
    private static long b = a1c.a(-8106455765242574874L, -4888561777853001893L, null).a(70943493754035L);
    public static String a = "variant";
    private static String c = "variant";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x528EF4832ED3L;
        long l5 = l4 ^ 0x71C415FB1283L;
        long cfr_ignored_0 = l5 >>> 32;
        int cfr_ignored_1 = (int)(l5 << 32 >>> 32);
        char[] cArray = " e\u007fiCf\f".toCharArray();
        int n = 0;
        int n2 = 23;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x41));
            n2 = n2;
        }
    }

    public static void b(long l4, int n) {
        long cfr_ignored_0 = (l4 << 32 | (long)n << 32 >>> 32) ^ b;
        a = c;
    }
}


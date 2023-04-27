/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.a2r
 */
public class a2r_0 {
    private static String c = ".mcmeta";
    private static long b = a1c.a(7813430862401187410L, -7835730011961096822L, null).a(210872426400061L);
    public static String a = ".mcmeta";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x7CCF11EB2762L;
        long l5 = l4 ^ 0x2249D6F5C201L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 32);
        char[] cArray = "[J3<\u0001C\u0015".toCharArray();
        int n = 0;
        int n2 = 93;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x28));
            n2 = n2;
        }
    }

    public static void b(int n, int n2) {
        long cfr_ignored_0 = ((long)n << 32 | (long)n2 << 32 >>> 32) ^ b;
        a = c;
    }
}


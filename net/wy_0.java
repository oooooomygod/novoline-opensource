/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.Wy
 */
public class wy_0 {
    private static String c = "variant";
    public static String a = "variant";
    private static long b = a1c.a(-1313185385172972743L, 7404113690865890047L, null).a(4012590585346L);

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x706BC102C072L;
        long l5 = l4 ^ 0x5357DC8435C1L;
        long cfr_ignored_0 = l5 >>> 32;
        int cfr_ignored_1 = (int)(l5 << 32 >>> 32);
        char[] cArray = "WOZX\u0005\t\u0007".toCharArray();
        int n = 0;
        int n2 = 110;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x4F));
            n2 = n2;
        }
    }

    public static void b(long l4, int n) {
        long cfr_ignored_0 = (l4 << 32 | (long)n << 32 >>> 32) ^ b;
        a = c;
    }
}


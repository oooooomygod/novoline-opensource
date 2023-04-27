/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.atv
 */
public class atv_0 {
    public static String a = "Style.ROOT";
    public static String b = "";
    private static long c = a1c.a(-5348737646639967162L, 3468502826893681231L, null).a(44632623006634L);
    private static String d = "Style.ROOT";

    public static void b(char c, char c2, int n) {
        long cfr_ignored_0 = ((long)c << 48 | (long)c2 << 48 >>> 16 | (long)n << 32 >>> 32) ^ atv_0.c;
        b = "";
        a = d;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = c ^ 0x5A07F80A20D0L;
        long l5 = l4 ^ 0x2BF0C781009CL;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 32 >>> 32);
        char[] cArray = "G\u001aWnq>+[!z".toCharArray();
        int n = 0;
        int n2 = 81;
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


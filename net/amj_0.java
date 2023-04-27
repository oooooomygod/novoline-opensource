/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.aMj
 */
public class amj_0 {
    private static String c = "doMobLoot";
    private static long b = a1c.a(2577203698046865419L, -5220105626819622201L, null).a(156044860545601L);
    public static String a = "doMobLoot";

    public static void b(char c, char c2, int n) {
        long cfr_ignored_0 = ((long)c << 48 | (long)c2 << 48 >>> 16 | (long)n << 32 >>> 32) ^ b;
        a = amj_0.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x4683F209583EL;
        long l5 = l4 ^ 0x4A532E404D82L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 32 >>> 32);
        char[] cArray = "Lywtv\u0006yGb".toCharArray();
        int n = 0;
        int n2 = 57;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x11));
            n2 = n2;
        }
    }
}


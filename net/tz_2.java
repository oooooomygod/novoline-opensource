/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.tz
 */
public class tz_2 {
    private static long b = a1c.a(-3564510054172301619L, -6159111165246246299L, null).a(141407080173080L);
    private static String c = "North Carolina";
    public static String a = "North Carolina";

    public static void b(byte by, int n, int n2) {
        long cfr_ignored_0 = ((long)by << 56 | (long)n << 32 >>> 8 | (long)n2 << 40 >>> 40) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x293A15300CC9L;
        long l5 = l4 ^ 0x34373857E700L;
        int cfr_ignored_0 = (int)(l5 >>> 56);
        int cfr_ignored_1 = (int)(l5 << 8 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 40 >>> 40);
        char[] cArray = "t\u001a%%\t|K[\u00078=\b2i".toCharArray();
        int n = 0;
        int n2 = 52;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0xE));
            n2 = n2;
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.vh
 */
public class vh_2 {
    private static String c = "DebugLevelSource";
    private static long b = a1c.a(-520021455643585181L, -8275372080529123641L, null).a(254372824161346L);
    public static String a = "DebugLevelSource";

    public static void b(char c, char c2, int n) {
        long cfr_ignored_0 = ((long)c << 48 | (long)c2 << 48 >>> 16 | (long)n << 32 >>> 32) ^ b;
        a = vh_2.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x6F38C3FF491DL;
        long l5 = l4 ^ 0x477761392DE9L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 32 >>> 32);
        char[] cArray = "o8\u007fz;WI]8q\\3n^H8".toCharArray();
        int n = 0;
        int n2 = 34;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 9));
            n2 = n2;
        }
    }
}


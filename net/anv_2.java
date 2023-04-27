/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.anv
 */
public class anv_2 {
    private static long b = a1c.a(8208707425662970569L, -3511037309926207223L, null).a(70617006590086L);
    private static String c = "Netty Local Server IO #%d";
    public static String a = "Netty Local Server IO #%d";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x62C9922B1BC0L;
        long l5 = l4 ^ 0x3F47A5963F04L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "\u007f\tOB\u0001t3^\u000fZZX\u0007\u001aC\u001a^DX\u001d0\u0011O\u001eR".toCharArray();
        int n = 0;
        int n2 = 115;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x42));
            n2 = n2;
        }
    }

    public static void b(char c, int n, int n2) {
        long cfr_ignored_0 = ((long)c << 48 | (long)n << 32 >>> 16 | (long)n2 << 48 >>> 48) ^ b;
        a = anv_2.c;
    }
}


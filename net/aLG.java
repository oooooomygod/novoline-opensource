/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class aLG {
    private static String c = "NullConfigValue{}";
    public static String a = "NullConfigValue{}";
    private static long b = a1c.a(-2476783818772773523L, 2513592078103564791L, null).a(10705070871513L);

    public static void b(char c, int n, short s) {
        long cfr_ignored_0 = ((long)c << 48 | (long)n << 32 >>> 16 | (long)s << 48 >>> 48) ^ b;
        a = aLG.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x5D8BB505FE12L;
        long l5 = l4 ^ 0x5B1585CE4A4DL;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "D\u0017%&u\r0l\u000b.\u001cW\u000e+o\u00194".toCharArray();
        int n = 0;
        int n2 = 57;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x33));
            n2 = n2;
        }
    }
}


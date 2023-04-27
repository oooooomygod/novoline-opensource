/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class aSh {
    private static String d = "<NULL>";
    private static long c = a1c.a(-680726151827791084L, -7841457055640006345L, null).a(18691389211251L);
    public static String a = "=";
    public static String b = "<NULL>";

    public static void b(short s, char c, int n) {
        long cfr_ignored_0 = ((long)s << 48 | (long)c << 48 >>> 16 | (long)n << 32 >>> 32) ^ aSh.c;
        b = d;
        a = "=";
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = c ^ 0x743D598E22FDL;
        long l5 = l4 ^ 0x6F0C9C5F760AL;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 32 >>> 32);
        char[] cArray = "Q\u0018\t\u001d7j".toCharArray();
        int n = 0;
        int n2 = 30;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x73));
            n2 = n2;
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.ay5
 */
public class ay5_0 {
    public static String a = "message";
    private static long b = a1c.a(-4526887090975576128L, 5695695957721583339L, null).a(174556778731308L);
    private static String c = "message";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0xF4A3A463F14L;
        long l5 = l4 ^ 0x52A8F7A45175L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        long cfr_ignored_1 = l5 << 32 >>> 32;
        char[] cArray = "Y\u0018@vmD;".toCharArray();
        int n = 0;
        int n2 = 119;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x43));
            n2 = n2;
        }
    }

    public static void b(int n, long l4) {
        long cfr_ignored_0 = ((long)n << 32 | l4 << 32 >>> 32) ^ b;
        a = c;
    }
}


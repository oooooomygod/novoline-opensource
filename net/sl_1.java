/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.sL
 */
public class sl_1 {
    public static String a = "/";
    private static long c = a1c.a(7630472253445410187L, -7905727576031813051L, null).a(94949865485473L);
    private static String d = "Trying to get ";
    public static String b = "Trying to get ";

    public static void b(int n, int n2, char c) {
        long cfr_ignored_0 = ((long)n << 32 | (long)n2 << 48 >>> 32 | (long)c << 48 >>> 48) ^ sl_1.c;
        a = "/";
        b = d;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = c ^ 0xEB92A42FE40L;
        long l5 = l4 ^ 0x10D826A62FD8L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "vW'\tK\u001e\bVJ~\u0007@\r\b".toCharArray();
        int n = 0;
        int n2 = 110;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x4C));
            n2 = n2;
        }
    }
}


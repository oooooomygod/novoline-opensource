/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.afn
 */
public class afn_2 {
    public static String b = "User-ID";
    public static String a = "_";
    private static long c = a1c.a(6512673612466719301L, 2913410759817989254L, null).a(223556333387068L);
    private static String d = "User-ID";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = c ^ 0x262EFDF8C537L;
        long l5 = l4 ^ 0x6234EF6DFB9DL;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "\u000ft\"~\u0018&s".toCharArray();
        int n = 0;
        int n2 = 19;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x49));
            n2 = n2;
        }
    }

    public static void b(int n, char c, int n2) {
        long cfr_ignored_0 = ((long)n << 32 | (long)c << 48 >>> 32 | (long)n2 << 48 >>> 48) ^ afn_2.c;
        a = "_";
        b = d;
    }
}


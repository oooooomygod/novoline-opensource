/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class WC {
    public static String b = "Hash is too long (max 40, was ";
    public static String a = ")";
    private static long c = a1c.a(-2924548621045233908L, -5896734912540081431L, null).a(34194168042542L);
    private static String d = "Hash is too long (max 40, was ";

    public static void b(short s, int n, char c) {
        long cfr_ignored_0 = ((long)s << 48 | (long)n << 32 >>> 16 | (long)c << 48 >>> 48) ^ WC.c;
        a = ")";
        b = d;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = c ^ 0x122138F990B6L;
        long l5 = l4 ^ 0x7959DA5C1C11L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "_\u000biSepn7\u001euTeury\r:\u0013(xe7^*\u0017en|dJ".toCharArray();
        int n = 0;
        int n2 = 30;
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


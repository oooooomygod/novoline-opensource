/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.as8
 */
public class as8_0 {
    private static long b = a1c.a(3676924147076630924L, -1573790168373096884L, null).a(70945312637470L);
    public static String a = "0x0C";
    private static String c = "0x0C";

    public static void b(short s, int n, char c) {
        long cfr_ignored_0 = ((long)s << 48 | (long)n << 32 >>> 16 | (long)c << 48 >>> 48) ^ b;
        a = as8_0.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x5B1C285A4F35L;
        long l5 = l4 ^ 0x7DB136F7F11BL;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "sI%\u0003".toCharArray();
        int n = 0;
        int n2 = 37;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x66));
            n2 = n2;
        }
    }
}


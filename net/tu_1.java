/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.tU
 */
public class tu_1 {
    public static String a = "bites";
    private static String c = "bites";
    private static long b = a1c.a(5038791516245463185L, -3566334016309973483L, null).a(111153576790885L);

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x49F57F82428AL;
        long l5 = l4 ^ 0x75C99E8C5111L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "-l\\)G".toCharArray();
        int n = 0;
        int n2 = 98;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x2D));
            n2 = n2;
        }
    }

    public static void b(short s, int n, char c) {
        long cfr_ignored_0 = ((long)s << 48 | (long)n << 32 >>> 16 | (long)c << 48 >>> 48) ^ b;
        a = tu_1.c;
    }
}


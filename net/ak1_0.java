/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.ak1
 */
public class ak1_0 {
    public static String b = ".";
    private static long c = a1c.a(3929064393184334498L, 3958546871827375836L, null).a(224457140516115L);
    private static String d = "variant";
    public static String a = "variant";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = c ^ 0x3B9A6540E969L;
        long l5 = l4 ^ 0x583BEEDCB06FL;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 32 >>> 32);
        char[] cArray = "\u0002\u0005R\u0010M\u0019v".toCharArray();
        int n = 0;
        int n2 = 123;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0xF));
            n2 = n2;
        }
    }

    public static void b(char c, char c2, int n) {
        long cfr_ignored_0 = ((long)c << 48 | (long)c2 << 48 >>> 16 | (long)n << 32 >>> 32) ^ ak1_0.c;
        a = d;
        b = ".";
    }
}


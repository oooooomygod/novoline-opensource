/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class t9 {
    private static long c = a1c.a(-7276135663392512383L, 6314577106779953675L, null).a(120120618318687L);
    public static String a = "token:";
    public static String b = ":";
    private static String d = "token:";

    public static void b(char c, int n, int n2) {
        long cfr_ignored_0 = ((long)c << 48 | (long)n << 32 >>> 16 | (long)n2 << 48 >>> 48) ^ t9.c;
        b = ":";
        a = d;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = c ^ 0x237DB93B6F7DL;
        long l5 = l4 ^ 0x37F66F097A91L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "+F\u0000_;D".toCharArray();
        int n = 0;
        int n2 = 45;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x72));
            n2 = n2;
        }
    }
}


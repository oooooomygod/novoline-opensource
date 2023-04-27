/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class YH {
    private static String d = "Multiple values have the same name '";
    public static String b = "Multiple values have the same name '";
    private static long c = a1c.a(624783833726306075L, -7778820305597862837L, null).a(113570183866886L);
    public static String a = "'";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = c ^ 0x7A84FED2972FL;
        long l5 = l4 ^ 0x24879DE70B8EL;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "J?#wx'wbj9b}\"~tj'bg2;s\"*#b6vbj!b|2; ".toCharArray();
        int n = 0;
        int n2 = 44;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x2B));
            n2 = n2;
        }
    }

    public static void b(char c, int n, short s) {
        long cfr_ignored_0 = ((long)c << 48 | (long)n << 32 >>> 16 | (long)s << 48 >>> 48) ^ YH.c;
        b = d;
        a = "'";
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class a27 {
    private static long c = a1c.a(-2873054912396351100L, -5787275888903324504L, null).a(197766833785733L);
    public static String a = "";
    private static String d = ": ";
    public static String b = ": ";

    public static void b(short s, long l4) {
        long cfr_ignored_0 = ((long)s << 48 | l4 << 16 >>> 16) ^ c;
        a = "";
        b = d;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = c ^ 0x74C04E3EC174L;
        long l5 = l4 ^ 0x12510A0EB524L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        long cfr_ignored_1 = l5 << 16 >>> 16;
        char[] cArray = ";\b".toCharArray();
        int n = 0;
        int n2 = 27;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x1A));
            n2 = n2;
        }
    }
}


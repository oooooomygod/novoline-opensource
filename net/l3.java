/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class l3 {
    private static long b = a1c.a(3209855451503942556L, -6282722903243262334L, null).a(61306035383195L);
    public static String a = "shape";
    private static String c = "shape";

    public static void b(short s, int n, short s3) {
        long cfr_ignored_0 = ((long)s << 48 | (long)n << 32 >>> 16 | (long)s3 << 48 >>> 48) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x76CE3537BFA0L;
        long l5 = l4 ^ 0x30A4C1727181L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "\t\u000ej\u0005r".toCharArray();
        int n = 0;
        int n2 = 96;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x1A));
            n2 = n2;
        }
    }
}


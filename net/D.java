/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class D {
    public static String a = "textures/entity/iron_golem.png";
    private static long b = a1c.a(-8951441654376238578L, -1905489591950875115L, null).a(194089520505830L);
    private static String c = "textures/entity/iron_golem.png";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x7A406E101C62L;
        long l5 = l4 ^ 0x77DBB3B33A16L;
        int cfr_ignored_0 = (int)(l5 >>> 56);
        int cfr_ignored_1 = (int)(l5 << 8 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 40 >>> 40);
        char[] cArray = "mE8b7\u0002uj\u000f%x6\u0019d`\u000f)d-\u001eO~O,s/^`wG".toCharArray();
        int n = 0;
        int n2 = 78;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x57));
            n2 = n2;
        }
    }

    public static void b(byte by, int n, int n2) {
        long cfr_ignored_0 = ((long)by << 56 | (long)n << 32 >>> 8 | (long)n2 << 40 >>> 40) ^ b;
        a = c;
    }
}


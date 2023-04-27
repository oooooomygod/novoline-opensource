/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class aNM {
    public static String a = "textures/entity/spider_eyes.png";
    private static String c = "textures/entity/spider_eyes.png";
    private static long b = a1c.a(5066332395375472287L, 6982377978370383290L, null).a(101737717642552L);

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x5D1DA5390131L;
        long l5 = l4 ^ 0x697A25103DAEL;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 56);
        int cfr_ignored_2 = (int)(l5 << 40 >>> 40);
        char[] cArray = "^\u0014:h\u001b;jY^'r\u001a {S^1l\u0007-jX.'e\u000b:!Z\u001f%".toCharArray();
        int n = 0;
        int n2 = 26;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x30));
            n2 = n2;
        }
    }

    public static void b(int n, byte by, int n2) {
        long cfr_ignored_0 = ((long)n << 32 | (long)by << 56 >>> 32 | (long)n2 << 40 >>> 40) ^ b;
        a = c;
    }
}


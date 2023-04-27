/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class Y8 {
    private static String c = "textures/entity/spider/spider.png";
    public static String a = "textures/entity/spider/spider.png";
    private static long b = a1c.a(-6390803841382654938L, -7753396630446083874L, null).a(33044445107671L);

    public static void b(short s, short s3, int n) {
        long cfr_ignored_0 = ((long)s << 48 | (long)s3 << 48 >>> 16 | (long)n << 32 >>> 32) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x38252BF21F99L;
        long l5 = l4 ^ 0x645D8F3A7202L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 32 >>> 32);
        char[] cArray = "!<\u0013W$\u0015Q&v\u000eM%\u000e@,v\u0018S8\u0003Q'v\u0018S8\u0003Q'w\u001bM6".toCharArray();
        int n = 0;
        int n2 = 95;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0xA));
            n2 = n2;
        }
    }
}


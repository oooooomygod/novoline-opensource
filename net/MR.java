/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class MR {
    public static String a = "axis";
    private static long b = a1c.a(-8907319438443330781L, 937149984085787705L, null).a(218447647530300L);
    private static String c = "axis";

    public static void b(int n, short s, short s3) {
        long cfr_ignored_0 = ((long)n << 32 | (long)s << 48 >>> 32 | (long)s3 << 48 >>> 48) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x30F0B5840E1CL;
        long l5 = l4 ^ 0x791FA2E34303L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "\u001a\u0017C'".toCharArray();
        int n = 0;
        int n2 = 35;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x58));
            n2 = n2;
        }
    }
}


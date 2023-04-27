/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class a73 {
    public static String a = "old! ";
    private static long b = a1c.a(3955523333152658913L, -5868770875065266792L, null).a(95072238073003L);
    private static String c = "old! ";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x4FF528027195L;
        long l5 = l4 ^ 0x7EE7932F9BCCL;
        long cfr_ignored_0 = l5 >>> 32;
        int cfr_ignored_1 = (int)(l5 << 32 >>> 32);
        char[] cArray = "-\u0018za]".toCharArray();
        int n = 0;
        int n2 = 5;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x47));
            n2 = n2;
        }
    }

    public static void b(long l4, int n) {
        long cfr_ignored_0 = (l4 << 32 | (long)n << 32 >>> 32) ^ b;
        a = c;
    }
}


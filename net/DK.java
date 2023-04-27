/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class DK {
    private static long b = a1c.a(-8931365427763421668L, -6555451253414011450L, null).a(261114144737181L);
    private static String c = "age";
    public static String a = "age";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x39FA43985E67L;
        long l5 = l4 ^ 0x2F2D9FA55DC9L;
        long cfr_ignored_0 = l5 >>> 16;
        int cfr_ignored_1 = (int)(l5 << 48 >>> 48);
        char[] cArray = "$BA".toCharArray();
        int n = 0;
        int n2 = 114;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x37));
            n2 = n2;
        }
    }

    public static void b(long l4, short s) {
        long cfr_ignored_0 = (l4 << 16 | (long)s << 48 >>> 48) ^ b;
        a = c;
    }
}


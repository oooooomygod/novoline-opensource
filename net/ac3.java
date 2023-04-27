/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class ac3 {
    public static String a = "Listener already listening";
    private static String c = "Listener already listening";
    private static long b = a1c.a(-8473603440972026332L, -2196494646465455075L, null).a(136171032544557L);

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x429C29F83696L;
        long l5 = l4 ^ 0x67E2239DDFCBL;
        long cfr_ignored_0 = l5 >>> 16;
        int cfr_ignored_1 = (int)(l5 << 48 >>> 48);
        char[] cArray = "!\u0014\u00035|\u0001:\u001f]\u0011-k\n>\t\u0004P-p\u001c+\b\u0013\u0019/~".toCharArray();
        int n = 0;
        int n2 = 11;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x66));
            n2 = n2;
        }
    }

    public static void b(long l4, short s) {
        long cfr_ignored_0 = (l4 << 16 | (long)s << 48 >>> 48) ^ b;
        a = c;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class W5 {
    public static String a = "commands.generic.notFound";
    private static String c = "commands.generic.notFound";
    private static long b = a1c.a(1876138307295555642L, 398235409453917049L, null).a(118814217161082L);

    public static void b(int n, int n2, char c) {
        long cfr_ignored_0 = ((long)n << 32 | (long)n2 << 48 >>> 32 | (long)c << 48 >>> 48) ^ b;
        a = W5.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x4BFDF76BE561L;
        long l5 = l4 ^ 0x6D7F92D5B67EL;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "LG50m+\u0005\\\u0006?8b \u0013FKv3c1'@]69".toCharArray();
        int n = 0;
        int n2 = 49;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x1E));
            n2 = n2;
        }
    }
}


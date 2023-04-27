/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class FB {
    public static String a = "CAN'T READ NIGGER";
    private static long b = a1c.a(-6042478043593766132L, -5580591383187664623L, null).a(27757273024404L);
    private static String c = "CAN'T READ NIGGER";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x435D0650AA2CL;
        long l5 = l4 ^ 0x41F2499B59CDL;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "O\u000b\fF#>_I\u000b\u0006A9WJK\u000f\u0010".toCharArray();
        int n = 0;
        int n2 = 60;
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

    public static void b(short s, int n, short s3) {
        long cfr_ignored_0 = ((long)s << 48 | (long)n << 32 >>> 16 | (long)s3 << 48 >>> 48) ^ b;
        a = c;
    }
}


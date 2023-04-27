/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class aE7 {
    public static String a = "'%s' in ResourcePack '%s'";
    private static String c = "'%s' in ResourcePack '%s'";
    private static long b = a1c.a(-5365354299762308273L, -8824690389477477083L, null).a(127306382477747L);

    public static void b(int n, short s, short s3) {
        long cfr_ignored_0 = ((long)n << 32 | (long)s << 48 >>> 32 | (long)s3 << 48 >>> 48) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x6A37314DC028L;
        long l5 = l4 ^ 0x2997D1849691L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "\u0019<V\u0014\u000e=)\u001eK@@A!5]|uRM?g\u0019<V\u0014".toCharArray();
        int n = 0;
        int n2 = 39;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x19));
            n2 = n2;
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.Os
 */
public class os_0 {
    private static long b = a1c.a(-684236648323754817L, -7877963318884292357L, null).a(108297088117389L);
    private static String c = "random.bow";
    public static String a = "random.bow";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x57E6B6FDD9FAL;
        long l5 = l4 ^ 0x62DE983CAD48L;
        long cfr_ignored_0 = l5 >>> 16;
        int cfr_ignored_1 = (int)(l5 << 48 >>> 48);
        char[] cArray = "HBpWcKcXLi".toCharArray();
        int n = 0;
        int n2 = 50;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 8));
            n2 = n2;
        }
    }

    public static void b(long l4, short s) {
        long cfr_ignored_0 = (l4 << 16 | (long)s << 48 >>> 48) ^ b;
        a = c;
    }
}


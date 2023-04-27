/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class XG {
    private static String c = ": ";
    private static long b = a1c.a(8640705312797784475L, -3256246624923686978L, null).a(9212764335429L);
    public static String a = ": ";

    public static void b(long l4, char c) {
        long cfr_ignored_0 = (l4 << 16 | (long)c << 48 >>> 48) ^ b;
        a = XG.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x4C23BC76294CL;
        long l5 = l4 ^ 0x6F8C5735C612L;
        long cfr_ignored_0 = l5 >>> 16;
        int cfr_ignored_1 = (int)(l5 << 48 >>> 48);
        char[] cArray = "y@".toCharArray();
        int n = 0;
        int n2 = 3;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x40));
            n2 = n2;
        }
    }
}


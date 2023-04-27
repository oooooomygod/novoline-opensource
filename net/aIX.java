/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class aIX {
    private static String c = "random.bow";
    public static String a = "random.bow";
    private static long b = a1c.a(-4409688615674157308L, -1178395370039079525L, null).a(72370132533187L);

    public static void b(byte by, long l4) {
        long cfr_ignored_0 = ((long)by << 56 | l4 << 8 >>> 8) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x59A0C317255BL;
        long l5 = l4 ^ 0x5D6D9583615CL;
        int cfr_ignored_0 = (int)(l5 >>> 56);
        long cfr_ignored_1 = l5 << 8 >>> 8;
        char[] cArray = "\\oyIw\u001edLa`".toCharArray();
        int n = 0;
        int n2 = 2;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x2C));
            n2 = n2;
        }
    }
}


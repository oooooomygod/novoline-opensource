/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.anL
 */
public class anl_1 {
    private static String c = "\u00a7c";
    public static String a = "\u00a7c";
    private static long b = a1c.a(4567555564146034019L, 5911703634940671992L, null).a(269552696446136L);

    public static void b(long l4, byte by) {
        long cfr_ignored_0 = (l4 << 8 | (long)by << 56 >>> 56) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x2F8C6F390598L;
        long l5 = l4 ^ 0x7515650D63B8L;
        long cfr_ignored_0 = l5 >>> 8;
        int cfr_ignored_1 = (int)(l5 << 56 >>> 56);
        char[] cArray = "\u0085!".toCharArray();
        int n = 0;
        int n2 = 79;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x6D));
            n2 = n2;
        }
    }
}


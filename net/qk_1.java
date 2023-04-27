/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.qK
 */
public class qk_1 {
    public static String a = "gui.back";
    private static long b = a1c.a(5209991448530571991L, 2147940870746838597L, null).a(2218350829001L);
    private static String c = "gui.back";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x7B774E51C73EL;
        long l5 = l4 ^ 0x4275959C986CL;
        int cfr_ignored_0 = (int)(l5 >>> 56);
        long cfr_ignored_1 = l5 << 8 >>> 8;
        char[] cArray = "(iL{@*Q$".toCharArray();
        int n = 0;
        int n2 = 87;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x18));
            n2 = n2;
        }
    }

    public static void b(byte by, long l4) {
        long cfr_ignored_0 = ((long)by << 56 | l4 << 8 >>> 8) ^ b;
        a = c;
    }
}


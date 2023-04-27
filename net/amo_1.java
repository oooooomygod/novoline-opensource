/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.amO
 */
public class amo_1 {
    private static String c = "gui.done";
    public static String a = "gui.done";
    private static long b = a1c.a(-4582776959124157272L, 4524313886211915145L, null).a(174186801323430L);

    public static void b(long l4, char c) {
        long cfr_ignored_0 = (l4 << 16 | (long)c << 48 >>> 48) ^ b;
        a = amo_1.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x3FB3CAB531B7L;
        long l5 = l4 ^ 0x17814DC44AF5L;
        long cfr_ignored_0 = l5 >>> 16;
        int cfr_ignored_1 = (int)(l5 << 48 >>> 48);
        char[] cArray = "'\bP\u001am u%".toCharArray();
        int n = 0;
        int n2 = 26;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x5A));
            n2 = n2;
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.l0
 */
public class l0_0 {
    public static String a = "N/A (disabled)";
    private static String c = "N/A (disabled)";
    private static long b = a1c.a(-6600844400583368986L, -1609785359971267559L, null).a(15570394780947L);

    public static void b(int n, char c, int n2) {
        long cfr_ignored_0 = ((long)n << 32 | (long)c << 48 >>> 32 | (long)n2 << 48 >>> 48) ^ b;
        a = l0_0.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x6DCF551C963DL;
        long l5 = l4 ^ 0x25B81A6F6E83L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "Xld\u001e9O\u000ee\"GRtON".toCharArray();
        int n = 0;
        int n2 = 100;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x72));
            n2 = n2;
        }
    }
}


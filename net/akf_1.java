/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.akF
 */
public class akf_1 {
    private static String c = "0x0F";
    public static String a = "0x0F";
    private static long b = a1c.a(-8444864877456179235L, 5615139774187362252L, null).a(213545440611478L);

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x9509EE68221L;
        long l5 = l4 ^ 0x2C8676CB836EL;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "\\An[".toCharArray();
        int n = 0;
        int n2 = 110;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 2));
            n2 = n2;
        }
    }

    public static void b(int n, short s, char c) {
        long cfr_ignored_0 = ((long)n << 32 | (long)s << 48 >>> 32 | (long)c << 48 >>> 48) ^ b;
        a = akf_1.c;
    }
}


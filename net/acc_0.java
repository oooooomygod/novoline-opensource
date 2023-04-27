/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.acc
 */
public class acc_0 {
    private static String c = "Rendering";
    private static long b = a1c.a(-3194956126661207803L, -6149433574231754866L, null).a(147542293517938L);
    public static String a = "Rendering";

    public static void b(int n, char c, int n2) {
        long cfr_ignored_0 = ((long)n << 32 | (long)c << 48 >>> 32 | (long)n2 << 48 >>> 48) ^ b;
        a = acc_0.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x73FC1A958B69L;
        long l5 = l4 ^ 0x4A7F344790F2L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "E2j7\bQ:y0".toCharArray();
        int n = 0;
        int n2 = 84;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x43));
            n2 = n2;
        }
    }
}


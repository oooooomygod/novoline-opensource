/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.asD
 */
public class asd_1 {
    private static long b = a1c.a(8422811283727840585L, -3051896552821101234L, null).a(22761107285937L);
    private static String c = "mobGriefing";
    public static String a = "mobGriefing";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x9BAC2491E4DL;
        long l5 = l4 ^ 0x46D3959C4ECBL;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "w{\u001c;fBD|}\u0010\u001b".toCharArray();
        int n = 0;
        int n2 = 12;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x16));
            n2 = n2;
        }
    }

    public static void b(int n, char c, int n2) {
        long cfr_ignored_0 = ((long)n << 32 | (long)c << 48 >>> 32 | (long)n2 << 48 >>> 48) ^ b;
        a = asd_1.c;
    }
}


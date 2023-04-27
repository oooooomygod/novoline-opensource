/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.w3
 */
public class w3_0 {
    public static String a = "assets/";
    private static long b = a1c.a(3607036093899822851L, -3591101126877287152L, null).a(74920400512442L);
    private static String c = "assets/";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x36DF36012L;
        long l5 = l4 ^ 0x1FDAC6EEB369L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "m\u007f\u001e7\u001c\u001bf".toCharArray();
        int n = 0;
        int n2 = 19;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x1F));
            n2 = n2;
        }
    }

    public static void b(int n, int n2, int n3) {
        long cfr_ignored_0 = ((long)n << 32 | (long)n2 << 48 >>> 32 | (long)n3 << 48 >>> 48) ^ b;
        a = c;
    }
}


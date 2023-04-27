/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.xP
 */
public class xp_0 {
    private static String c = "SynchronizedWrapper{backing=";
    private static long b = a1c.a(6444332921698595769L, 4884698510179602229L, null).a(84586018166322L);
    public static String a = "SynchronizedWrapper{backing=";

    public static void b(char c, long l4) {
        long cfr_ignored_0 = ((long)c << 48 | l4 << 16 >>> 16) ^ b;
        a = xp_0.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x56A90BFB92B3L;
        long l5 = l4 ^ 0x61762145AACFL;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        long cfr_ignored_1 = l5 << 16 >>> 16;
        char[] cArray = "/`JCd5-\u0012p^Eh\u00100\u001diTE~< \u001dzOIb \u007f".toCharArray();
        int n = 0;
        int n2 = 44;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x50));
            n2 = n2;
        }
    }
}


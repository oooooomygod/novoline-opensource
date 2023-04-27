/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.ago
 */
public class ago_2 {
    private static String c = "message";
    public static String a = "message";
    private static long b = a1c.a(5119352495468568295L, 787167935081815069L, null).a(78736988882206L);

    public static void b(int n, char c, char c2) {
        long cfr_ignored_0 = ((long)n << 32 | (long)c << 48 >>> 32 | (long)c2 << 48 >>> 48) ^ b;
        a = ago_2.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x3E66FD34D287L;
        long l5 = l4 ^ 0x47F12EB52AC3L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "UW\u001a4p\t\u000f".toCharArray();
        int n = 0;
        int n2 = 59;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 3));
            n2 = n2;
        }
    }
}


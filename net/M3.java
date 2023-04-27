/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class M3 {
    private static String c = "Invalid type presented to serializer: ";
    private static long b = a1c.a(-6402750290503053665L, 866165672166598995L, null).a(208290087862412L);
    public static String a = "Invalid type presented to serializer: ";

    public static void b(char c, int n, char c2) {
        long cfr_ignored_0 = ((long)c << 48 | (long)n << 32 >>> 16 | (long)c2 << 48 >>> 48) ^ b;
        a = M3.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x1151F338BEE3L;
        long l5 = l4 ^ 0x3BE2D90EAC21L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "\u001b\u0004kOCw*r\u001ed^J>> \u000fnKAj+6JiA\u000fm+ \u0003|BFd+ P=".toCharArray();
        int n = 0;
        int n2 = 12;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x5E));
            n2 = n2;
        }
    }
}


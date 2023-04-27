/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class ST {
    private static long b = a1c.a(3280940423467853675L, 4872962284813203545L, null).a(235486419951575L);
    private static String c = "type";
    public static String a = "type";

    public static void b(int n, int n2, int n3) {
        long cfr_ignored_0 = ((long)n << 32 | (long)n2 << 48 >>> 32 | (long)n3 << 48 >>> 48) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x7E3A0E0DC5D8L;
        long l5 = l4 ^ 0x733F1AE28501L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "z`\u001cD".toCharArray();
        int n = 0;
        int n2 = 38;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x28));
            n2 = n2;
        }
    }
}


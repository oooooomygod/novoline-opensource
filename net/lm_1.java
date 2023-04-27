/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.lm
 */
public class lm_1 {
    private static String c = "%s (%s)";
    private static long b = a1c.a(3417100494766121149L, -4971070016402506546L, null).a(89918578220077L);
    public static String a = "%s (%s)";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x3CDDBA66C2F6L;
        long l5 = l4 ^ 0x103458CCBBD2L;
        long cfr_ignored_0 = l5 >>> 16;
        int cfr_ignored_1 = (int)(l5 << 48 >>> 48);
        char[] cArray = "4U\\X\u007f#N".toCharArray();
        int n = 0;
        int n2 = 97;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x70));
            n2 = n2;
        }
    }

    public static void b(long l4, char c) {
        long cfr_ignored_0 = (l4 << 16 | (long)c << 48 >>> 48) ^ b;
        a = lm_1.c;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class aCR {
    private static long b = a1c.a(-6014499569787254992L, -6057784068954180887L, null).a(186100658479821L);
    private static String c = "variant";
    public static String a = "variant";

    public static void b(int n, short s, char c) {
        long cfr_ignored_0 = ((long)n << 32 | (long)s << 48 >>> 32 | (long)c << 48 >>> 48) ^ b;
        a = aCR.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x54C73F584F0BL;
        long l5 = l4 ^ 0x508646C010DFL;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "L12<\u00198\u0007".toCharArray();
        int n = 0;
        int n2 = 122;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x40));
            n2 = n2;
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class FW {
    public static String a = "Result";
    private static String c = "Result";
    private static long b = a1c.a(2615338128416015970L, -5977187388298350414L, null).a(94750732574836L);

    public static void b(long l4, short s) {
        long cfr_ignored_0 = (l4 << 16 | (long)s << 48 >>> 48) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x3EE3F0E3459AL;
        long l5 = l4 ^ 0x37EA8C67081BL;
        long cfr_ignored_0 = l5 >>> 16;
        int cfr_ignored_1 = (int)(l5 << 48 >>> 48);
        char[] cArray = "\u001e\n\u0019*OE".toCharArray();
        int n = 0;
        int n2 = 39;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x6B));
            n2 = n2;
        }
    }
}


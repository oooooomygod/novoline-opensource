/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class aL2 {
    private static String c = "Forge dummy class";
    public static String a = "Forge dummy class";
    private static long b = a1c.a(4656843481416317008L, -3330344316909370599L, null).a(144364958314025L);

    public static void b(int n, int n2) {
        long cfr_ignored_0 = ((long)n << 32 | (long)n2 << 32 >>> 32) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x15D14647B345L;
        long l5 = l4 ^ 0x2FA90712B6EEL;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 32);
        char[] cArray = "\u001bpC\u0019FV>(r\\\u0007\u0003\u00156<lB".toCharArray();
        int n = 0;
        int n2 = 79;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x12));
            n2 = n2;
        }
    }
}


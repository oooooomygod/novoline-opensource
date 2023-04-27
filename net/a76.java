/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class a76 {
    public static String a = "KeyboardKeybind{key=";
    private static String c = "KeyboardKeybind{key=";
    private static long b = a1c.a(8578061020676430253L, -5808377185717106383L, null).a(1106270084216L);

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x540DD10A6F2EL;
        long l5 = l4 ^ 0x78A4590C9677L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 56);
        int cfr_ignored_2 = (int)(l5 << 40 >>> 40);
        char[] cArray = "\r{Tfvu!\"UH}{}=\"eFa`)".toCharArray();
        int n = 0;
        int n2 = 82;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x14));
            n2 = n2;
        }
    }

    public static void b(int n, byte by, int n2) {
        long cfr_ignored_0 = ((long)n << 32 | (long)by << 56 >>> 32 | (long)n2 << 40 >>> 40) ^ b;
        a = c;
    }
}


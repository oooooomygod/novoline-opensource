/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class CY {
    private static long b = a1c.a(-7457141518082514828L, 4748032535980952276L, null).a(13493067052825L);
    private static String c = "0x05";
    public static String a = "0x05";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x350BCBCD3A8DL;
        long l5 = l4 ^ 0x41BFD4B0818EL;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "XnE$".toCharArray();
        int n = 0;
        int n2 = 114;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x1A));
            n2 = n2;
        }
    }

    public static void b(int n, short s, int n2) {
        long cfr_ignored_0 = ((long)n << 32 | (long)s << 48 >>> 32 | (long)n2 << 48 >>> 48) ^ b;
        a = c;
    }
}


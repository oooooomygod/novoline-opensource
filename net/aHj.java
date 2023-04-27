/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class aHj {
    public static String a = "Attribute is already registered!";
    private static long b = a1c.a(-6095330720910218892L, 7459538439806376828L, null).a(74381353727533L);
    private static String c = "Attribute is already registered!";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x1F941CD92CAL;
        long l5 = l4 ^ 0x5120EA053980L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = ",4Kd|z@\u0019%\u001f\u007ff8T\u00012Zwqa\u0015\u001f%X\u007fflP\u001f%[7".toCharArray();
        int n = 0;
        int n2 = 38;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x4B));
            n2 = n2;
        }
    }

    public static void b(int n, short s, int n2) {
        long cfr_ignored_0 = ((long)n << 32 | (long)s << 48 >>> 32 | (long)n2 << 48 >>> 48) ^ b;
        a = c;
    }
}


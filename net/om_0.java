/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.Om
 */
public class om_0 {
    private static String c = "INSTANCE";
    public static String a = "INSTANCE";
    private static long b = a1c.a(4269786709262650914L, -8041994788122044340L, null).a(11745361629680L);

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x38060C9AB6FAL;
        long l5 = l4 ^ 0x2BA7CE88C78DL;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "\u0011D#\f\u0002\u0018P\u001d".toCharArray();
        int n = 0;
        int n2 = 95;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 7));
            n2 = n2;
        }
    }

    public static void b(int n, char c, short s) {
        long cfr_ignored_0 = ((long)n << 32 | (long)c << 48 >>> 32 | (long)s << 48 >>> 48) ^ b;
        a = om_0.c;
    }
}


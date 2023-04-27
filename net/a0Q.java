/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class a0Q {
    private static String c = "Could not lookup user whitelist entry for ";
    private static long b = a1c.a(-2302123657253347981L, 2902438187574827051L, null).a(177709644157620L);
    public static String a = "Could not lookup user whitelist entry for ";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x39B876EAE8A4L;
        long l5 = l4 ^ 0x5F61BEAECAACL;
        long cfr_ignored_0 = l5 >>> 16;
        int cfr_ignored_1 = (int)(l5 << 48 >>> 48);
        char[] cArray = "1NA\u0019R\u001b#\u001dU\u0014\u0019YT&\u0007Q\u0014\u0000E^?RV\\\u001cB^!\u001bR@USU9\u0000X\u0014\u0013YIm".toCharArray();
        int n = 0;
        int n2 = 108;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x1E));
            n2 = n2;
        }
    }

    public static void b(long l4, short s) {
        long cfr_ignored_0 = (l4 << 16 | (long)s << 48 >>> 48) ^ b;
        a = c;
    }
}


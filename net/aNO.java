/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class aNO {
    private static String c = "vanilla";
    public static String a = "vanilla";
    private static long b = a1c.a(1135956306430193067L, -7149830815818514323L, null).a(254537693674599L);

    public static void b(byte by, long l4) {
        long cfr_ignored_0 = ((long)by << 56 | l4 << 8 >>> 8) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x758199923A24L;
        long l5 = l4 ^ 0x7870610E7957L;
        int cfr_ignored_0 = (int)(l5 >>> 56);
        long cfr_ignored_1 = l5 << 8 >>> 8;
        char[] cArray = "w#\u0002]`Za".toCharArray();
        int n = 0;
        int n2 = 40;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x29));
            n2 = n2;
        }
    }
}


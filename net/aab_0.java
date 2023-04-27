/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.aAb
 */
public class aab_0 {
    private static long b = a1c.a(-4689253736536789725L, -5383170708498009085L, null).a(118831917207885L);
    private static String c = "PVN: ";
    public static String a = "PVN: ";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x3350CC63B506L;
        long l5 = l4 ^ 0xA2E5DAF8E8AL;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 32);
        char[] cArray = "Abu\u007f\u0011".toCharArray();
        int n = 0;
        int n2 = 44;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x3D));
            n2 = n2;
        }
    }

    public static void b(int n, int n2) {
        long cfr_ignored_0 = ((long)n << 32 | (long)n2 << 32 >>> 32) ^ b;
        a = c;
    }
}


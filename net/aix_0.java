/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.aIx
 */
public class aix_0 {
    public static String a = "Item Whitelist";
    private static String c = "Item Whitelist";
    private static long b = a1c.a(-6481011417237819737L, -3635011192928580351L, null).a(152250235117737L);

    public static void b(byte by, long l4) {
        long cfr_ignored_0 = ((long)by << 56 | l4 << 8 >>> 8) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x61D396B2A997L;
        long l5 = l4 ^ 0x4F38056B2258L;
        int cfr_ignored_0 = (int)(l5 >>> 56);
        long cfr_ignored_1 = l5 << 8 >>> 8;
        char[] cArray = ",c\u0019j\bF^\fc\u0019kAbB".toCharArray();
        int n = 0;
        int n2 = 126;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x1B));
            n2 = n2;
        }
    }
}


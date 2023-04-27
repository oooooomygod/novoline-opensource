/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.azL
 */
public class azl_1 {
    private static String c = "powered";
    private static long b = a1c.a(2298026166195925988L, 6415178463236284001L, null).a(37684404228939L);
    public static String a = "powered";

    public static void b(char c, long l4) {
        long cfr_ignored_0 = ((long)c << 48 | l4 << 16 >>> 16) ^ b;
        a = azl_1.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x48F3C4D59B0CL;
        long l5 = l4 ^ 0x22D5F2507B5L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        long cfr_ignored_1 = l5 << 16 >>> 16;
        char[] cArray = "\u0002eB^pN\u0016".toCharArray();
        int n = 0;
        int n2 = 6;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x74));
            n2 = n2;
        }
    }
}


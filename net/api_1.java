/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.apI
 */
public class api_1 {
    private static String c = "Couldn't load layered image";
    public static String a = "Couldn't load layered image";
    private static long b = a1c.a(6633787976130046696L, -3440575553926286588L, null).a(275541584237243L);

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x419BB9BB5B14L;
        long l5 = l4 ^ 0x1E39921C346CL;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 32 >>> 32);
        char[] cArray = "\u001f~Tn2|l(1Mm7vk0pXg$w/|xLc1w".toCharArray();
        int n = 0;
        int n2 = 100;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x38));
            n2 = n2;
        }
    }

    public static void b(char c, char c2, int n) {
        long cfr_ignored_0 = ((long)c << 48 | (long)c2 << 48 >>> 16 | (long)n << 32 >>> 32) ^ b;
        a = api_1.c;
    }
}


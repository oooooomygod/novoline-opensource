/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.adI
 */
public class adi_1 {
    private static String c = "textures/gui/container/brewing_stand.png";
    private static long b = a1c.a(-1331105649036833396L, 5867696385136267461L, null).a(1391292290980L);
    public static String a = "textures/gui/container/brewing_stand.png";

    public static void b(char c, char c2, int n) {
        long cfr_ignored_0 = ((long)c << 48 | (long)c2 << 48 >>> 16 | (long)n << 32 >>> 32) ^ b;
        a = adi_1.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x51363B1226C0L;
        long l5 = l4 ^ 0xC308A4B0520L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 32 >>> 32);
        char[] cArray = "ow\u0010\u001b\u0017Brh=\u000f\u001a\u000b\u001ftt|\u001c\u000e\u000b^ri=\n\u001d\u0007G~uu7\u001c\u0016Qy\u007f<\u0018\u0001\u0005".toCharArray();
        int n = 0;
        int n2 = 54;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x2D));
            n2 = n2;
        }
    }
}


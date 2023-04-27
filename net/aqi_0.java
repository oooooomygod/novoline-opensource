/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.aQi
 */
public class aqi_0 {
    public static String a = "textures/entity/enderman/enderman.png";
    private static String c = "textures/entity/enderman/enderman.png";
    private static long b = a1c.a(-9094733893849511100L, 1164915831218030073L, null).a(212032025931781L);

    public static void b(char c, int n, short s) {
        long cfr_ignored_0 = ((long)c << 48 | (long)n << 32 >>> 16 | (long)s << 48 >>> 48) ^ b;
        a = aqi_0.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x377A6C5B9CF9L;
        long l5 = l4 ^ 0x5FB93321C1E5L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "\u0002]~Hx,\u001f\u0005\u0017cRy7\u000e\u000f\u0017cRi;\b\u001bYh\u0013h0\u001e\u0013Jk]cp\n\u0018_".toCharArray();
        int n = 0;
        int n2 = 57;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x4F));
            n2 = n2;
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.Pb
 */
public class pb_0 {
    private static String c = "Modifier is already applied on this attribute!";
    public static String a = "Modifier is already applied on this attribute!";
    private static long b = a1c.a(-2935939294892357241L, 5711995253714853699L, null).a(77473430150654L);

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x2C6EDFD90D54L;
        long l5 = l4 ^ 0x62677192157CL;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 32 >>> 32);
        char[] cArray = "\u0014\u001e1tD.@+Q<n\u0002&I+\u00144y[gD)\u00019tG#\u00056\u001fuiJ.Vy\u0010!iP.G,\u00050<".toCharArray();
        int n = 0;
        int n2 = 119;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x2E));
            n2 = n2;
        }
    }

    public static void b(short s, char c, int n) {
        long cfr_ignored_0 = ((long)s << 48 | (long)c << 48 >>> 16 | (long)n << 32 >>> 32) ^ b;
        a = pb_0.c;
    }
}


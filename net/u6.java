/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class u6 {
    public static String a = "textures/map/map_icons.png";
    private static long b = a1c.a(1594873811526947641L, -1229648483204124614L, null).a(241007892659941L);
    private static String c = "textures/map/map_icons.png";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x256665268E9BL;
        long l5 = l4 ^ 0x2E832B8B108DL;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "\u0010(D#K\u00077\u0017bQ6NZ?\u0005=c>]\u001a<\u0017cL9Y".toCharArray();
        int n = 0;
        int n2 = 75;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x2F));
            n2 = n2;
        }
    }

    public static void b(char c, int n, int n2) {
        long cfr_ignored_0 = ((long)c << 48 | (long)n << 32 >>> 16 | (long)n2 << 48 >>> 48) ^ b;
        a = u6.c;
    }
}


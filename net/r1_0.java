/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.r1
 */
public class r1_0 {
    public static String b = "textures/gui/stream_indicator.png";
    private static long c = a1c.a(6226421175256395144L, -2870077637295740832L, null).a(66026971163330L);
    private static String d = "textures/gui/stream_indicator.png";
    public static String a = "";

    public static void b(long l4, char c) {
        long cfr_ignored_0 = (l4 << 16 | (long)c << 48 >>> 48) ^ r1_0.c;
        b = d;
        a = "";
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = c ^ 0x2910065F29BCL;
        long l5 = l4 ^ 0x5CC0E349CF2DL;
        long cfr_ignored_0 = l5 >>> 16;
        int cfr_ignored_1 = (int)(l5 << 48 >>> 48);
        char[] cArray = ";%\"\u0006^%l<o=\u0007Bxz;2?\u0013F\b`!$3\u0011J#f=n*\u001cL".toCharArray();
        int n = 0;
        int n2 = 26;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x55));
            n2 = n2;
        }
    }
}


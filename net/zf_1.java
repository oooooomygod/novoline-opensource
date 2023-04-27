/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.zF
 */
public class zf_1 {
    public static String a = "textures/entity/cow/mooshroom.png";
    private static long b = a1c.a(9188505712155549517L, 1768036642623335912L, null).a(98515408021573L);
    private static String c = "textures/entity/cow/mooshroom.png";

    public static void b(short s, char c, int n) {
        long cfr_ignored_0 = ((long)s << 48 | (long)c << 48 >>> 16 | (long)n << 32 >>> 32) ^ b;
        a = zf_1.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x603F02B90F1DL;
        long l5 = l4 ^ 0x497F4E886B8CL;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 32 >>> 32);
        char[] cArray = "A/35pDyFe./q_hLe(.r\u0019qZ%8)wYsXd;/b".toCharArray();
        int n = 0;
        int n2 = 108;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x59));
            n2 = n2;
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.zt
 */
public class zt_2 {
    public static String a = "textures/entity/snowman.png";
    private static String c = "textures/entity/snowman.png";
    private static long b = a1c.a(-5780775420546766302L, -3051533958179988316L, null).a(144360345588136L);

    public static void b(char c, int n, int n2) {
        long cfr_ignored_0 = ((long)c << 48 | (long)n << 32 >>> 16 | (long)n2 << 48 >>> 48) ^ b;
        a = zt_2.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x696BFFDD43ECL;
        long l5 = l4 ^ 0x1B7D056B1D76L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "B\">t:\u0015GEh#n;\u000eVOh5n \u0010OW)hp!\u0000".toCharArray();
        int n = 0;
        int n2 = 57;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0xF));
            n2 = n2;
        }
    }
}


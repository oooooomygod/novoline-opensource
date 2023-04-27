/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class a6K {
    public static String a = "commands.generic.player.notFound";
    private static String c = "commands.generic.player.notFound";
    private static long b = a1c.a(5794728954887838258L, 4363579480725091194L, null).a(188255362035641L);

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x327882D8AB0L;
        long l5 = l4 ^ 0x57EC3F9B6DB3L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "/XRwT\u0000\u0014?\u0019X\u007f[\u000b\u0002%T\u0011jY\u000f\t)E\u0011tZ\u001a6#BQ~".toCharArray();
        int n = 0;
        int n2 = 70;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0xA));
            n2 = n2;
        }
    }

    public static void b(int n, char c, short s) {
        long cfr_ignored_0 = ((long)n << 32 | (long)c << 48 >>> 32 | (long)s << 48 >>> 48) ^ b;
        a = a6K.c;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class a98 {
    public static String a = "textures/entity/zombie/zombie.png";
    private static String c = "textures/entity/zombie/zombie.png";
    private static long b = a1c.a(6749769575532604243L, 891740426554670032L, null).a(154658470771702L);

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x6CBCBE235597L;
        long l5 = l4 ^ 0x712C81EA9B83L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "C'tJ\b}#DmiP\tf2NmvQ\u0010m/RmvQ\u0010m/Rl|P\u001a".toCharArray();
        int n = 0;
        int n2 = 30;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x29));
            n2 = n2;
        }
    }

    public static void b(char c, int n, char c2) {
        long cfr_ignored_0 = ((long)c << 48 | (long)n << 32 >>> 16 | (long)c2 << 48 >>> 48) ^ b;
        a = a98.c;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class aWB {
    public static String b = "data";
    public static String a = "-";
    public static String c = ":";
    private static String e = "data";
    private static long d = a1c.a(6156092453897443412L, -1431062759337012985L, null).a(115495615800242L);

    public static void b(long l4, short s) {
        long cfr_ignored_0 = (l4 << 16 | (long)s << 48 >>> 48) ^ d;
        a = "-";
        b = e;
        c = ":";
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = d ^ 0x2CEC4056C99AL;
        long l5 = l4 ^ 0x4177F348C746L;
        long cfr_ignored_0 = l5 >>> 16;
        int cfr_ignored_1 = (int)(l5 << 48 >>> 48);
        char[] cArray = "\u0000{,\u0018".toCharArray();
        int n = 0;
        int n2 = 95;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x3B));
            n2 = n2;
        }
    }
}


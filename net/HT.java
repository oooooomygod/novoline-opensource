/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class HT {
    public static String a = "textures/gui/container/horse.png";
    private static long b = a1c.a(3343753356854627472L, -3671005850028565714L, null).a(138970089224068L);
    private static String c = "textures/gui/container/horse.png";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x69239587A150L;
        long l5 = l4 ^ 0x753CCCF5AE42L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        long cfr_ignored_1 = l5 << 16 >>> 16;
        char[] cArray = "\u001e{gSK\u0014V\u00191xRWIP\u0005pkFW\bV\u00181wHL\u0015VDnq@".toCharArray();
        int n = 0;
        int n2 = 112;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x1A));
            n2 = n2;
        }
    }

    public static void b(short s, long l4) {
        long cfr_ignored_0 = ((long)s << 48 | l4 << 16 >>> 16) ^ b;
        a = c;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.Vk
 */
public class vk_0 {
    private static String c = "yyyy-MM-dd HH:mm:ss Z";
    private static long b = a1c.a(3290352469615424922L, 6488803416658214061L, null).a(73366626399763L);
    public static String a = "yyyy-MM-dd HH:mm:ss Z";

    public static void b(int n, byte by, int n2) {
        long cfr_ignored_0 = ((long)n << 32 | (long)by << 56 >>> 32 | (long)n2 << 40 >>> 40) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x15809A7FC4EBL;
        long l5 = l4 ^ 0xF06C4233BC5L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 56);
        int cfr_ignored_2 = (int)(l5 << 40 >>> 40);
        char[] cArray = "r!u\u007fV{\u007f&<h&3~\bf56u\b\u0016h".toCharArray();
        int n = 0;
        int n2 = 126;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x75));
            n2 = n2;
        }
    }
}


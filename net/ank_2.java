/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.ank
 */
public class ank_2 {
    private static String c = "Netty Epoll Server IO #%d";
    private static long b = a1c.a(6549274258289551972L, -2411061873018698324L, null).a(141658130815606L);
    public static String a = "Netty Epoll Server IO #%d";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x308631A601ABL;
        long l5 = l4 ^ 0x64A4698B12A1L;
        int cfr_ignored_0 = (int)(l5 >>> 56);
        int cfr_ignored_1 = (int)(l5 << 8 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 40 >>> 40);
        char[] cArray = "4Q.\u0013@tK\n[6\u000b\u0019\u0007k\bB?\u0015\u0019\u001dAZ\u0017\u007f\u0003".toCharArray();
        int n = 0;
        int n2 = 46;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x54));
            n2 = n2;
        }
    }

    public static void b(byte by, int n, int n2) {
        long cfr_ignored_0 = ((long)by << 56 | (long)n << 32 >>> 8 | (long)n2 << 40 >>> 40) ^ b;
        a = c;
    }
}


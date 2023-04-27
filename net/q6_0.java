/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.q6
 */
public class q6_0 {
    public static String a = "Netty Client IO #%d";
    private static String c = "Netty Client IO #%d";
    private static long b = a1c.a(-8895648456382117935L, -7030244440348074900L, null).a(129071954814632L);

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x48EAB07979C3L;
        long l5 = l4 ^ 0x7CCF2B404340L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "\u0005W*\\w#@'[;Fz#J\u0004\u0012}\rj".toCharArray();
        int n = 0;
        int n2 = 84;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x1F));
            n2 = n2;
        }
    }

    public static void b(int n, short s, short s3) {
        long cfr_ignored_0 = ((long)n << 32 | (long)s << 48 >>> 32 | (long)s3 << 48 >>> 48) ^ b;
        a = c;
    }
}


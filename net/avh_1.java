/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.avH
 */
public class avh_1 {
    private static String c = "Offseting the Texture";
    private static long b = a1c.a(7901301987374244556L, -6106459189551753615L, null).a(272140470303682L);
    public static String a = "Offseting the Texture";

    public static void b(short s, int n, short s3) {
        long cfr_ignored_0 = ((long)s << 48 | (long)n << 32 >>> 16 | (long)s3 << 48 >>> 48) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x19679EDFB8D1L;
        long l5 = l4 ^ 0x5A762F5C1F71L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "5@g\u0003F#\u0016\u0014A!\u0004K2_.Cy\u0004V%\u001a".toCharArray();
        int n = 0;
        int n2 = 16;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x6A));
            n2 = n2;
        }
    }
}


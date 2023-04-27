/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.arH
 */
public class arh_1 {
    private static String c = "tile.bed.notValid";
    public static String a = "tile.bed.notValid";
    private static long b = a1c.a(9007223131618041741L, 7883075353430153423L, null).a(71857138689174L);

    public static void b(byte by, long l4) {
        long cfr_ignored_0 = ((long)by << 56 | l4 << 8 >>> 8) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x2A0167468929L;
        long l5 = l4 ^ 0x6FDE54F27719L;
        int cfr_ignored_0 = (int)(l5 >>> 56);
        long cfr_ignored_1 = l5 << 8 >>> 8;
        char[] cArray = "Cjq\u0017e\u001fQS-s\u001d?+U[jy".toCharArray();
        int n = 0;
        int n2 = 101;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x52));
            n2 = n2;
        }
    }
}


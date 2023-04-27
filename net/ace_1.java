/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.acE
 */
public class ace_1 {
    private static long b = a1c.a(-5539413811718459908L, -2439710423218804787L, null).a(278081099308761L);
    private static String c = "commandBlockOutput";
    public static String a = "commandBlockOutput";

    public static void b(int n, long l4) {
        long cfr_ignored_0 = ((long)n << 32 | l4 << 32 >>> 32) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x341704335CACL;
        long l5 = l4 ^ 0x2C38A927BA61L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        long cfr_ignored_1 = l5 << 32 >>> 32;
        char[] cArray = "hv\u0012@ \u0012RIu\u0010N*3C\u007fi\nY".toCharArray();
        int n = 0;
        int n2 = 64;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x4B));
            n2 = n2;
        }
    }
}


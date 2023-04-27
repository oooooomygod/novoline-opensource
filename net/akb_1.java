/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.akB
 */
public class akb_1 {
    private static String c = "textures/gui/widgets.png";
    public static String a = "textures/gui/widgets.png";
    private static long b = a1c.a(-3862254682078390164L, -3454570387559280546L, null).a(56519487171140L);

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x16F6FAC6C75L;
        long l5 = l4 ^ 0x53C37AC6F2F0L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "@D\u0016\u000bq\r|G\u000e\t\nmPn]E\t\u001ap\f7DO\t".toCharArray();
        int n = 0;
        int n2 = 55;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 3));
            n2 = n2;
        }
    }

    public static void b(int n, char c, short s) {
        long cfr_ignored_0 = ((long)n << 32 | (long)c << 48 >>> 32 | (long)s << 48 >>> 48) ^ b;
        a = akb_1.c;
    }
}


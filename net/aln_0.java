/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.aLn
 */
public class aln_0 {
    private static long b = a1c.a(2552833126797690336L, -879863459603901446L, null).a(134208739395968L);
    private static String c = "Enchant";
    public static String a = "Enchant";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x7CC5A487E47CL;
        long l5 = l4 ^ 0x375007AB3D82L;
        long cfr_ignored_0 = l5 >>> 16;
        int cfr_ignored_1 = (int)(l5 << 48 >>> 48);
        char[] cArray = "\u001akVQ@\u001f8".toCharArray();
        int n = 0;
        int n2 = 13;
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

    public static void b(long l4, short s) {
        long cfr_ignored_0 = (l4 << 16 | (long)s << 48 >>> 48) ^ b;
        a = c;
    }
}


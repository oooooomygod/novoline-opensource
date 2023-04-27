/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.Bi
 */
public class bi_0 {
    private static long b = a1c.a(1130250350938239727L, 3026992754099326958L, null).a(137462096256570L);
    private static String c = "textures/painting/paintings_kristoffer_zetterstrand.png";
    public static String a = "textures/painting/paintings_kristoffer_zetterstrand.png";

    public static void b(long l4, char c) {
        long cfr_ignored_0 = (l4 << 16 | (long)c << 48 >>> 48) ^ b;
        a = bi_0.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x657A4EE1C06AL;
        long l5 = l4 ^ 0x5DD7E10AD8EDL;
        long cfr_ignored_0 = l5 >>> 16;
        int cfr_ignored_1 = (int)(l5 << 48 >>> 48);
        char[] cArray = "ZVrg55\u0019]\u001czr))\bG]m<0&\u0015@Gc}'4#EAc`4(\u001aHVxL:\"\bZVx`45\u001d@W$c. ".toCharArray();
        int n = 0;
        int n2 = 75;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x65));
            n2 = n2;
        }
    }
}


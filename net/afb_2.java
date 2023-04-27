/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.afb
 */
public class afb_2 {
    private static String c = "game.tnt.primed";
    private static long b = a1c.a(-8826076805774915117L, -5960311540833636643L, null).a(185054610493654L);
    public static String a = "game.tnt.primed";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x228CC30DF222L;
        long cfr_ignored_0 = l4 ^ 0x381D292829E6L;
        char[] cArray = "?TE]q)\u0002,\u001bXJ60\t<".toCharArray();
        int n = 0;
        int n2 = 84;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_1 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0xC));
            n2 = n2;
        }
    }

    public static void b(long l4) {
        l4 = b ^ l4;
        a = c;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.aig
 */
public class aig_2 {
    private static long b = a1c.a(-4455506915012172484L, 8550241485910827207L, null).a(127829684024438L);
    private static String c = "container.crafting";
    public static String a = "container.crafting";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x1FC72B686E8BL;
        long cfr_ignored_0 = l4 ^ 0x4B39742E5082L;
        char[] cArray = "7srX[G71n2OHO? urK".toCharArray();
        int n = 0;
        int n2 = 125;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_1 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x29));
            n2 = n2;
        }
    }

    public static void b(long l4) {
        l4 = b ^ l4;
        a = c;
    }
}


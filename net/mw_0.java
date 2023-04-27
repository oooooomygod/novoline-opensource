/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.mW
 */
public class mw_0 {
    private static long b = a1c.a(-3572061393052532690L, -1914721323084186161L, null).a(103480258628821L);
    private static String c = "minecraft:minecart.inside";
    public static String a = "minecraft:minecart.inside";

    public static void b(long l4) {
        l4 = b ^ l4;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x63CD9DDC5A2FL;
        long cfr_ignored_0 = l4 ^ 0x1C01419F73CCL;
        char[] cArray = "Afu\u000e;.\tJ{!\u000612\rOni\u001fv5\u0006_f\u007f\u000e".toCharArray();
        int n = 0;
        int n2 = 94;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_1 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x72));
            n2 = n2;
        }
    }
}


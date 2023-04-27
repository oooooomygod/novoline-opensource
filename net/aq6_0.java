/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.aq6
 */
public class aq6_0 {
    public static String a = "entity";
    private static long b = a1c.a(-2437348110837264939L, -4358769998030400971L, null).a(191814070189392L);
    private static String c = "entity";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x2F7DEED35FDDL;
        long l5 = l4 ^ 0x26D79B620C0CL;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "y}i|P&".toCharArray();
        int n = 0;
        int n2 = 74;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x56));
            n2 = n2;
        }
    }

    public static void b(int n, int n2, int n3) {
        long cfr_ignored_0 = ((long)n << 32 | (long)n2 << 48 >>> 32 | (long)n3 << 48 >>> 48) ^ b;
        a = c;
    }
}


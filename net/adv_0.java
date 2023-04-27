/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.adV
 */
public class adv_0 {
    private static String c = "HellRandomLevelSource";
    private static long b = a1c.a(4516995951501918057L, 6523511684536800187L, null).a(59609932404999L);
    public static String a = "HellRandomLevelSource";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x4543B4B32FF8L;
        long l5 = l4 ^ 0x364E007AF226L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "\u0015gc>\u001cy:9mb\u001e+n11Q`'<{1".toCharArray();
        int n = 0;
        int n2 = 117;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x28));
            n2 = n2;
        }
    }

    public static void b(int n, int n2, int n3) {
        long cfr_ignored_0 = ((long)n << 32 | (long)n2 << 48 >>> 32 | (long)n3 << 48 >>> 48) ^ b;
        a = c;
    }
}


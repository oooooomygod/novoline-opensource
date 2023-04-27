/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.Fv
 */
public class fv_0 {
    private static String c = "container.crafting";
    public static String a = "container.crafting";
    private static long b = a1c.a(6846001100401184995L, 4045496982841946701L, null).a(42652551913668L);

    public static void b(short s, int n, int n2) {
        long cfr_ignored_0 = ((long)s << 48 | (long)n << 32 >>> 16 | (long)n2 << 48 >>> 48) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x7002FF5F9BFCL;
        long l5 = l4 ^ 0x2D3028B19C8BL;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "\u0013\u001bY,\u0012\u0001\u0003\u0015\u0006\u0019;\u0001\t\u000b\u0004\u001dY?".toCharArray();
        int n = 0;
        int n2 = 56;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x48));
            n2 = n2;
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.Fb
 */
public class fb_0 {
    private static long b = a1c.a(5597638303442661672L, 3270607935025947983L, null).a(128305369691363L);
    private static String c = "textures/entity/explosion.png";
    public static String a = "textures/entity/explosion.png";

    public static void b(short s, int n, int n2) {
        long cfr_ignored_0 = ((long)s << 48 | (long)n << 32 >>> 16 | (long)n2 << 48 >>> 48) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x1041CCB19499L;
        long l5 = l4 ^ 0x6D11EA09F8FEL;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = ",$\u000eD+\u0005]+n\u0013^*\u001eL!n\u0013H.\u001bW+(\u0019^p\u0007V?".toCharArray();
        int n = 0;
        int n2 = 126;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x26));
            n2 = n2;
        }
    }
}


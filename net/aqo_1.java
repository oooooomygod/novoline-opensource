/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.aqO
 */
public class aqo_1 {
    private static String c = "textures/colormap/foliage.png";
    private static long b = a1c.a(-2005582699932119545L, 901959603152410805L, null).a(20449426804832L);
    public static String a = "textures/colormap/foliage.png";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x15F370E764A1L;
        long l5 = l4 ^ 0x36D4353EB885L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "[9D\u0003\u00046Y\\s_\u0018\u001d+NB=LX\u0017+PF=[\u0012_4RH".toCharArray();
        int n = 0;
        int n2 = 114;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x5D));
            n2 = n2;
        }
    }

    public static void b(int n, int n2, int n3) {
        long cfr_ignored_0 = ((long)n << 32 | (long)n2 << 48 >>> 32 | (long)n3 << 48 >>> 48) ^ b;
        a = c;
    }
}


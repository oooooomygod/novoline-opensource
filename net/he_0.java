/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.He
 */
public class he_0 {
    private static long b = a1c.a(5575779373321802990L, -158104610319054581L, null).a(114464142353715L);
    public static String a = "textures/entity/creeper/creeper_armor.png";
    private static String c = "textures/entity/creeper/creeper_armor.png";

    public static void b(int n, short s, char c) {
        long cfr_ignored_0 = ((long)n << 32 | (long)s << 48 >>> 32 | (long)c << 48 >>> 48) ^ b;
        a = he_0.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x3A482E0A40A9L;
        long l5 = l4 ^ 0x7F8939708D67L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "_s >\u0003kcX9=$\u0002prR9;8\u0013|vNdw)\u0004|c[s*\u0015\u0017kkDdv:\u0018~".toCharArray();
        int n = 0;
        int n2 = 125;
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
}


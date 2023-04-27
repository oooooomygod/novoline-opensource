/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.a9t
 */
public class a9t_0 {
    public static String a = "textures/entity/blaze.png";
    private static String c = "textures/entity/blaze.png";
    private static long b = a1c.a(336973462499837393L, -6318691544344778891L, null).a(229125054272763L);

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x3ADC61529D93L;
        long l5 = l4 ^ 0x7654277496AEL;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "#+\u0003Q=II$a\u001eK<RX.a\u0019I)AIy>\u0015B".toCharArray();
        int n = 0;
        int n2 = 94;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 9));
            n2 = n2;
        }
    }

    public static void b(int n, short s, char c) {
        long cfr_ignored_0 = ((long)n << 32 | (long)s << 48 >>> 32 | (long)c << 48 >>> 48) ^ b;
        a = a9t_0.c;
    }
}


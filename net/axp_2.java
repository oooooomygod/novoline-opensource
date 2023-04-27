/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.axp
 */
public class axp_2 {
    private static String c = "Tool modifier";
    public static String a = "Tool modifier";
    private static long b = a1c.a(8155042787155588135L, 4612766040960100769L, null).a(117860656304233L);

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x6AC68DB60620L;
        long l5 = l4 ^ 0x1854D4D540EL;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 32 >>> 32);
        char[] cArray = "\u0015\u00028?Q:o%\u00041:\u0014%".toCharArray();
        int n = 0;
        int n2 = 67;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 2));
            n2 = n2;
        }
    }

    public static void b(short s, char c, int n) {
        long cfr_ignored_0 = ((long)s << 48 | (long)c << 48 >>> 16 | (long)n << 32 >>> 32) ^ b;
        a = axp_2.c;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class aQX {
    private static long b = a1c.a(3585610768968009176L, 4687680200876793640L, null).a(274185738932940L);
    private static String c = "textures/entity/enderman/enderman_eyes.png";
    public static String a = "textures/entity/enderman/enderman_eyes.png";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x48AF0F993756L;
        long l5 = l4 ^ 0x1ED15616881BL;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "eH+\r|\u000bBb\u00026\u0017}\u0010Sh\u00026\u0017m\u001cU|L=Vl\u0017Ct_>\u0018g&BhH Wy\u0017@".toCharArray();
        int n = 0;
        int n2 = 69;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x54));
            n2 = n2;
        }
    }

    public static void b(char c, int n, short s) {
        long cfr_ignored_0 = ((long)c << 48 | (long)n << 32 >>> 16 | (long)s << 48 >>> 48) ^ b;
        a = aQX.c;
    }
}


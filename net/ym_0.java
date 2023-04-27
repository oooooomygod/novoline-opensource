/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.Ym
 */
public class ym_0 {
    public static String a = "No serializer available for type ";
    private static long b = a1c.a(5684660987779547339L, -1115126800023997321L, null).a(236756360098011L);
    private static String c = "No serializer available for type ";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x7B3DD6E5997DL;
        long l5 = l4 ^ 0x5B1200C1062FL;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "-1!h]WX\u00022ha]W\u0011\u0002(`rTDS\u000f;!}WW\u0011\u0017'q~\u0018".toCharArray();
        int n = 0;
        int n2 = 47;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x4C));
            n2 = n2;
        }
    }

    public static void b(short s, int n, char c) {
        long cfr_ignored_0 = ((long)s << 48 | (long)n << 32 >>> 16 | (long)c << 48 >>> 48) ^ b;
        a = ym_0.c;
    }
}


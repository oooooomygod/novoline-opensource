/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.aA
 */
public class aa_0 {
    private static String c = "0x01";
    public static String a = "0x01";
    private static long b = a1c.a(-5346187246809850901L, -4286238659089924602L, null).a(180857006656401L);

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x696A4735CE50L;
        long l5 = l4 ^ 0x1F553CE24187L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = ".Abj".toCharArray();
        int n = 0;
        int n2 = 93;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x43));
            n2 = n2;
        }
    }

    public static void b(int n, short s, int n2) {
        long cfr_ignored_0 = ((long)n << 32 | (long)s << 48 >>> 32 | (long)n2 << 48 >>> 48) ^ b;
        a = c;
    }
}


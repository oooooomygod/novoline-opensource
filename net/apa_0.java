/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.aPa
 */
public class apa_0 {
    public static String a = "rw";
    private static String c = "rw";
    private static long b = a1c.a(-9138495001371320593L, 651285561627271092L, null).a(258973778157484L);

    public static void b(int n, int n2, int n3) {
        long cfr_ignored_0 = ((long)n << 32 | (long)n2 << 48 >>> 32 | (long)n3 << 48 >>> 48) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x6EA0C45C79FDL;
        long l5 = l4 ^ 0x22063046C8F1L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "JF".toCharArray();
        int n = 0;
        int n2 = 26;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x22));
            n2 = n2;
        }
    }
}


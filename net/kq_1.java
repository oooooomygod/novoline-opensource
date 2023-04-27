/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.kQ
 */
public class kq_1 {
    public static String a = "random.orb";
    private static long b = a1c.a(-980602561239026148L, 648603596444816429L, null).a(203509192018035L);
    private static String c = "random.orb";

    public static void b(short s, int n, char c) {
        long cfr_ignored_0 = ((long)s << 48 | (long)n << 32 >>> 16 | (long)c << 48 >>> 48) ^ b;
        a = kq_1.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x62F98FFE3F02L;
        long l5 = l4 ^ 0x65CE1E6FC7DAL;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "jv\u001eZW^:we\u0012".toCharArray();
        int n = 0;
        int n2 = 57;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x21));
            n2 = n2;
        }
    }
}


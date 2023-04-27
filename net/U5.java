/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class U5 {
    public static String a = ")";
    public static String b = "MongoDBLong(value=";
    private static long c = a1c.a(-1618590343370383204L, 5415397932784921363L, null).a(176860575072935L);
    private static String d = "MongoDBLong(value=";

    public static void b(short s, char c, int n) {
        long cfr_ignored_0 = ((long)s << 48 | (long)c << 48 >>> 16 | (long)n << 32 >>> 32) ^ U5.c;
        a = ")";
        b = d;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = c ^ 0x3193130A8065L;
        long l5 = l4 ^ 0x36FE4FD3D783L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 32 >>> 32);
        char[] cArray = "k+%P=\u0017<j+%Pz%\u001fJ1.\n".toCharArray();
        int n = 0;
        int n2 = 34;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 4));
            n2 = n2;
        }
    }
}


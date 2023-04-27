/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.aUr
 */
public class aur_0 {
    private static String e = "Multiple vertex elements of the same type other than UVs are not supported. Forcing type to UV.";
    public static String a = ",";
    private static long d = a1c.a(4921877576309916952L, -4895564920146865603L, null).a(9571496710368L);
    public static String c = "Multiple vertex elements of the same type other than UVs are not supported. Forcing type to UV.";
    public static String b = ",";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = d ^ 0x6E30A46EB5F1L;
        long l5 = l4 ^ 0x6E4901E81B6EL;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "z/YzwP\nRzCklT\u0003OzPb{M\u0003Y.F.qFFC2P.mA\u000bRzAwnEFX.]kl\u0000\u0012_;[.Kv\u0015\u0017;Gk>N\tCzF{nP\tE.Pj0\u0000 X(VgpGFC#Ek>T\t\u0017\u000fc ".toCharArray();
        int n = 0;
        int n2 = 51;
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

    public static void b(short s, int n, short s3) {
        long cfr_ignored_0 = ((long)s << 48 | (long)n << 32 >>> 16 | (long)s3 << 48 >>> 48) ^ d;
        c = e;
        b = ",";
        a = ",";
    }
}


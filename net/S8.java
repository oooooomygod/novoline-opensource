/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class S8 {
    private static String d = "\n\n";
    public static String a = " ";
    public static String b = "\n\n";
    private static long c = a1c.a(6990359781557329029L, 9097301397737383431L, null).a(156740156847831L);

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = c ^ 0x780A1D158FDL;
        long l5 = l4 ^ 0x13C045F8F294L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        long cfr_ignored_1 = l5 << 16 >>> 16;
        char[] cArray = "S\u0016".toCharArray();
        int n = 0;
        int n2 = 20;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x4D));
            n2 = n2;
        }
    }

    public static void b(short s, long l4) {
        long cfr_ignored_0 = ((long)s << 48 | l4 << 16 >>> 16) ^ c;
        b = d;
        a = " ";
    }
}


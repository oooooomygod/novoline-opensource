/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.afk
 */
public class afk_2 {
    private static String c = "cannot copy value of property from different modules";
    private static long b = a1c.a(4129678829259995398L, 463562558636686266L, null).a(152817748037399L);
    public static String a = "cannot copy value of property from different modules";

    public static void b(int n, char c, char c2) {
        long cfr_ignored_0 = ((long)n << 32 | (long)c << 48 >>> 32 | (long)c2 << 48 >>> 48) ^ b;
        a = afk_2.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x63A0A35CCF36L;
        long l5 = l4 ^ 0x52B9C13F82ABL;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "eHW\u001a?PgeFI\rpR&j\\\\T?Bgv[V\u00045V3\u007f\t_\u0006?Igb@_\u00125V\"h]\u0019\u0019?@2jLJ".toCharArray();
        int n = 0;
        int n2 = 106;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x6C));
            n2 = n2;
        }
    }
}


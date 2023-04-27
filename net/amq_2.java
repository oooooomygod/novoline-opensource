/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.amq
 */
public class amq_2 {
    public static String a = "Error in class '";
    private static String d = "Error in class '";
    private static long c = a1c.a(1957157470998236061L, -2400978867233392228L, null).a(45336060259101L);
    public static String b = "'";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = c ^ 0x36F70E0A95BL;
        long l5 = l4 ^ 0x56D3819B9F1L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        long cfr_ignored_1 = l5 << 16 >>> 16;
        char[] cArray = "\"|f\bp\\\u0003\t.w\u000bc\u000f\u0019G)".toCharArray();
        int n = 0;
        int n2 = 58;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x5D));
            n2 = n2;
        }
    }

    public static void b(short s, long l4) {
        long cfr_ignored_0 = ((long)s << 48 | l4 << 16 >>> 16) ^ c;
        b = "'";
        a = d;
    }
}


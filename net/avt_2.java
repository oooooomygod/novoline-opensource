/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.avt
 */
public class avt_2 {
    private static long b = a1c.a(1523976867378042987L, 2577233304136727430L, null).a(7988715846854L);
    public static String a = "type";
    private static String c = "type";

    public static void b(byte by, long l4) {
        long cfr_ignored_0 = ((long)by << 56 | l4 << 8 >>> 8) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x4C4E8887602L;
        long l5 = l4 ^ 0x27C90698BDE6L;
        int cfr_ignored_0 = (int)(l5 >>> 56);
        long cfr_ignored_1 = l5 << 8 >>> 8;
        char[] cArray = "\u001bk\u0011!".toCharArray();
        int n = 0;
        int n2 = 32;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x4F));
            n2 = n2;
        }
    }
}


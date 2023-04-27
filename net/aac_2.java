/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.aac
 */
public class aac_2 {
    private static long c = a1c.a(-3411110400211374041L, -6048358187058094242L, null).a(180115416204782L);
    public static String b = "!";
    private static String d = ".tooltip.";
    public static String a = ".tooltip.";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = c ^ 0x48B75696AA6EL;
        long l5 = l4 ^ 0x6F7F333E5D95L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "qp?xJL\u0003/*".toCharArray();
        int n = 0;
        int n2 = 111;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x30));
            n2 = n2;
        }
    }

    public static void b(char c, int n, short s) {
        long cfr_ignored_0 = ((long)c << 48 | (long)n << 32 >>> 16 | (long)s << 48 >>> 48) ^ aac_2.c;
        b = "!";
        a = d;
    }
}


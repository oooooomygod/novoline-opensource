/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.axi
 */
public class axi_2 {
    public static String a = "gui.done";
    private static String c = "gui.done";
    private static long b = a1c.a(406528284880312121L, 5021010472559501644L, null).a(140077246068225L);

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x5DD3DD1E4321L;
        long l5 = l4 ^ 0x627D0ACEFBBFL;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 32 >>> 32);
        char[] cArray = "Cc\u0015d$}\u007fA".toCharArray();
        int n = 0;
        int n2 = 68;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x60));
            n2 = n2;
        }
    }

    public static void b(short s, short s3, int n) {
        long cfr_ignored_0 = ((long)s << 48 | (long)s3 << 48 >>> 16 | (long)n << 32 >>> 32) ^ b;
        a = c;
    }
}


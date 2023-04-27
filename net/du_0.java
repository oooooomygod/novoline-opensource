/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.Du
 */
public class du_0 {
    public static String a = "Missing particle!";
    private static long b = a1c.a(-6175477552036306728L, -5274827445450508848L, null).a(177047136468960L);
    private static String c = "Missing particle!";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x4A6E178B3154L;
        long l5 = l4 ^ 0x76B08BCC35F9L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 32 >>> 32);
        char[] cArray = "\u0016.I\u0004I\u0014s{7[\u0005T\u0013w7\"\u001b".toCharArray();
        int n = 0;
        int n2 = 40;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x73));
            n2 = n2;
        }
    }

    public static void b(char c, char c2, int n) {
        long cfr_ignored_0 = ((long)c << 48 | (long)c2 << 48 >>> 16 | (long)n << 32 >>> 32) ^ b;
        a = du_0.c;
    }
}


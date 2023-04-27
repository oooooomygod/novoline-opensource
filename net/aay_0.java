/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.aaY
 */
public class aay_0 {
    private static String c = "Alt Info";
    private static long b = a1c.a(-6141308272956565598L, -7221500880534030466L, null).a(209047072783078L);
    public static String a = "Alt Info";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x3A0C2B7CD8E1L;
        long l5 = l4 ^ 0x1C6FD9967D5EL;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        long cfr_ignored_1 = l5 << 32 >>> 32;
        char[] cArray = "w)I\u0012RD\u0003Y".toCharArray();
        int n = 0;
        int n2 = 80;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x66));
            n2 = n2;
        }
    }

    public static void b(int n, long l4) {
        long cfr_ignored_0 = ((long)n << 32 | l4 << 32 >>> 32) ^ b;
        a = c;
    }
}


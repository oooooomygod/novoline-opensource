/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.vt
 */
public class vt_1 {
    private static long b = a1c.a(4967416215503885183L, 5143355658588598062L, null).a(946939142174L);
    private static String c = "facing";
    public static String a = "facing";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x74A54EBC77F8L;
        long l5 = l4 ^ 0x7E8E9C38C56L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "-\n/;\nr".toCharArray();
        int n = 0;
        int n2 = 102;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x2D));
            n2 = n2;
        }
    }

    public static void b(char c, int n, int n2) {
        long cfr_ignored_0 = ((long)c << 48 | (long)n << 32 >>> 16 | (long)n2 << 48 >>> 48) ^ b;
        a = vt_1.c;
    }
}


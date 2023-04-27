/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.p6
 */
public class p6_0 {
    public static String a = "age";
    private static long b = a1c.a(-1204901588680965872L, -1079114615231337242L, null).a(265569070542370L);
    private static String c = "age";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x1D35457DC91DL;
        long l5 = l4 ^ 0x789F027EAEB5L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        long cfr_ignored_1 = l5 << 32 >>> 32;
        char[] cArray = "\u0016g#".toCharArray();
        int n = 0;
        int n2 = 53;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x42));
            n2 = n2;
        }
    }

    public static void b(int n, long l4) {
        long cfr_ignored_0 = ((long)n << 32 | l4 << 32 >>> 32) ^ b;
        a = c;
    }
}


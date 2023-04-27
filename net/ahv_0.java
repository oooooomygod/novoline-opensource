/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.aHv
 */
public class ahv_0 {
    private static String c = "durability";
    public static String a = "durability";
    private static long b = a1c.a(-1142821730181461146L, 8269748081095251015L, null).a(87946094756552L);

    public static void b(char c, int n, int n2) {
        long cfr_ignored_0 = ((long)c << 48 | (long)n << 32 >>> 16 | (long)n2 << 48 >>> 48) ^ b;
        a = ahv_0.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x544074AFB4BBL;
        long l5 = l4 ^ 0x141CBE831BB7L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "\nP)T4~\u0019\u0007Q\"".toCharArray();
        int n = 0;
        int n2 = 102;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 8));
            n2 = n2;
        }
    }
}


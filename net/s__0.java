/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.s_
 */
public class s__0 {
    private static long b = a1c.a(1660379837707673005L, -4114498354521621344L, null).a(1708427392655L);
    public static String a = "commands.generic.entity.notFound";
    private static String c = "commands.generic.entity.notFound";

    public static void b(int n, int n2, int n3) {
        long cfr_ignored_0 = ((long)n << 32 | (long)n2 << 48 >>> 32 | (long)n3 << 48 >>> 48) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x55BDA0D3B2F8L;
        long l5 = l4 ^ 0x48BFCBFD9DBBL;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "sx\no]\u0006Yc9\u0000gR\rOytIgR\u001cTdnIlS\u001c{\u007fb\tf".toCharArray();
        int n = 0;
        int n2 = 81;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x41));
            n2 = n2;
        }
    }
}


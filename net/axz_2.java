/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.axz
 */
public class axz_2 {
    private static long b = a1c.a(-3509937553468019376L, -5841575910453147679L, null).a(117742640045921L);
    public static String a = "ListConfigValue{values=";
    private static String c = "ListConfigValue{values=";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x36A9A9218090L;
        long l5 = l4 ^ 0xE5969E4EEB8L;
        int cfr_ignored_0 = (int)(l5 >>> 56);
        long cfr_ignored_1 = l5 << 8 >>> 8;
        char[] cArray = ">u/u8[\u0010\u0014u;W\u001aX\u000b\u0017g*`\u0017A\u001b\u0001!".toCharArray();
        int n = 0;
        int n2 = 82;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x20));
            n2 = n2;
        }
    }

    public static void b(byte by, long l4) {
        long cfr_ignored_0 = ((long)by << 56 | l4 << 8 >>> 8) ^ b;
        a = c;
    }
}


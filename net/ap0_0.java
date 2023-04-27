/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.ap0
 */
public class ap0_0 {
    private static String e = "Basic";
    private static long d = a1c.a(-2223656339839998542L, 2840573454930382527L, null).a(72327842496405L);
    public static String b = "B";
    public static String a = "Basic";
    public static String c = "A";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = d ^ 0x17C41109E6AL;
        long l5 = l4 ^ 0x3FF2FA934F2CL;
        long cfr_ignored_0 = l5 >>> 32;
        int cfr_ignored_1 = (int)(l5 << 32 >>> 32);
        char[] cArray = "[u#C#".toCharArray();
        int n = 0;
        int n2 = 76;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x55));
            n2 = n2;
        }
    }

    public static void b(long l4, int n) {
        long cfr_ignored_0 = (l4 << 32 | (long)n << 32 >>> 32) ^ d;
        a = e;
        c = "A";
        b = "B";
    }
}


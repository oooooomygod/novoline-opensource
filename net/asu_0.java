/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.aSu
 */
public class asu_0 {
    private static String c = "mob.sheep.shear";
    private static long b = a1c.a(-5823895358688575540L, 4191336112946427745L, null).a(37479104407967L);
    public static String a = "mob.sheep.shear";

    public static void b(int n, short s, char c) {
        long cfr_ignored_0 = ((long)n << 32 | (long)s << 48 >>> 32 | (long)c << 48 >>> 48) ^ b;
        a = asu_0.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x7B237349C12CL;
        long l5 = l4 ^ 0x782F9F2CB6EEL;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "%b:i2mV-}v4)`R:".toCharArray();
        int n = 0;
        int n2 = 123;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x33));
            n2 = n2;
        }
    }
}


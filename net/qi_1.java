/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.qI
 */
public class qi_1 {
    private static String d = "multiplayer.stopSleeping";
    private static long c = a1c.a(-8330416806490141213L, -3537002127680665395L, null).a(34452280435131L);
    public static String a = "multiplayer.stopSleeping";
    public static String b = "";

    public static void b(long l4, char c) {
        long cfr_ignored_0 = (l4 << 16 | (long)c << 48 >>> 48) ^ qi_1.c;
        b = "";
        a = d;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = c ^ 0x2A37F4F4D304L;
        long l5 = l4 ^ 0x4CD849914D6EL;
        long cfr_ignored_0 = l5 >>> 16;
        int cfr_ignored_1 = (int)(l5 << 48 >>> 48);
        char[] cArray = "+1BvDJw'=Kp\u0003Io)4}nH_k/*I".toCharArray();
        int n = 0;
        int n2 = 94;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x18));
            n2 = n2;
        }
    }
}


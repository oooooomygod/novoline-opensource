/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class aCS {
    private static long b = a1c.a(-8066451277492317499L, 848636135898526029L, null).a(241313949610852L);
    public static String a = "mobGriefing";
    private static String c = "mobGriefing";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x23A4A89A1FCBL;
        long l5 = l4 ^ 0x6C87AC515776L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 40);
        int cfr_ignored_2 = (int)(l5 << 56 >>> 56);
        char[] cArray = "A$z>\u001aT6J\"v\u001e".toCharArray();
        int n = 0;
        int n2 = 92;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x70));
            n2 = n2;
        }
    }

    public static void b(int n, int n2, byte by) {
        long cfr_ignored_0 = ((long)n << 32 | (long)n2 << 40 >>> 32 | (long)by << 56 >>> 56) ^ b;
        a = c;
    }
}


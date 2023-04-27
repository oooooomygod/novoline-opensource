/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class aCJ {
    private static long b = a1c.a(-941284537918031669L, -4646674355829133361L, null).a(183508786709061L);
    private static String c = "mobGriefing";
    public static String a = "mobGriefing";

    public static void b(char c, char c2, int n) {
        long cfr_ignored_0 = ((long)c << 48 | (long)c2 << 48 >>> 16 | (long)n << 32 >>> 32) ^ b;
        a = aCJ.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x78CEC185F807L;
        long l5 = l4 ^ 0x606ABC77ACEL;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 32 >>> 32);
        char[] cArray = "9N\u0015iVt\u001c2H\u0019I".toCharArray();
        int n = 0;
        int n2 = 16;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x44));
            n2 = n2;
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.ao1
 */
public class ao1_0 {
    private static String c = "Unsupported mob type for RestrictOpenDoorGoal";
    private static long b = a1c.a(-8399342937951917088L, 1118750089946909426L, null).a(31813496058587L);
    public static String a = "Unsupported mob type for RestrictOpenDoorGoal";

    public static void b(char c, int n, int n2) {
        long cfr_ignored_0 = ((long)c << 48 | (long)n << 32 >>> 16 | (long)n2 << 48 >>> 48) ^ b;
        a = ao1_0.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x26AC8F67EB38L;
        long l5 = l4 ^ 0xE2E8026250AL;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "(6;Sa\f9\u000f,-B1\u00119\u001fx<_a\u0019v\u001b7:\u0006C\u0019%\t*!Ee3&\u00186\fI~\u000e\u0011\u00129$".toCharArray();
        int n = 0;
        int n2 = 63;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x42));
            n2 = n2;
        }
    }
}


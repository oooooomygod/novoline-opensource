/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.aLz
 */
public class alz_0 {
    public static String a = "Netty Server IO #%d";
    private static String c = "Netty Server IO #%d";
    private static long b = a1c.a(7629743151430415460L, 3903734023372562684L, null).a(202066398950133L);

    public static void b(char c, int n, int n2) {
        long cfr_ignored_0 = ((long)c << 48 | (long)n << 32 >>> 16 | (long)n2 << 48 >>> 48) ^ b;
        a = alz_0.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x1D4355322340L;
        long l5 = l4 ^ 0x2093ACF82ADBL;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "6A=\u0005AMt\u001dV?\u0014JMn7\u0004jT\\".toCharArray();
        int n = 0;
        int n2 = 72;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x30));
            n2 = n2;
        }
    }
}


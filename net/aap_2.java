/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.aap
 */
public class aap_2 {
    private static String c = "0x18";
    private static long b = a1c.a(3499278028422282657L, -5302274164592703902L, null).a(139507518291620L);
    public static String a = "0x18";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x7D6E862EFBFAL;
        long l5 = l4 ^ 0x2406A6EF98FDL;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "=n7(".toCharArray();
        int n = 0;
        int n2 = 85;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x58));
            n2 = n2;
        }
    }

    public static void b(short s, int n, char c) {
        long cfr_ignored_0 = ((long)s << 48 | (long)n << 32 >>> 16 | (long)c << 48 >>> 48) ^ b;
        a = aap_2.c;
    }
}


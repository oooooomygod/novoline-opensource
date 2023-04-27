/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class aZI {
    public static String a = "deadmau5";
    private static String c = "deadmau5";
    private static long b = a1c.a(7603499772403869536L, 4469912556774707680L, null).a(92604395066582L);

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x8E243489AA8L;
        long l5 = l4 ^ 0x1A1FD50DDDDL;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 32 >>> 32);
        char[] cArray = "8\\\u0017Q\u00103;i".toCharArray();
        int n = 0;
        int n2 = 18;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x4E));
            n2 = n2;
        }
    }

    public static void b(char c, char c2, int n) {
        long cfr_ignored_0 = ((long)c << 48 | (long)c2 << 48 >>> 16 | (long)n << 32 >>> 32) ^ b;
        a = aZI.c;
    }
}


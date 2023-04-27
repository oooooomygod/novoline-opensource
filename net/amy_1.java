/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.amY
 */
public class amy_1 {
    public static String a = "Repair";
    private static long b = a1c.a(2027288668605523835L, 5513774331333596429L, null).a(110674383304946L);
    private static String c = "Repair";

    public static void b(char c, char c2, int n) {
        long cfr_ignored_0 = ((long)c << 48 | (long)c2 << 48 >>> 16 | (long)n << 32 >>> 32) ^ b;
        a = amy_1.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x2E89FCD1EA29L;
        long l5 = l4 ^ 0x7F682DC1ED57L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 32 >>> 32);
        char[] cArray = "\bxj'\u000f\u0011".toCharArray();
        int n = 0;
        int n2 = 114;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x28));
            n2 = n2;
        }
    }
}


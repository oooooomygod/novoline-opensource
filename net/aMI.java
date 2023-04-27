/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class aMI {
    private static long b = a1c.a(8277830422722337034L, -2572817111061216577L, null).a(220590894762997L);
    public static String a = "gui.done";
    private static String c = "gui.done";

    public static void b(char c, int n, char c2) {
        long cfr_ignored_0 = ((long)c << 48 | (long)n << 32 >>> 16 | (long)c2 << 48 >>> 48) ^ b;
        a = aMI.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x18A0A710C669L;
        long l5 = l4 ^ 0x203CF672D6FEL;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "}\u0001~=k>t\u007f".toCharArray();
        int n = 0;
        int n2 = 68;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x5E));
            n2 = n2;
        }
    }
}


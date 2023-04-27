/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class aPB {
    private static long b = a1c.a(3144158096474635758L, 8641385594685400189L, null).a(78561569165777L);
    public static String a = "Sign";
    private static String c = "Sign";

    public static void b(int n, int n2) {
        long cfr_ignored_0 = ((long)n << 32 | (long)n2 << 32 >>> 32) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x1702E5ACC367L;
        long l5 = l4 ^ 0x38834890DE56L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 32);
        char[] cArray = "\r< =".toCharArray();
        int n = 0;
        int n2 = 114;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x2C));
            n2 = n2;
        }
    }
}


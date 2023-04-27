/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.arL
 */
public class arl_1 {
    private static long b = a1c.a(-4169139394065843259L, 2424162584695510877L, null).a(260973949700476L);
    private static String c = "commands.generic.num.invalid";
    public static String a = "commands.generic.num.invalid";

    public static void b(long l4, int n) {
        long cfr_ignored_0 = (l4 << 32 | (long)n << 32 >>> 32) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x464887E83A5AL;
        long l5 = l4 ^ 0x6AABDB4E27FBL;
        long cfr_ignored_0 = l5 >>> 32;
        int cfr_ignored_1 = (int)(l5 << 32 >>> 32);
        char[] cArray = ">\u000b\f\u001bv-P.J\u0006\u0013y&F4\u0007O\u0018b.\u001a4\n\u0017\u0017{*P".toCharArray();
        int n = 0;
        int n2 = 63;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x62));
            n2 = n2;
        }
    }
}


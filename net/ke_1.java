/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.kE
 */
public class ke_1 {
    private static long b = a1c.a(1236183383981024165L, 5579828412101818555L, null).a(212268651099294L);
    public static String a = "none";
    private static String c = "none";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x6C5630146F8DL;
        long l5 = l4 ^ 0x595285FD1035L;
        long cfr_ignored_0 = l5 >>> 32;
        int cfr_ignored_1 = (int)(l5 << 32 >>> 32);
        char[] cArray = "\u000eM ;".toCharArray();
        int n = 0;
        int n2 = 102;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 6));
            n2 = n2;
        }
    }

    public static void b(long l4, int n) {
        long cfr_ignored_0 = (l4 << 32 | (long)n << 32 >>> 32) ^ b;
        a = c;
    }
}


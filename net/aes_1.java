/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.aeS
 */
public class aes_1 {
    private static long b = a1c.a(3190723313800272721L, 5791962319376373781L, null).a(73747777865230L);
    private static String c = "This is a utility class and cannot be instantiated";
    public static String a = "This is a utility class and cannot be instantiated";

    public static void b(int n, int n2) {
        long cfr_ignored_0 = ((long)n << 32 | (long)n2 << 32 >>> 32) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x60D76EBE1DEBL;
        long l5 = l4 ^ 0x39FC01C0C4EBL;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 32);
        char[] cArray = "e\u0015\u0001\u0004\u001f\u0017.\u0011\u001cH\u0002K\u00171X\t\u0011W\\\u0012<B\u000eH\u0016Q\u001a}R\u001c\u0006\u0019P\n}S\u0018H\u001eQ\r)P\u0013\u001c\u001e^\n8U".toCharArray();
        int n = 0;
        int n2 = 109;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x5C));
            n2 = n2;
        }
    }
}


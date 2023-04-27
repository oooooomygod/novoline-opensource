/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class aGY {
    private static long b = a1c.a(2541982042863472983L, 261925592051154412L, null).a(54987649852527L);
    public static String a = "END";
    private static String c = "END";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x5E04F94CA642L;
        long cfr_ignored_0 = l4 ^ 0x3B781D2A9643L;
        char[] cArray = "S<\f".toCharArray();
        int n = 0;
        int n2 = 17;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_1 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 7));
            n2 = n2;
        }
    }

    public static void b(long l4) {
        l4 = b ^ l4;
        a = c;
    }
}


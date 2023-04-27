/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class aA8 {
    private static long b = a1c.a(6821469872028525093L, -2085571286513536187L, null).a(98654561389847L);
    private static String c = "minecraft:mob.guardian.attack";
    public static String a = "minecraft:mob.guardian.attack";

    public static void b(char c, int n, char c2) {
        long cfr_ignored_0 = ((long)c << 48 | (long)n << 32 >>> 16 | (long)c2 << 48 >>> 48) ^ b;
        a = aA8.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x2B54A3E4AB78L;
        long l5 = l4 ^ 0x7A52C7A7C5AAL;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "\u0019+WiK~\u0013\u00126\u0003aGn\\\u00137X~Le\u0013\u001alXx\\m\u0011\u001f".toCharArray();
        int n = 0;
        int n2 = 97;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x15));
            n2 = n2;
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.pj
 */
public class pj_2 {
    private static String c = "random.fizz";
    public static String a = "random.fizz";
    private static long b = a1c.a(3434603888708955334L, -5913494072722446016L, null).a(37956924413341L);

    public static void b(int n, short s, int n2) {
        long cfr_ignored_0 = ((long)n << 32 | (long)s << 48 >>> 32 | (long)n2 << 48 >>> 48) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0xF23DA443C8EL;
        long l5 = l4 ^ 0x59F9DC139AEDL;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "f_\u0004tX\u001eLrW\u0010j".toCharArray();
        int n = 0;
        int n2 = 85;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x41));
            n2 = n2;
        }
    }
}


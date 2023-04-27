/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.aw6
 */
public class aw6_0 {
    private static String c = "axe";
    private static long b = a1c.a(-6799359250614298917L, -6472817075477066899L, null).a(135515473881088L);
    public static String a = "axe";

    public static void b(int n, short s, int n2) {
        long cfr_ignored_0 = ((long)n << 32 | (long)s << 48 >>> 32 | (long)n2 << 48 >>> 48) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x206D69A7868BL;
        long l5 = l4 ^ 0xEBBFC424C99L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "9_N".toCharArray();
        int n = 0;
        int n2 = 10;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x52));
            n2 = n2;
        }
    }
}


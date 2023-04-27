/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.l8
 */
public class l8_0 {
    private static long b = a1c.a(5917958321525827601L, 3307112588581007994L, null).a(111923820357321L);
    private static String c = "Weapon modifier";
    public static String a = "Weapon modifier";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x6C4A32DD27C9L;
        long l5 = l4 ^ 0x6D87CC56A5A7L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "f>\te\u001aQ`\\4\f|\u0013V%C".toCharArray();
        int n = 0;
        int n2 = 76;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x7D));
            n2 = n2;
        }
    }

    public static void b(int n, short s, int n2) {
        long cfr_ignored_0 = ((long)n << 32 | (long)s << 48 >>> 32 | (long)n2 << 48 >>> 48) ^ b;
        a = c;
    }
}


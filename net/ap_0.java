/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.Ap
 */
public class ap_0 {
    public static String a = "random.bow";
    private static long b = a1c.a(-5078491386703981397L, 4109129929403094380L, null).a(131831541290673L);
    private static String c = "random.bow";

    public static void b(long l4, short s) {
        long cfr_ignored_0 = (l4 << 16 | (long)s << 48 >>> 48) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x3ECBD75DDBC6L;
        long l5 = l4 ^ 0x59DC5BA2CBDCL;
        long cfr_ignored_0 = l5 >>> 16;
        int cfr_ignored_1 = (int)(l5 << 48 >>> 48);
        char[] cArray = "\u0014v/ Pg\t\u0004x6".toCharArray();
        int n = 0;
        int n2 = 70;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x20));
            n2 = n2;
        }
    }
}


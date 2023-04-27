/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.anj
 */
public class anj_2 {
    private static String c = "OW KNOWS!";
    public static String a = "OW KNOWS!";
    private static long b = a1c.a(-5322562292753630247L, 4624886142030923249L, null).a(212538331088362L);

    public static void b(int n, int n2, short s) {
        long cfr_ignored_0 = ((long)n << 32 | (long)n2 << 48 >>> 32 | (long)s << 48 >>> 48) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x58C41C99C8A4L;
        long l5 = l4 ^ 0x2FDB14705EC6L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "mJF\u0001\u001dZ8q<".toCharArray();
        int n = 0;
        int n2 = 110;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x4C));
            n2 = n2;
        }
    }
}


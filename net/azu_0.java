/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.aZu
 */
public class azu_0 {
    private static long b = a1c.a(4389808402125967210L, 7144025631255191370L, null).a(119198761966812L);
    public static String a = "facing";
    private static String c = "facing";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x2AA6840A2CB6L;
        long l5 = l4 ^ 0x23B599E17163L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "kbb~Wf".toCharArray();
        int n = 0;
        int n2 = 105;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x64));
            n2 = n2;
        }
    }

    public static void b(short s, int n, short s3) {
        long cfr_ignored_0 = ((long)s << 48 | (long)n << 32 >>> 16 | (long)s3 << 48 >>> 48) ^ b;
        a = c;
    }
}


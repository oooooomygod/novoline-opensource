/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class a2L {
    private static String c = "mobGriefing";
    private static long b = a1c.a(3813168699484098142L, 1766125081915362956L, null).a(192886166981959L);
    public static String a = "mobGriefing";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x529397BBBCB2L;
        long l5 = l4 ^ 0x751A05C6C85CL;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "\u001ad\\@DLN\u0011bP`".toCharArray();
        int n = 0;
        int n2 = 64;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x37));
            n2 = n2;
        }
    }

    public static void b(short s, int n, short s3) {
        long cfr_ignored_0 = ((long)s << 48 | (long)n << 32 >>> 16 | (long)s3 << 48 >>> 48) ^ b;
        a = c;
    }
}


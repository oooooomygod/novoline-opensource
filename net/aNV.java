/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class aNV {
    private static String c = "textures/entity/steve.png";
    public static String a = "textures/entity/steve.png";
    private static long b = a1c.a(5084557456629860343L, -6457237464591014635L, null).a(135033674287041L);

    public static void b(int n, char c, char c2) {
        long cfr_ignored_0 = ((long)n << 32 | (long)c << 48 >>> 32 | (long)c2 << 48 >>> 48) ^ b;
        a = aNV.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x733E77152160L;
        long l5 = l4 ^ 0x6C3F03AD45FCL;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "O8\u001e\u0014w\u000f4Hr\u0003\u000ev\u0014%Br\u0015\u0014g\u000b4\u0015-\b\u0007".toCharArray();
        int n = 0;
        int n2 = 118;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x4D));
            n2 = n2;
        }
    }
}


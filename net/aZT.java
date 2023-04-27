/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class aZT {
    private static long b = a1c.a(6225355557779531835L, -2562942113192027640L, null).a(139526729355025L);
    private static String c = "textures/entity/armorstand/wood.png";
    public static String a = "textures/entity/armorstand/wood.png";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x2DF8FA061FA4L;
        long l5 = l4 ^ 0x4AEBC6BE7265L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "\u001a\u0011\u0017r+(\u001c\u001d[\nh*3\r\u0017[\u000et35\u000b\u001d\u0000\u000eh:u\u000e\u0001\u001b\u000b(.4\u001e".toCharArray();
        int n = 0;
        int n2 = 27;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x75));
            n2 = n2;
        }
    }

    public static void b(int n, int n2, char c) {
        long cfr_ignored_0 = ((long)n << 32 | (long)n2 << 48 >>> 32 | (long)c << 48 >>> 48) ^ b;
        a = aZT.c;
    }
}


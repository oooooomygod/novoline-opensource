/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class aVO {
    private static String c = "textures/entity/silverfish.png";
    private static long b = a1c.a(-925001878569657151L, -5563375571595903958L, null).a(233583769030161L);
    public static String a = "textures/entity/silverfish.png";

    public static void b(int n, int n2, int n3) {
        long cfr_ignored_0 = ((long)n << 32 | (long)n2 << 48 >>> 32 | (long)n3 << 48 >>> 48) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x50A044D25694L;
        long l5 = l4 ^ 0x11C39CC74133L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "\u001b7\n\b\u001a|\"\u001c}\u0017\u0012\u001bg3\u0016}\u0001\u0015\u0003x\"\u001d4\u001b\u000f\u0007 7\u00015".toCharArray();
        int n = 0;
        int n2 = 21;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x7A));
            n2 = n2;
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class aM2 {
    private static String c = "textures/entity/lead_knot.png";
    public static String a = "textures/entity/lead_knot.png";
    private static long b = a1c.a(-7239550252342177864L, 3740184408336948836L, null).a(122059922000987L);

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x43B92128644CL;
        long l5 = l4 ^ 0x1785CB1BAE18L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        long cfr_ignored_1 = l5 << 16 >>> 16;
        char[] cArray = "@V1qA\u001fWG\u001c,k@\u0004FM\u001c%`U\tm_]&q\u001a\u001d\\S".toCharArray();
        int n = 0;
        int n2 = 108;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x58));
            n2 = n2;
        }
    }

    public static void b(short s, long l4) {
        long cfr_ignored_0 = ((long)s << 48 | l4 << 16 >>> 16) ^ b;
        a = c;
    }
}


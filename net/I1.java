/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class I1 {
    private static long b = a1c.a(-5607261181751384779L, 5003216386332538026L, null).a(262573811924898L);
    public static String a = "textures/entity/endermite.png";
    private static String c = "textures/entity/endermite.png";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x201BDBB9B1C0L;
        long l5 = l4 ^ 0x69052EEABBEAL;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "\\\u0017\u000fv.\u0007\u0012[]\u0012l/\u001c\u0003Q]\u0012l?\u0010\u0005E\u001b\u0003gu\u0005\u0019O".toCharArray();
        int n = 0;
        int n2 = 100;
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

    public static void b(short s, int n, short s3) {
        long cfr_ignored_0 = ((long)s << 48 | (long)n << 32 >>> 16 | (long)s3 << 48 >>> 48) ^ b;
        a = c;
    }
}


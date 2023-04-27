/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.vb
 */
public class vb_2 {
    private static long b = a1c.a(-7715607745617873263L, 8809159184961224256L, null).a(212740745963506L);
    public static String a = "textures/entity/chicken.png";
    private static String c = "textures/entity/chicken.png";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x1040AE9FD652L;
        long l5 = l4 ^ 0x3F2FF0F5F3BL;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 32 >>> 32);
        char[] cArray = "UL[Tu7XR\u0006FNt,IX\u0006@Hi&VDG\rPn\"".toCharArray();
        int n = 0;
        int n2 = 8;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x29));
            n2 = n2;
        }
    }

    public static void b(short s, short s3, int n) {
        long cfr_ignored_0 = ((long)s << 48 | (long)s3 << 48 >>> 16 | (long)n << 32 >>> 32) ^ b;
        a = c;
    }
}


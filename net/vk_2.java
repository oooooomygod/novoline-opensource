/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.vk
 */
public class vk_2 {
    public static String a = "textures/entity/endercrystal/endercrystal.png";
    private static long b = a1c.a(-5428573356391095412L, 4314958868223197302L, null).a(260459882531194L);
    private static String c = "textures/entity/endercrystal/endercrystal.png";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x34E972B27858L;
        long l5 = l4 ^ 0x5B853E9D375EL;
        int cfr_ignored_0 = (int)(l5 >>> 56);
        int cfr_ignored_1 = (int)(l5 << 8 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 40 >>> 40);
        char[] cArray = "S3%c\u000bDvTy8y\n_g^y8y\u001aSaD$$d\nW\u007f\b33s\u001bDpU/.c\u001fZ=W8:".toCharArray();
        int n = 0;
        int n2 = 124;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x5B));
            n2 = n2;
        }
    }

    public static void b(byte by, int n, int n2) {
        long cfr_ignored_0 = ((long)by << 56 | (long)n << 32 >>> 8 | (long)n2 << 40 >>> 40) ^ b;
        a = c;
    }
}


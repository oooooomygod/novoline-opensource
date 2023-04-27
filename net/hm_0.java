/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.Hm
 */
public class hm_0 {
    private static long b = a1c.a(-1691971149447373612L, -7031637839693061037L, null).a(126759629447772L);
    public static String a = "arrowInfinite";
    private static String c = "arrowInfinite";

    public static void b(short s, long l4) {
        long cfr_ignored_0 = ((long)s << 48 | l4 << 16 >>> 16) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x17AA42566F3BL;
        long l5 = l4 ^ 0x43965AA412D2L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        long cfr_ignored_1 = l5 << 16 >>> 16;
        char[] cArray = "x5uM 3!\u007f.iK#\u001f".toCharArray();
        int n = 0;
        int n2 = 115;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x6A));
            n2 = n2;
        }
    }
}


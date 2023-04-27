/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.arG
 */
public class arg_1 {
    public static String a = "textures/gui/container/hopper.png";
    private static long b = a1c.a(3858531422190760055L, -1395984317564555040L, null).a(23356081436128L);
    private static String c = "textures/gui/container/hopper.png";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x511FF96D9D37L;
        long l5 = l4 ^ 0x50C81163A740L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        long cfr_ignored_1 = l5 << 16 >>> 16;
        char[] cArray = "r4DQ\u001aK)u~[P\u0006\u0016/i?HD\u0006W)t~TJ\u001fI)t\u007fLK\b".toCharArray();
        int n = 0;
        int n2 = 70;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x40));
            n2 = n2;
        }
    }

    public static void b(short s, long l4) {
        long cfr_ignored_0 = ((long)s << 48 | l4 << 16 >>> 16) ^ b;
        a = c;
    }
}


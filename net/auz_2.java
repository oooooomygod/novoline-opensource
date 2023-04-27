/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.auz
 */
public class auz_2 {
    public static String a = "textures/particle/footprint.png";
    private static long b = a1c.a(-474266801661356776L, 7639630554827529192L, null).a(145559047587743L);
    private static String c = "textures/particle/footprint.png";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x6551AFBB1182L;
        long l5 = l4 ^ 0x26146A228E7EL;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "|F0Tw//{\f8Ap)#kO-\u000fd2%|S:Il)dxM/".toCharArray();
        int n = 0;
        int n2 = 14;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 6));
            n2 = n2;
        }
    }

    public static void b(short s, int n, char c) {
        long cfr_ignored_0 = ((long)s << 48 | (long)n << 32 >>> 16 | (long)c << 48 >>> 48) ^ b;
        a = auz_2.c;
    }
}


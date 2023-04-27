/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.vf
 */
public class vf_2 {
    private static long b = a1c.a(7245040029475866564L, 7764459697821938046L, null).a(210625027019797L);
    private static String c = "Netty Epoll Client IO #%d";
    public static String a = "Netty Epoll Client IO #%d";

    public static void b(short s, int n, int n2) {
        long cfr_ignored_0 = ((long)s << 48 | (long)n << 32 >>> 16 | (long)n2 << 48 >>> 48) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x73B8AC199192L;
        long l5 = l4 ^ 0x364982C8C9CEL;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "9d[L\u0004T7\u0007nCT]7\u001e\u001edAL]==W\"\n\\".toCharArray();
        int n = 0;
        int n2 = 88;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x2F));
            n2 = n2;
        }
    }
}


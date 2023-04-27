/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.a1v
 */
public class a1v_0 {
    public static String a = "level";
    private static String c = "level";
    private static long b = a1c.a(-7620035932166626142L, 3633482487520604247L, null).a(267708610344976L);

    public static void b(long l4, int n) {
        long cfr_ignored_0 = (l4 << 32 | (long)n << 32 >>> 32) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x2244AF7E1FDCL;
        long l5 = l4 ^ 0x4707B9F91BD4L;
        long cfr_ignored_0 = l5 >>> 32;
        int cfr_ignored_1 = (int)(l5 << 32 >>> 32);
        char[] cArray = "N(f$Q".toCharArray();
        int n = 0;
        int n2 = 53;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x17));
            n2 = n2;
        }
    }
}


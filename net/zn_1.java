/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.zN
 */
public class zn_1 {
    private static long b = a1c.a(-2386791358235959337L, -7669745953916771937L, null).a(12398243499418L);
    public static String a = "mob.endermen.stare";
    private static String c = "mob.endermen.stare";

    public static void b(int n, long l4) {
        long cfr_ignored_0 = ((long)n << 32 | l4 << 32 >>> 32) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x5FA0B7E17F98L;
        long l5 = l4 ^ 0x2F8C7B03C5A0L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        long cfr_ignored_1 = l5 << 32 >>> 32;
        char[] cArray = "w\u001by\\\u0002-+\u007f\u0006v\u0017\tm<n\u0015i\u0017".toCharArray();
        int n = 0;
        int n2 = 78;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x54));
            n2 = n2;
        }
    }
}


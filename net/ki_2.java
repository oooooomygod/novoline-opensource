/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.ki
 */
public class ki_2 {
    public static String a = "*";
    private static long e = a1c.a(-7635027196085166963L, 7136719657202909001L, null).a(159591950459898L);
    private static String f = "null";
    public static String d = "x";
    public static String b = "null";
    public static String c = ":";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = e ^ 0x6D9CB3372C6CL;
        long l5 = l4 ^ 0x2532501A3996L;
        long cfr_ignored_0 = l5 >>> 32;
        int cfr_ignored_1 = (int)(l5 << 32 >>> 32);
        char[] cArray = "\u001d\u0018\u0016\u0003".toCharArray();
        int n = 0;
        int n2 = 39;
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

    public static void b(long l4, int n) {
        long cfr_ignored_0 = (l4 << 32 | (long)n << 32 >>> 32) ^ e;
        c = ":";
        b = f;
        a = "*";
        d = "x";
    }
}


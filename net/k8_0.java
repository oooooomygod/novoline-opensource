/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.k8
 */
public class k8_0 {
    private static String c = "File IO Thread";
    public static String a = "File IO Thread";
    private static long b = a1c.a(-4736589261469707510L, -4321588856989271358L, null).a(46961633452945L);

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x23ABBB4EAC79L;
        long l5 = l4 ^ 0x5C15AA559C71L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = " \u0006|i^z%F;x~\u001bR\u000e".toCharArray();
        int n = 0;
        int n2 = 68;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x22));
            n2 = n2;
        }
    }

    public static void b(char c, int n, int n2) {
        long cfr_ignored_0 = ((long)c << 48 | (long)n << 32 >>> 16 | (long)n2 << 48 >>> 48) ^ b;
        a = k8_0.c;
    }
}


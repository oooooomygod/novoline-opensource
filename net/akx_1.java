/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.akx
 */
public class akx_1 {
    private static String c = "Message{}";
    private static long b = a1c.a(3922545283632408520L, -5545750883419657988L, null).a(226899294457310L);
    public static String a = "Message{}";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x7B06C81AB528L;
        long l5 = l4 ^ 0x7AAB2C29B105L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "vf\u000e[\u0015dt@~".toCharArray();
        int n = 0;
        int n2 = 56;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 3));
            n2 = n2;
        }
    }

    public static void b(int n, char c, short s) {
        long cfr_ignored_0 = ((long)n << 32 | (long)c << 48 >>> 32 | (long)s << 48 >>> 48) ^ b;
        a = akx_1.c;
    }
}


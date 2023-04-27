/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class a93 {
    private static String c = "Fortress";
    public static String a = "Fortress";
    private static long b = a1c.a(956306662246811894L, 3174257244976689433L, null).a(132153039967483L);

    public static void b(short s, int n, char c) {
        long cfr_ignored_0 = ((long)s << 48 | (long)n << 32 >>> 16 | (long)c << 48 >>> 48) ^ b;
        a = a93.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x7AEEC497C5BEL;
        long l5 = l4 ^ 0x3DD0458FB11EL;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "\u0018\u0004f\u0015e6*-".toCharArray();
        int n = 0;
        int n2 = 127;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x21));
            n2 = n2;
        }
    }
}


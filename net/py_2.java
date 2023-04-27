/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.py
 */
public class py_2 {
    public static String a = "random.burp";
    private static long b = a1c.a(-6562893067860539841L, -510419520629490602L, null).a(49682915635991L);
    private static String c = "random.burp";

    public static void b(int n, short s, char c) {
        long cfr_ignored_0 = ((long)n << 32 | (long)s << 48 >>> 32 | (long)c << 48 >>> 48) ^ b;
        a = py_2.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0xA71E7C4F358L;
        long l5 = l4 ^ 0x17AADDA3E41DL;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "]\u001eYs\nk\u001eM\nEg".toCharArray();
        int n = 0;
        int n2 = 91;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x74));
            n2 = n2;
        }
    }
}


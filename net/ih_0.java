/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.Ih
 */
public class ih_0 {
    private static long c = a1c.a(6398617525360094380L, 7424187073307777550L, null).a(113085722055634L);
    public static String b = ".";
    private static String d = "(Reflector) Field not present: ";
    public static String a = "(Reflector) Field not present: ";

    public static void b(int n, char c, int n2) {
        long cfr_ignored_0 = ((long)n << 32 | (long)c << 48 >>> 32 | (long)n2 << 48 >>> 48) ^ ih_0.c;
        b = ".";
        a = d;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = c ^ 0x177A7DBD2BE4L;
        long l5 = l4 ^ 0x74C0D85C8A0BL;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "{\u000e4\u001d\t;L'3#RE\u0018F605[\u000b1[s,#\u001e\u0016;A'fq".toCharArray();
        int n = 0;
        int n2 = 87;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 4));
            n2 = n2;
        }
    }
}


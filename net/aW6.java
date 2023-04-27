/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class aW6 {
    private static String e = ", ";
    public static String b = ", ";
    public static String c = "]";
    private static long d = a1c.a(-8581016006014408993L, -7582982648055005668L, null).a(246618017874609L);
    public static String a = "[";

    public static void b(short s, int n, char c) {
        long cfr_ignored_0 = ((long)s << 48 | (long)n << 32 >>> 16 | (long)c << 48 >>> 48) ^ d;
        aW6.c = "]";
        a = "[";
        b = e;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = d ^ 0x569255ABAEA6L;
        long l5 = l4 ^ 0x2983040BC7AEL;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "\r\u0018".toCharArray();
        int n = 0;
        int n2 = 2;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x23));
            n2 = n2;
        }
    }
}


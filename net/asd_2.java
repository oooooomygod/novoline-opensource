/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.asd
 */
public class asd_2 {
    public static String a = "power";
    private static long b = a1c.a(8001472732361917982L, 2922522716323770875L, null).a(166095747736256L);
    private static String c = "power";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x3A31F356F8E7L;
        long l5 = l4 ^ 0x6D7B5C6ABBACL;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        long cfr_ignored_1 = l5 << 16 >>> 16;
        char[] cArray = "w[\u0015gb".toCharArray();
        int n = 0;
        int n2 = 80;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x57));
            n2 = n2;
        }
    }

    public static void b(char c, long l4) {
        long cfr_ignored_0 = ((long)c << 48 | l4 << 16 >>> 16) ^ b;
        a = asd_2.c;
    }
}


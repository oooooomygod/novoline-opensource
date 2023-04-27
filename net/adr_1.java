/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.adR
 */
public class adr_1 {
    private static long b = a1c.a(-1836728855943412493L, 9115857246873900989L, null).a(68466248865845L);
    public static String a = "This is a utility class and cannot be instantiated";
    private static String c = "This is a utility class and cannot be instantiated";

    public static void b(int n, long l4) {
        long cfr_ignored_0 = ((long)n << 32 | l4 << 32 >>> 32) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x40F2D8DA2D44L;
        long l5 = l4 ^ 0xAE94F2982D4L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        long cfr_ignored_1 = l5 << 32 >>> 32;
        char[] cArray = "Q9\u000f$^^N%0F\"\n^Ql%\u001fw\u001d[\\v\"F6\u0010S\u001df0\b9\u0011C\u001dg4F>\u0010DId?\u0012>\u001fCXa".toCharArray();
        int n = 0;
        int n2 = 19;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x16));
            n2 = n2;
        }
    }
}


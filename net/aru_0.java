/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.aRu
 */
public class aru_0 {
    public static String a = "random.bow";
    private static String c = "random.bow";
    private static long b = a1c.a(-7409955818027275103L, 7756710165852853113L, null).a(113104501453802L);

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x500051652253L;
        long l5 = l4 ^ 0x45B43E6BA159L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        long cfr_ignored_1 = l5 << 16 >>> 16;
        char[] cArray = "bJhh~LbrDq".toCharArray();
        int n = 0;
        int n2 = 11;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x1B));
            n2 = n2;
        }
    }

    public static void b(short s, long l4) {
        long cfr_ignored_0 = ((long)s << 48 | l4 << 16 >>> 16) ^ b;
        a = c;
    }
}


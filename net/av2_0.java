/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.av2
 */
public class av2_0 {
    private static long b = a1c.a(2264332964087720300L, -7139670103915190102L, null).a(193401094592999L);
    public static String a = "rotation";
    private static String c = "rotation";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x57E4B88025ACL;
        long l5 = l4 ^ 0x3D30298E8D37L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "3\u000bA@vn1/".toCharArray();
        int n = 0;
        int n2 = 30;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x5F));
            n2 = n2;
        }
    }

    public static void b(int n, int n2, short s) {
        long cfr_ignored_0 = ((long)n << 32 | (long)n2 << 48 >>> 32 | (long)s << 48 >>> 48) ^ b;
        a = c;
    }
}


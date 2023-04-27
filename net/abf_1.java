/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.abF
 */
public class abf_1 {
    private static String c = "snowy";
    public static String a = "snowy";
    private static long b = a1c.a(-59373611389141916L, 2750800096958517969L, null).a(246262287766875L);

    public static void b(char c, short s, int n) {
        long cfr_ignored_0 = ((long)c << 48 | (long)s << 48 >>> 16 | (long)n << 32 >>> 32) ^ b;
        a = abf_1.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x545A73862DD2L;
        long l5 = l4 ^ 0x3506EF37776FL;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 32 >>> 32);
        char[] cArray = "r(\u000e$L".toCharArray();
        int n = 0;
        int n2 = 92;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x5D));
            n2 = n2;
        }
    }
}


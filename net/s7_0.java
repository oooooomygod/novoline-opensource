/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.s7
 */
public class s7_0 {
    private static String c = "SpawnPotentials";
    private static long b = a1c.a(-8993970460326016384L, -5222778055318749062L, null).a(183374437010236L);
    public static String a = "SpawnPotentials";

    public static void b(int n, int n2, char c) {
        long cfr_ignored_0 = ((long)n << 32 | (long)n2 << 48 >>> 32 | (long)c << 48 >>> 48) ^ b;
        a = s7_0.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x25B4A6B5CC14L;
        long l5 = l4 ^ 0x4F71F25D59A9L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "\u000eHP|O\u0016\u001e)]_\u007fH'\u001d.".toCharArray();
        int n = 0;
        int n2 = 82;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0xF));
            n2 = n2;
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class az1 {
    private static long d = a1c.a(3658210565186870867L, 3633192467174465736L, null).a(93742415184521L);
    private static String e = "User-ID";
    public static String b = "User-ID";
    public static String c = "";
    public static String a = "|";

    public static void b(byte by, long l4) {
        long cfr_ignored_0 = ((long)by << 56 | l4 << 8 >>> 8) ^ d;
        c = "";
        a = "|";
        b = e;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = d ^ 0x297661AF1D51L;
        long l5 = l4 ^ 0x6A24D4801D5AL;
        int cfr_ignored_0 = (int)(l5 >>> 56);
        long cfr_ignored_1 = l5 << 8 >>> 8;
        char[] cArray = ".U!\nn\u001d-".toCharArray();
        int n = 0;
        int n2 = 72;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x33));
            n2 = n2;
        }
    }
}


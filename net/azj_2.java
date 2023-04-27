/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.azj
 */
public class azj_2 {
    private static long b = a1c.a(1317797374781669409L, 5593767422363004552L, null).a(27597844046977L);
    public static String a = "entity";
    private static String c = "entity";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x2C1F2919B812L;
        long l5 = l4 ^ 0x4A8299C66DAFL;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        long cfr_ignored_1 = l5 << 32 >>> 32;
        char[] cArray = "t}\n~Qk".toCharArray();
        int n = 0;
        int n2 = 21;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 4));
            n2 = n2;
        }
    }

    public static void b(int n, long l4) {
        long cfr_ignored_0 = ((long)n << 32 | l4 << 32 >>> 32) ^ b;
        a = c;
    }
}


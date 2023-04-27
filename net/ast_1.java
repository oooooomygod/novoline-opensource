/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.asT
 */
public class ast_1 {
    private static long b = a1c.a(3406520527898281846L, -3160416203333013284L, null).a(255521028485238L);
    public static String a = "minecraft:minecart.base";
    private static String c = "minecraft:minecart.base";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x3659C6CD7C2L;
        long l5 = l4 ^ 0x4E7ACEE233C4L;
        long cfr_ignored_0 = l5 >>> 32;
        int cfr_ignored_1 = (int)(l5 << 32 >>> 32);
        char[] cArray = "\u0016<\u000fh\u0016\u0015-\u001d![`\u001c\t)\u00184\u0013y[\u0005-\b0".toCharArray();
        int n = 0;
        int n2 = 94;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x25));
            n2 = n2;
        }
    }

    public static void b(long l4, int n) {
        long cfr_ignored_0 = (l4 << 32 | (long)n << 32 >>> 32) ^ b;
        a = c;
    }
}


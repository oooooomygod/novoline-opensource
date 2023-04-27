/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

public class a8B {
    public static String a = "textures/blocks/wool_colored_red.png";
    private static String c = "textures/blocks/wool_colored_red.png";
    private static long b = a1c.a(2884621622328322486L, -7149684884982033560L, null).a(54079685049703L);

    public static void b(short s, short s3, int n) {
        long cfr_ignored_0 = ((long)s << 48 | (long)s3 << 48 >>> 16 | (long)n << 32 >>> 32) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x3AD7B20EA006L;
        long l5 = l4 ^ 0x5816C14B98C3L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 32 >>> 32);
        char[] cArray = "\u001dcA{{*I\u001a)[ca;G\u001a)N`a4s\niU`|=H6t\\k (B\u000e".toCharArray();
        int n = 0;
        int n2 = 59;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x52));
            n2 = n2;
        }
    }
}


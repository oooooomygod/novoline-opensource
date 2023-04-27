/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.a9u
 */
public class a9u_0 {
    public static String a = "textures/gui/container/dispenser.png";
    private static long b = a1c.a(-6266702965181726461L, -7258453406347441839L, null).a(184438930270358L);
    private static String c = "textures/gui/container/dispenser.png";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x1CB555310B2L;
        long l5 = l4 ^ 0x4ADB01783B43L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "a\u0013|NAxpfYcO]%vz\u0018p[]dpgY`SGzp{\u0005aH\u001az{r".toCharArray();
        int n = 0;
        int n2 = 33;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x34));
            n2 = n2;
        }
    }

    public static void b(int n, char c, short s) {
        long cfr_ignored_0 = ((long)n << 32 | (long)c << 48 >>> 32 | (long)s << 48 >>> 48) ^ b;
        a = a9u_0.c;
    }
}


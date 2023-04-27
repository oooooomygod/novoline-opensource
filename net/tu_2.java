/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.tu
 */
public class tu_2 {
    private static String c = "org.lwjgl.opengl.GL11";
    private static long b = a1c.a(4666330473582360059L, -1428467675851666219L, null).a(13395580945686L);
    public static String a = "org.lwjgl.opengl.GL11";

    public static void b(short s, long l4) {
        long cfr_ignored_0 = ((long)s << 48 | l4 << 16 >>> 16) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x356BD31C0417L;
        long l5 = l4 ^ 0x2A427E5B453CL;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        long cfr_ignored_1 = l5 << 16 >>> 16;
        char[] cArray = "\u0018B]gD$G\u0010\\\u0014&X6C\u0010\\\u0014\u000edb\u001c".toCharArray();
        int n = 0;
        int n2 = 69;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x32));
            n2 = n2;
        }
    }
}


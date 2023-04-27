/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.afo
 */
public class afo_1 {
    public static String a = "waterWorker";
    private static long b = a1c.a(6938006892395913322L, -1221793417867080726L, null).a(181980787797116L);
    private static String c = "waterWorker";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x61A1E7FBFF18L;
        long l5 = l4 ^ 0x6AB758093276L;
        long cfr_ignored_0 = l5 >>> 16;
        int cfr_ignored_1 = (int)(l5 << 48 >>> 48);
        char[] cArray = "h(Y7M_*m\"H ".toCharArray();
        int n = 0;
        int n2 = 36;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x3B));
            n2 = n2;
        }
    }

    public static void b(long l4, short s) {
        long cfr_ignored_0 = (l4 << 16 | (long)s << 48 >>> 48) ^ b;
        a = c;
    }
}


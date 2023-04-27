/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.amZ
 */
public class amz_0 {
    private static String c = "has_record";
    private static long b = a1c.a(-8573850238231339437L, -8166046185490400760L, null).a(45143133250318L);
    public static String a = "has_record";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x1FD5B605D14CL;
        long l5 = l4 ^ 0x49D49DFBCCL;
        long cfr_ignored_0 = l5 >>> 16;
        int cfr_ignored_1 = (int)(l5 << 48 >>> 48);
        char[] cArray = "~^v=K\bMyMa".toCharArray();
        int n = 0;
        int n2 = 117;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x63));
            n2 = n2;
        }
    }

    public static void b(long l4, short s) {
        long cfr_ignored_0 = (l4 << 16 | (long)s << 48 >>> 48) ^ b;
        a = c;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.uP
 */
public class up_1 {
    public static String a = "Unknown synced attribute modifier";
    private static long b = a1c.a(-2124164715070676570L, -5962412232293348187L, null).a(202245236861231L);
    private static String c = "Unknown synced attribute modifier";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x202BA63FD758L;
        long l5 = l4 ^ 0x594D12BBFEF7L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        int cfr_ignored_1 = (int)(l5 << 16 >>> 32);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "]\tUtb>\u001a(\u0014Gtn,\u0010(\u0006Jn\u007f \u0016}\u0013[:`&\u0010a\u0001W\u007f\u007f".toCharArray();
        int n = 0;
        int n2 = 122;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x72));
            n2 = n2;
        }
    }

    public static void b(char c, int n, char c2) {
        long cfr_ignored_0 = ((long)c << 48 | (long)n << 32 >>> 16 | (long)c2 << 48 >>> 48) ^ b;
        a = up_1.c;
    }
}


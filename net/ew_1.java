/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.ew
 */
public class ew_1 {
    public static String a = "packet_handler";
    private static String c = "packet_handler";
    private static long b = a1c.a(-8952767345504180863L, -4266967147076066439L, null).a(263828002506957L);

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x5EB5780144CEL;
        long l5 = l4 ^ 0x10DB1C7A3046L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 48);
        int cfr_ignored_2 = (int)(l5 << 48 >>> 48);
        char[] cArray = "$\u0012mK%\u0018\b<\u0012`D,\t%".toCharArray();
        int n = 0;
        int n2 = 51;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_3 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x67));
            n2 = n2;
        }
    }

    public static void b(int n, int n2, short s) {
        long cfr_ignored_0 = ((long)n << 32 | (long)n2 << 48 >>> 32 | (long)s << 48 >>> 48) ^ b;
        a = c;
    }
}


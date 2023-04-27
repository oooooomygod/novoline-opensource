/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.Ff
 */
public class ff_0 {
    public static String a = "version";
    private static String c = "version";
    private static long b = a1c.a(6576472605593022802L, 3632322075942338625L, null).a(180693211528832L);

    public static void b(long l4, int n) {
        long cfr_ignored_0 = (l4 << 32 | (long)n << 32 >>> 32) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x7B3A45BC0F9FL;
        long l5 = l4 ^ 0x68796259B368L;
        long cfr_ignored_0 = l5 >>> 32;
        int cfr_ignored_1 = (int)(l5 << 32 >>> 32);
        char[] cArray = "\u001f=oc=\u0011O".toCharArray();
        int n = 0;
        int n2 = 58;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x53));
            n2 = n2;
        }
    }
}


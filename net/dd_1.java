/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.dd
 */
public class dd_1 {
    private static String c = "Tried to change immutable property";
    private static long b = a1c.a(306322316115943438L, 120666397554751949L, null).a(182864702840816L);
    public static String a = "Tried to change immutable property";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x6F159D05CBFBL;
        long l5 = l4 ^ 0x2A34D34A5CD0L;
        long cfr_ignored_0 = l5 >>> 16;
        int cfr_ignored_1 = (int)(l5 << 48 >>> 48);
        char[] cArray = "\\H\u0012@\u0017*,g\u001a\u0018M\u0012d?m\u001a\u0012H\u001e\u007f,iX\u0017@Sz*gJ\u001eW\u0007s".toCharArray();
        int n = 0;
        int n2 = 111;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x67));
            n2 = n2;
        }
    }

    public static void b(long l4, short s) {
        long cfr_ignored_0 = (l4 << 16 | (long)s << 48 >>> 48) ^ b;
        a = c;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.aWh
 */
public class awh_0 {
    private static String d = "https://novoline.lol/flow/localts";
    private static long c = a1c.a(1604436209418215499L, -2782323796838448090L, null).a(1121993414111L);
    public static String a = "https://novoline.lol/flow/localts";
    public static String b = "F";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = c ^ 0x72EA1DB78BE6L;
        long l5 = l4 ^ 0x721D3D79B9C8L;
        int cfr_ignored_0 = (int)(l5 >>> 56);
        long cfr_ignored_1 = l5 << 8 >>> 8;
        char[] cArray = "\"=_\u0015o|@e'D\u0013s*\u0006$,\u0005\ts*@,%D\u00123*\u0000)(G\u0011o".toCharArray();
        int n = 0;
        int n2 = 63;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x75));
            n2 = n2;
        }
    }

    public static void b(byte by, long l4) {
        long cfr_ignored_0 = ((long)by << 56 | l4 << 8 >>> 8) ^ c;
        b = "F";
        a = d;
    }
}


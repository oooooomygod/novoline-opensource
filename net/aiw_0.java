/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.aiW
 */
public class aiw_0 {
    public static String b = "";
    private static long c = a1c.a(7687385848926186368L, -1041043478194202359L, null).a(51431526165568L);
    public static String a = "Not supported";
    private static String d = "Not supported";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = c ^ 0x76929A0D704BL;
        long l5 = l4 ^ 0x4B86187C4EE2L;
        int cfr_ignored_0 = (int)(l5 >>> 32);
        int cfr_ignored_1 = (int)(l5 << 32 >>> 32);
        char[] cArray = "V4\u000fID[)h4\t\u001dRJ".toCharArray();
        int n = 0;
        int n2 = 60;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x24));
            n2 = n2;
        }
    }

    public static void b(int n, int n2) {
        long cfr_ignored_0 = ((long)n << 32 | (long)n2 << 32 >>> 32) ^ c;
        a = d;
        b = "";
    }
}


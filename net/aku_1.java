/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.akU
 */
public class aku_1 {
    private static long b = a1c.a(-1148644398064076028L, -1275387713513192618L, null).a(274286781297014L);
    public static String a = "Unsupported mob type for DoorInteractGoal";
    private static String c = "Unsupported mob type for DoorInteractGoal";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x1C5A1A684EADL;
        long l5 = l4 ^ 0x59F7EC26F360L;
        long cfr_ignored_0 = l5 >>> 8;
        int cfr_ignored_1 = (int)(l5 << 56 >>> 56);
        char[] cArray = "W/2':5[p5$6j([`a5+: \u0014d.3r\u000e*[p\b/&/7Ua5\u0006=+)".toCharArray();
        int n = 0;
        int n2 = 10;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 8));
            n2 = n2;
        }
    }

    public static void b(long l4, byte by) {
        long cfr_ignored_0 = (l4 << 8 | (long)by << 56 >>> 56) ^ b;
        a = c;
    }
}


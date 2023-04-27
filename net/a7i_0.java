/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.a7i
 */
public class a7i_0 {
    private static long b = a1c.a(9010242812911964417L, -8104618760097046716L, null).a(131672478695584L);
    private static String c = "Unsupported mob type for FollowOwnerGoal";
    public static String a = "Unsupported mob type for FollowOwnerGoal";

    public static void b(short s, long l4) {
        long cfr_ignored_0 = ((long)s << 48 | l4 << 16 >>> 16) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x5B448CE58AF6L;
        long l5 = l4 ^ 0x634FB7377FA8L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        long cfr_ignored_1 = l5 << 16 >>> 16;
        char[] cArray = "X6\u0006\\\u001bAX\u007f,\u0010MK\\Xox\u0001P\u001bT\u0017k7\u0007\t-^[a7\u0002f\u001c_R\u007f\u001f\u001aH\u0007".toCharArray();
        int n = 0;
        int n2 = 47;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x22));
            n2 = n2;
        }
    }
}


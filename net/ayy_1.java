/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.ayY
 */
public class ayy_1 {
    public static String a = "textures/entity/cow/cow.png";
    private static String c = "textures/entity/cow/cow.png";
    private static long b = a1c.a(-743770570727801003L, -196600033040133187L, null).a(133329152284054L);

    public static void b(short s, long l4) {
        long cfr_ignored_0 = ((long)s << 48 | l4 << 16 >>> 16) ^ b;
        a = c;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x52200EA5EE3FL;
        long l5 = l4 ^ 0x4443B5E1D507L;
        int cfr_ignored_0 = (int)(l5 >>> 48);
        long cfr_ignored_1 = l5 << 16 >>> 16;
        char[] cArray = "\u001bV \u007fGr\u0017\u001c\u001c=eFi\u0006\u0016\u001c;dE/\u0011\u0000Dv{\\g".toCharArray();
        int n = 0;
        int n2 = 40;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x47));
            n2 = n2;
        }
    }
}


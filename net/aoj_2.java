/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a1c;

/*
 * Renamed from net.aoj
 */
public class aoj_2 {
    private static long b = a1c.a(-6104602803978636295L, 4216181400669754688L, null).a(87864545801080L);
    public static String a = "entity.Villager.name";
    private static String c = "entity.Villager.name";

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l4 = b ^ 0x3725867523EDL;
        long l5 = l4 ^ 0x4FF7B165BECL;
        long cfr_ignored_0 = l5 >>> 16;
        int cfr_ignored_1 = (int)(l5 << 48 >>> 48);
        char[] cArray = "`zxj\u0003:&S}`o\u0016$mw:bb\u001a&".toCharArray();
        int n = 0;
        int n2 = 58;
        char[] cArray2 = cArray;
        int n3 = cArray.length;
        while (true) {
            n3 = n3;
            cArray2 = cArray2;
            int n4 = ++n;
            int cfr_ignored_2 = n % 7;
            cArray2[n4] = (char)(cArray2[n4] ^ (n2 ^ 0x3F));
            n2 = n2;
        }
    }

    public static void b(long l4, char c) {
        long cfr_ignored_0 = (l4 << 16 | (long)c << 48 >>> 48) ^ b;
        a = aoj_2.c;
    }
}


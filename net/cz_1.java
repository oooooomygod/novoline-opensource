/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.avi_2;
import net.sb_2;

/*
 * Renamed from net.cZ
 */
class cz_1 {
    public boolean c = true;
    public int d = 513;
    private static String b = "CL_00002547";
    public sb_2 a = new sb_2(2929);

    private cz_1() {
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "\"\u0017?^_cKSnTY".toCharArray();
        int n2 = 0;
        int n3 = 85;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x34));
            n3 = n3;
        }
    }

    cz_1(avi_2 avi_22) {
        this();
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.avi_2;
import net.sb_2;

/*
 * Renamed from net.cF
 */
class cf_1 {
    public sb_2 c = new sb_2(3058);
    private static String a = "CL_00002551";
    public int b = 5379;

    cf_1(avi_2 avi_22) {
        this();
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "\\.\u0007_#Z\u0013-Wm^".toCharArray();
        int n2 = 0;
        int n3 = 59;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x24));
            n3 = n3;
        }
    }

    private cf_1() {
    }
}


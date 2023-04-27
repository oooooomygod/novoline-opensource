/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.avi_2;
import net.sb_2;

/*
 * Renamed from net.i3
 */
class i3_0 {
    private static String b = "CL_00002548";
    public int c = 1029;
    public sb_2 a = new sb_2(2884);

    i3_0(avi_2 avi_22) {
        this();
    }

    private i3_0() {
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "\u0006\t}!=\u007f\u0016wp\u0016)".toCharArray();
        int n2 = 0;
        int n3 = 2;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x47));
            n3 = n3;
        }
    }
}


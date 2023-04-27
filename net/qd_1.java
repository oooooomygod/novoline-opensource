/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.avi_2;
import net.sb_2;

/*
 * Renamed from net.qD
 */
class qd_1 {
    public sb_2 d = new sb_2(32823);
    private static String c = "CL_00002545";
    public float e = 0.0f;
    public sb_2 b = new sb_2(10754);
    public float a = 0.0f;

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "-%\u0005\u0007N\u001c_\\\\n\u0002".toCharArray();
        int n2 = 0;
        int n3 = 34;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x4C));
            n3 = n3;
        }
    }

    qd_1(avi_2 avi_22) {
        this();
    }

    private qd_1() {
    }
}


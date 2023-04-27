/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.avi_2;
import net.sb_2;

/*
 * Renamed from net.ad7
 */
class ad7_0 {
    public int d = 519;
    public sb_2 a = new sb_2(3008);
    public float b = -1.0f;
    private static String c = "CL_00002556";

    ad7_0(avi_2 avi_22) {
        this();
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "6\u0017Rqu\u001epGn8w".toCharArray();
        int n2 = 0;
        int n3 = 67;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x36));
            n3 = n3;
        }
    }

    private ad7_0() {
    }
}


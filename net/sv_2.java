/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.avi_2;
import net.sb_2;

/*
 * Renamed from net.sv
 */
class sv_2 {
    public int c = 0;
    public sb_2 a = new sb_2(3553);
    private static String b = "CL_00002539";

    sv_2(avi_2 avi_22) {
        this();
    }

    private sv_2() {
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "\u001adS0dW\u001fk\u001d?9".toCharArray();
        int n2 = 0;
        int n3 = 14;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x57));
            n3 = n3;
        }
    }
}


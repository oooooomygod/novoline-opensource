/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.avi_2;
import net.sb_2;

/*
 * Renamed from net.ak3
 */
class ak3_0 {
    public int e = 1;
    public int f = 0;
    private static String b = "CL_00002555";
    public int c = 1;
    public sb_2 d = new sb_2(3042);
    public int a = 0;

    private ak3_0() {
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "c^3\u0012hid\u0012'Y\u0017".toCharArray();
        int n2 = 0;
        int n3 = 49;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x11));
            n3 = n3;
        }
    }

    ak3_0(avi_2 avi_22) {
        this();
    }
}


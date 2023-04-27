/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.avi_2;

/*
 * Renamed from net.acw
 */
class acw_1 {
    private static String a = "CL_00002544";
    public int c = 0;
    public int b = 519;
    public int d = -1;

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "m5JI\u000f7\b\u001cL!M".toCharArray();
        int n2 = 0;
        int n3 = 88;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x76));
            n3 = n3;
        }
    }

    acw_1(avi_2 avi_22) {
        this();
    }

    private acw_1() {
    }
}


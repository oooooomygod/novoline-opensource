/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.avi_2;
import net.sb_2;

class DC {
    private static String f = "CL_00002546";
    public float b = 0.0f;
    public sb_2 d = new sb_2(2912);
    public float c = 1.0f;
    public float e = 1.0f;
    public int a = 2048;

    DC(avi_2 avi_22) {
        this();
    }

    private DC() {
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "5Q\\Kg^ID(7M".toCharArray();
        int n2 = 0;
        int n3 = 50;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x44));
            n3 = n3;
        }
    }
}


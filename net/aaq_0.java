/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.avi_2;
import net.ls_1;

/*
 * Renamed from net.aaQ
 */
class aaq_0 {
    public double e = 1.0;
    public ls_1 a = new ls_1(0.0f, 0.0f, 0.0f, 0.0f);
    private static String d = "CL_00002553";
    public int c = 0;
    int b = 114881;

    aaq_0(avi_2 avi_22) {
        this();
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "\u000fRY\u001d\r|m~+3\u001e".toCharArray();
        int n2 = 0;
        int n3 = 119;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x3B));
            n3 = n3;
        }
    }

    private aaq_0() {
    }
}


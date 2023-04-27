/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a4I;
import net.avi_2;

/*
 * Renamed from net.axb
 */
class axb_2 {
    private static String c = "CL_00002540";
    public a4I d;
    public a4I b;
    public a4I e = new a4I(8192, 3168);
    public a4I a = new a4I(8193, 3169);

    axb_2(avi_2 avi_22) {
        this();
    }

    private axb_2() {
        this.b = new a4I(8194, 3170);
        this.d = new a4I(8195, 3171);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "\u0011\u0012\nwyK6`kaw".toCharArray();
        int n2 = 0;
        int n3 = 113;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x23));
            n3 = n3;
        }
    }
}


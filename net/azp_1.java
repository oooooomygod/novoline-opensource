/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.avi_2;

/*
 * Renamed from net.azP
 */
class azp_1 {
    public boolean e = true;
    public boolean c = true;
    private static String b = "CL_00002550";
    public boolean a = true;
    public boolean d = true;

    azp_1(avi_2 avi_22) {
        this();
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = " mS#e\u0015\u0007Q\u00149#".toCharArray();
        int n2 = 0;
        int n3 = 93;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x3E));
            n3 = n3;
        }
    }

    private azp_1() {
    }
}


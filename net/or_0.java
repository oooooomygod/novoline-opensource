/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.acw_1;
import net.avi_2;

/*
 * Renamed from net.Or
 */
class or_0 {
    public int a = 7680;
    public int b = -1;
    private static String f = "CL_00002543";
    public acw_1 e = new acw_1(null);
    public int d = 7680;
    public int c = 7680;

    or_0(avi_2 avi_22) {
        this();
    }

    private or_0() {
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "<c7s)6WM\u001a\\p".toCharArray();
        int n2 = 0;
        int n3 = 17;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x6E));
            n3 = n3;
        }
    }
}


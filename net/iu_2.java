/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.avi_2;
import net.sb_2;

/*
 * Renamed from net.iu
 */
class iu_2 {
    public sb_2 b = new sb_2(2903);
    private static String a = "CL_00002549";
    public int d = 1032;
    public int c = 5634;

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "\u001c$M\u0016\u0007R\u0000m]&\u001f".toCharArray();
        int n2 = 0;
        int n3 = 7;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x58));
            n3 = n3;
        }
    }

    iu_2(avi_2 avi_22) {
        this();
    }

    private iu_2() {
    }
}


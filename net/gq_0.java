/*
 * Decompiled with CFR 0.152.
 */
package net;

/*
 * Renamed from net.Gq
 */
class gq_0 {
    static int[] b;
    private static String a = "CL_00002517";

    gq_0() {
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "$^5>Wz_U'[9".toCharArray();
        int n2 = 0;
        int n3 = 80;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x37));
            n3 = n3;
        }
    }
}


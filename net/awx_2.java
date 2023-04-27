/*
 * Decompiled with CFR 0.152.
 */
package net;

/*
 * Renamed from net.awx
 */
class awx_2 {
    private static String b = "CL_00002537";
    static int[] a;

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "\u0005nUXx\u001f}t\u00179_".toCharArray();
        int n2 = 0;
        int n3 = 60;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x7A));
            n3 = n3;
        }
    }

    awx_2() {
    }
}


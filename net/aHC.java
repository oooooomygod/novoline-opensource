/*
 * Decompiled with CFR 0.152.
 */
package net;

class aHC {
    private static String b = "CL_00002569";
    static int[] a;

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "Lno\u000e\u0006c0=\u0017\u0006\u0007".toCharArray();
        int n2 = 0;
        int n3 = 111;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x60));
            n3 = n3;
        }
    }

    aHC() {
    }
}


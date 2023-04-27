/*
 * Decompiled with CFR 0.152.
 */
package net;

class aLE {
    static int[] c;
    private static String b = "CL_00002322";
    static int[] a;
    static int[] d;

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "}x.\u000eB\u0000l\f\u0007C\f".toCharArray();
        int n2 = 0;
        int n3 = 9;
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

    aLE() {
    }
}


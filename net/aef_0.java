/*
 * Decompiled with CFR 0.152.
 */
package net;

/*
 * Renamed from net.aEf
 */
class aef_0 {
    private static String b = "CL_00000652";
    static int[] a;

    aef_0() {
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "6\u0007s0_$EE}\u00192".toCharArray();
        int n2 = 0;
        int n3 = 85;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x20));
            n3 = n3;
        }
    }
}


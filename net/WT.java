/*
 * Decompiled with CFR 0.152.
 */
package net;

class WT {
    private static String b = "CL_00002427";
    static int[] a;

    WT() {
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "$0h\u001dr\u0010=UH\u0005\u001a".toCharArray();
        int n2 = 0;
        int n3 = 48;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x57));
            n3 = n3;
        }
    }
}


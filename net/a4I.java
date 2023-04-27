/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.sb_2;

class a4I {
    public sb_2 a;
    public int c = -1;
    private static String d = "CL_00002541";
    public int b;

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "\u001cCnBy('m:\u0005C".toCharArray();
        int n2 = 0;
        int n3 = 9;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x56));
            n3 = n3;
        }
    }

    public a4I(int n, int n2) {
        this.b = n;
        this.a = new sb_2(n2);
    }
}


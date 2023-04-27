/*
 * Decompiled with CFR 0.152.
 */
package net;

/*
 * Renamed from net.lS
 */
class ls_1 {
    public float c = 1.0f;
    public float a = 1.0f;
    public float d = 1.0f;
    private static String e = "CL_00002552";
    public float b = 1.0f;

    public ls_1() {
    }

    public ls_1(float f, float f2, float f3, float f4) {
        this.a = f;
        this.d = f2;
        this.b = f3;
        this.c = f4;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "pV\u0016wyL\u0000\u0001/|u".toCharArray();
        int n2 = 0;
        int n3 = 62;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0xD));
            n3 = n3;
        }
    }
}


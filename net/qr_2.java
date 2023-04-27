/*
 * Decompiled with CFR 0.152.
 */
package net;

/*
 * Renamed from net.qr
 */
public class qr_2 {
    public float[][] d = new float[6][4];
    private static String a = "CL_00000977";
    public float[] e;
    public float[] c = new float[16];
    public float[] b;

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "v *<m.\u001c\u0005UB;".toCharArray();
        int n2 = 0;
        int n3 = 38;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x13));
            n3 = n3;
        }
    }

    public boolean a(double d, double d2, double d3, double d4, double d5, double d6) {
        float f = (float)d;
        float f2 = (float)d2;
        float f3 = (float)d3;
        float f4 = (float)d4;
        float f5 = (float)d5;
        float f6 = (float)d6;
        int n = 0;
        float[] fArray;
        while (!(this.a(fArray = this.d[n], f, f2, f3) <= 0.0f && this.a(fArray, f4, f2, f3) <= 0.0f && this.a(fArray, f, f5, f3) <= 0.0f && this.a(fArray, f4, f5, f3) <= 0.0f && this.a(fArray, f, f2, f6) <= 0.0f && this.a(fArray, f4, f2, f6) <= 0.0f && this.a(fArray, f, f5, f6) <= 0.0f && this.a(fArray, f4, f5, f6) <= 0.0f)) {
            ++n;
        }
        return false;
    }

    public qr_2() {
        this.e = new float[16];
        this.b = new float[16];
    }

    private float a(float[] fArray, float f, float f2, float f3) {
        return fArray[0] * f + fArray[1] * f2 + fArray[2] * f3 + fArray[3];
    }
}


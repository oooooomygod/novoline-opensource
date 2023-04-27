/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.SystemInvoker;
import net.MathHelper;
import net.a0D;
import net.a0L;
import net.aVE;
import net.qr_2;

/*
 * Renamed from net.q3
 */
public class q3_0
extends qr_2 {
    float[] g = new float[6];
    float[] f;
    private static q3_0 i = new q3_0();
    float[] h;
    int k;
    float[][] j = new float[10][4];

    private void b(float[] fArray) {
        a0D.k();
        float f = MathHelper.g(fArray[0] * fArray[0] + fArray[1] * fArray[1] + fArray[2] * fArray[2]);
        if (f == 0.0f) {
            f = 1.0f;
        }
        fArray[0] = fArray[0] / f;
        fArray[1] = fArray[1] / f;
        fArray[2] = fArray[2] / f;
    }

    public q3_0() {
        this.f = new float[16];
        this.h = new float[4];
    }

    @Override
    public boolean a(double d, double d2, double d3, double d4, double d5, double d6) {
        a0D.k();
        int n = 0;
        if (n < this.k) {
            float[] fArray = this.j[n];
            if (this.a(fArray, d, d2, d3) <= 0.0 && this.a(fArray, d4, d2, d3) <= 0.0 && this.a(fArray, d, d5, d3) <= 0.0 && this.a(fArray, d4, d5, d3) <= 0.0 && this.a(fArray, d, d2, d6) <= 0.0 && this.a(fArray, d4, d2, d6) <= 0.0 && this.a(fArray, d, d5, d6) <= 0.0 && this.a(fArray, d4, d5, d6) <= 0.0) {
                return false;
            }
            ++n;
        }
        return true;
    }

    private float a(float f, float f2, float f3, float f4, float f5, float f6) {
        return this.a(f - f4, f2 - f5, f3 - f6);
    }

    private void a(float[] fArray, float[] fArray2, float[] fArray3, float[] fArray4) {
        this.a(this.h, fArray2, fArray3);
        this.a(fArray, this.h, fArray4);
        this.b(fArray);
        float f = (float)this.a(fArray2, fArray3);
        float f2 = (float)this.a(fArray, fArray3);
        float f3 = this.a(fArray[0], fArray[1], fArray[2], fArray3[0] * f2, fArray3[1] * f2, fArray3[2] * f2);
        float f4 = this.a(fArray2[0], fArray2[1], fArray2[2], fArray3[0] * f, fArray3[1] * f, fArray3[2] * f);
        float f5 = f3 / f4;
        float f6 = (float)this.a(fArray, fArray2);
        float f7 = this.a(fArray[0], fArray[1], fArray[2], fArray2[0] * f6, fArray2[1] * f6, fArray2[2] * f6);
        float f8 = this.a(fArray3[0], fArray3[1], fArray3[2], fArray2[0] * f, fArray2[1] * f, fArray2[2] * f);
        float f9 = f7 / f8;
        fArray[3] = fArray2[3] * f5 + fArray3[3] * f9;
    }

    private void c(float[] fArray) {
        this.b(this.j[this.k++], fArray);
    }

    private double a(float[] fArray, float[] fArray2) {
        return (double)fArray[0] * (double)fArray2[0] + (double)fArray[1] * (double)fArray2[1] + (double)fArray[2] * (double)fArray2[2];
    }

    public static qr_2 b() {
        i.a();
        return i;
    }

    private void a(float[] fArray) {
        float f = MathHelper.g(fArray[0] * fArray[0] + fArray[1] * fArray[1] + fArray[2] * fArray[2]);
        fArray[0] = fArray[0] / f;
        fArray[1] = fArray[1] / f;
        fArray[2] = fArray[2] / f;
        fArray[3] = fArray[3] / f;
    }

    private double a(float[] fArray, double d, double d2, double d3) {
        return (double)fArray[0] * d + (double)fArray[1] * d2 + (double)fArray[2] * d3 + (double)fArray[3];
    }

    public void a() {
        float[] fArray = this.c;
        float[] fArray2 = this.e;
        float[] fArray3 = this.b;
        SystemInvoker.a(aVE.z, 0, fArray, 0, 16);
        SystemInvoker.a(aVE.cI, 0, fArray2, 0, 16);
        a0L.b(fArray3, fArray2, fArray);
        this.a(this.d[0], fArray3[3] - fArray3[0], fArray3[7] - fArray3[4], fArray3[11] - fArray3[8], fArray3[15] - fArray3[12]);
        this.a(this.d[1], fArray3[3] + fArray3[0], fArray3[7] + fArray3[4], fArray3[11] + fArray3[8], fArray3[15] + fArray3[12]);
        this.a(this.d[2], fArray3[3] + fArray3[1], fArray3[7] + fArray3[5], fArray3[11] + fArray3[9], fArray3[15] + fArray3[13]);
        this.a(this.d[3], fArray3[3] - fArray3[1], fArray3[7] - fArray3[5], fArray3[11] - fArray3[9], fArray3[15] - fArray3[13]);
        this.a(this.d[4], fArray3[3] - fArray3[2], fArray3[7] - fArray3[6], fArray3[11] - fArray3[10], fArray3[15] - fArray3[14]);
        a0D.k();
        this.a(this.d[5], fArray3[3] + fArray3[2], fArray3[7] + fArray3[6], fArray3[11] + fArray3[10], fArray3[15] + fArray3[14]);
        float[] fArray4 = aVE.V;
        float f = (float)this.a(this.d[0], fArray4);
        float f2 = (float)this.a(this.d[1], fArray4);
        float f3 = (float)this.a(this.d[2], fArray4);
        float f4 = (float)this.a(this.d[3], fArray4);
        float f5 = (float)this.a(this.d[4], fArray4);
        float f6 = (float)this.a(this.d[5], fArray4);
        this.k = 0;
        if (f >= 0.0f) {
            this.b(this.j[this.k++], this.d[0]);
            if (f > 0.0f) {
                if (f3 < 0.0f) {
                    this.a(this.j[this.k++], this.d[0], this.d[2], fArray4);
                }
                if (f4 < 0.0f) {
                    this.a(this.j[this.k++], this.d[0], this.d[3], fArray4);
                }
                if (f5 < 0.0f) {
                    this.a(this.j[this.k++], this.d[0], this.d[4], fArray4);
                }
                if (f6 < 0.0f) {
                    this.a(this.j[this.k++], this.d[0], this.d[5], fArray4);
                }
            }
        }
        if (f2 >= 0.0f) {
            this.b(this.j[this.k++], this.d[1]);
            if (f2 > 0.0f) {
                if (f3 < 0.0f) {
                    this.a(this.j[this.k++], this.d[1], this.d[2], fArray4);
                }
                if (f4 < 0.0f) {
                    this.a(this.j[this.k++], this.d[1], this.d[3], fArray4);
                }
                if (f5 < 0.0f) {
                    this.a(this.j[this.k++], this.d[1], this.d[4], fArray4);
                }
                if (f6 < 0.0f) {
                    this.a(this.j[this.k++], this.d[1], this.d[5], fArray4);
                }
            }
        }
        if (f3 >= 0.0f) {
            this.b(this.j[this.k++], this.d[2]);
            if (f3 > 0.0f) {
                if (f < 0.0f) {
                    this.a(this.j[this.k++], this.d[2], this.d[0], fArray4);
                }
                if (f2 < 0.0f) {
                    this.a(this.j[this.k++], this.d[2], this.d[1], fArray4);
                }
                if (f5 < 0.0f) {
                    this.a(this.j[this.k++], this.d[2], this.d[4], fArray4);
                }
                if (f6 < 0.0f) {
                    this.a(this.j[this.k++], this.d[2], this.d[5], fArray4);
                }
            }
        }
        if (f4 >= 0.0f) {
            this.b(this.j[this.k++], this.d[3]);
            if (f4 > 0.0f) {
                if (f < 0.0f) {
                    this.a(this.j[this.k++], this.d[3], this.d[0], fArray4);
                }
                if (f2 < 0.0f) {
                    this.a(this.j[this.k++], this.d[3], this.d[1], fArray4);
                }
                if (f5 < 0.0f) {
                    this.a(this.j[this.k++], this.d[3], this.d[4], fArray4);
                }
                if (f6 < 0.0f) {
                    this.a(this.j[this.k++], this.d[3], this.d[5], fArray4);
                }
            }
        }
        if (f5 >= 0.0f) {
            this.b(this.j[this.k++], this.d[4]);
            if (f5 > 0.0f) {
                if (f < 0.0f) {
                    this.a(this.j[this.k++], this.d[4], this.d[0], fArray4);
                }
                if (f2 < 0.0f) {
                    this.a(this.j[this.k++], this.d[4], this.d[1], fArray4);
                }
                if (f3 < 0.0f) {
                    this.a(this.j[this.k++], this.d[4], this.d[2], fArray4);
                }
                if (f4 < 0.0f) {
                    this.a(this.j[this.k++], this.d[4], this.d[3], fArray4);
                }
            }
        }
        if (f6 >= 0.0f) {
            this.b(this.j[this.k++], this.d[5]);
            if (f6 > 0.0f) {
                if (f < 0.0f) {
                    this.a(this.j[this.k++], this.d[5], this.d[0], fArray4);
                }
                if (f2 < 0.0f) {
                    this.a(this.j[this.k++], this.d[5], this.d[1], fArray4);
                }
                if (f3 < 0.0f) {
                    this.a(this.j[this.k++], this.d[5], this.d[2], fArray4);
                }
                if (f4 < 0.0f) {
                    this.a(this.j[this.k++], this.d[5], this.d[3], fArray4);
                }
            }
        }
    }

    private void b(float[] fArray, float[] fArray2) {
        fArray[0] = fArray2[0];
        fArray[1] = fArray2[1];
        fArray[2] = fArray2[2];
        fArray[3] = fArray2[3];
    }

    private void a(float[] fArray, float[] fArray2, float[] fArray3) {
        fArray[0] = fArray2[1] * fArray3[2] - fArray2[2] * fArray3[1];
        fArray[1] = fArray2[2] * fArray3[0] - fArray2[0] * fArray3[2];
        fArray[2] = fArray2[0] * fArray3[1] - fArray2[1] * fArray3[0];
    }

    private void a(float[] fArray, float f, float f2, float f3, float f4) {
        float f5 = (float)MathInvoker.d(f * f + f2 * f2 + f3 * f3);
        fArray[0] = f / f5;
        fArray[1] = f2 / f5;
        fArray[2] = f3 / f5;
        fArray[3] = f4 / f5;
    }

    private float a(float f, float f2, float f3) {
        return (float)MathInvoker.d(f * f + f2 * f2 + f3 * f3);
    }
}


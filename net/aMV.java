/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Random;
import net.a5_0;
import net.amv_0;

public class aMV
extends amv_0 {
    private static double[] i = new double[]{1.0, -1.0, 1.0, -1.0, 1.0, -1.0, 1.0, -1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, -1.0, 0.0};
    private static double[] e;
    public double h;
    public double a;
    private static double[] b;
    private int[] c = new int[512];
    private static double[] d;
    private static double[] f;
    public double g;

    public aMV(Random random) {
        this.g = a5_0.c(random) * 256.0;
        this.a = a5_0.c(random) * 256.0;
        this.h = a5_0.c(random) * 256.0;
        int n = 0;
        while (true) {
            this.c[n] = n++;
        }
    }

    public void a(double[] dArray, double d, double d2, double d3, int n, int n2, int n3, double d4, double d5, double d6, double d7) {
        if (n2 == 1) {
            int n4 = 0;
            int n5 = 0;
            int n6 = 0;
            int n7 = 0;
            double d8 = 0.0;
            double d9 = 0.0;
            int n8 = 0;
            double d10 = 1.0 / d7;
            for (int i = 0; i < n; ++i) {
                double d11 = d + (double)i * d4 + this.g;
                int n9 = (int)d11;
                if (d11 < (double)n9) {
                    --n9;
                }
                int n10 = n9 & 0xFF;
                double d12 = (d11 -= (double)n9) * d11 * d11 * (d11 * (d11 * 6.0 - 15.0) + 10.0);
                for (int j = 0; j < n3; ++j) {
                    int n11;
                    double d13 = d3 + (double)j * d6 + this.h;
                    int n12 = (int)d13;
                    if (d13 < (double)n12) {
                        --n12;
                    }
                    int n13 = n12 & 0xFF;
                    double d14 = (d13 -= (double)n12) * d13 * d13 * (d13 * (d13 * 6.0 - 15.0) + 10.0);
                    n4 = this.c[n10];
                    n5 = this.c[n4] + n13;
                    n6 = this.c[n10 + 1];
                    n7 = this.c[n6] + n13;
                    d8 = this.a(d12, this.a(this.c[n5], d11, d13), this.a(this.c[n7], d11 - 1.0, 0.0, d13));
                    d9 = this.a(d12, this.a(this.c[n5 + 1], d11, 0.0, d13 - 1.0), this.a(this.c[n7 + 1], d11 - 1.0, 0.0, d13 - 1.0));
                    double d15 = this.a(d14, d8, d9);
                    int n14 = n11 = n8++;
                    dArray[n14] = dArray[n14] + d15 * d10;
                }
            }
        } else {
            int n15 = 0;
            double d16 = 1.0 / d7;
            int n16 = -1;
            int n17 = 0;
            int n18 = 0;
            int n19 = 0;
            int n20 = 0;
            int n21 = 0;
            int n22 = 0;
            double d17 = 0.0;
            double d18 = 0.0;
            double d19 = 0.0;
            double d20 = 0.0;
            for (int i = 0; i < n; ++i) {
                double d21 = d + (double)i * d4 + this.g;
                int n23 = (int)d21;
                if (d21 < (double)n23) {
                    --n23;
                }
                int n24 = n23 & 0xFF;
                double d22 = (d21 -= (double)n23) * d21 * d21 * (d21 * (d21 * 6.0 - 15.0) + 10.0);
                for (int j = 0; j < n3; ++j) {
                    double d23 = d3 + (double)j * d6 + this.h;
                    int n25 = (int)d23;
                    if (d23 < (double)n25) {
                        --n25;
                    }
                    int n26 = n25 & 0xFF;
                    double d24 = (d23 -= (double)n25) * d23 * d23 * (d23 * (d23 * 6.0 - 15.0) + 10.0);
                    for (int k = 0; k < n2; ++k) {
                        int n27;
                        double d25 = d2 + (double)k * d5 + this.a;
                        int n28 = (int)d25;
                        if (d25 < (double)n28) {
                            --n28;
                        }
                        int n29 = n28 & 0xFF;
                        double d26 = (d25 -= (double)n28) * d25 * d25 * (d25 * (d25 * 6.0 - 15.0) + 10.0);
                        if (n29 != n16) {
                            n16 = n29;
                            n17 = this.c[n24] + n29;
                            n18 = this.c[n17] + n26;
                            n19 = this.c[n17 + 1] + n26;
                            n20 = this.c[n24 + 1] + n29;
                            n21 = this.c[n20] + n26;
                            n22 = this.c[n20 + 1] + n26;
                            d17 = this.a(d22, this.a(this.c[n18], d21, d25, d23), this.a(this.c[n21], d21 - 1.0, d25, d23));
                            d18 = this.a(d22, this.a(this.c[n19], d21, d25 - 1.0, d23), this.a(this.c[n22], d21 - 1.0, d25 - 1.0, d23));
                            d19 = this.a(d22, this.a(this.c[n18 + 1], d21, d25, d23 - 1.0), this.a(this.c[n21 + 1], d21 - 1.0, d25, d23 - 1.0));
                            d20 = this.a(d22, this.a(this.c[n19 + 1], d21, d25 - 1.0, d23 - 1.0), this.a(this.c[n22 + 1], d21 - 1.0, d25 - 1.0, d23 - 1.0));
                        }
                        double d27 = this.a(d26, d17, d18);
                        double d28 = this.a(d26, d19, d20);
                        double d29 = this.a(d24, d27, d28);
                        int n30 = n27 = n15++;
                        dArray[n30] = dArray[n30] + d29 * d16;
                    }
                }
            }
        }
    }

    static {
        f = new double[]{1.0, 1.0, -1.0, -1.0, 0.0, 0.0, 0.0, 0.0, 1.0, -1.0, 1.0, -1.0, 1.0, -1.0, 1.0, -1.0};
        d = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 1.0, -1.0, -1.0, 1.0, 1.0, -1.0, -1.0, 0.0, 1.0, 0.0, -1.0};
        e = new double[]{1.0, -1.0, 1.0, -1.0, 1.0, -1.0, 1.0, -1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, -1.0, 0.0};
        b = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 1.0, -1.0, -1.0, 1.0, 1.0, -1.0, -1.0, 0.0, 1.0, 0.0, -1.0};
    }

    public aMV() {
        this(new Random());
    }

    public double a(int n, double d, double d2) {
        int n2 = n & 0xF;
        return e[n2] * d + b[n2] * d2;
    }

    public double a(double d, double d2, double d3) {
        return d2 + d * (d3 - d2);
    }

    public double a(int n, double d, double d2, double d3) {
        int n2 = n & 0xF;
        return i[n2] * d + f[n2] * d2 + aMV.d[n2] * d3;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MathInvoker;
import java.util.Random;
import net.a5_0;

public class aZC {
    public double d;
    public double e;
    public double g;
    private static int[][] b = new int[][]{{1, 1, 0}, {-1, 1, 0}, {1, -1, 0}, {-1, -1, 0}, {1, 0, 1}, {-1, 0, 1}, {1, 0, -1}, {-1, 0, -1}, {0, 1, 1}, {0, -1, 1}, {0, 1, -1}, {0, -1, -1}};
    private static double c;
    public static double h;
    private int[] f = new int[512];
    private static double a;

    public double a(double d, double d2) {
        double d3;
        double d4;
        double d5;
        int n;
        int n2;
        double d6;
        double d7;
        double d8;
        int n3;
        double d9;
        double d10 = 0.5 * (h - 1.0);
        double d11 = (d + d2) * d10;
        int n4 = aZC.a(d + d11);
        double d12 = (double)n4 - (d9 = (double)(n4 + (n3 = aZC.a(d2 + d11))) * (d8 = (3.0 - h) / 6.0));
        double d13 = d - d12;
        if (d13 > (d7 = d2 - (d6 = (double)n3 - d9))) {
            n2 = 1;
            n = 0;
        } else {
            n2 = 0;
            n = 1;
        }
        double d14 = d13 - (double)n2 + d8;
        double d15 = d7 - (double)n + d8;
        double d16 = d13 - 1.0 + 2.0 * d8;
        double d17 = d7 - 1.0 + 2.0 * d8;
        int n5 = n4 & 0xFF;
        int n6 = n3 & 0xFF;
        int n7 = this.f[n5 + this.f[n6]] % 12;
        int n8 = this.f[n5 + n2 + this.f[n6 + n]] % 12;
        int n9 = this.f[n5 + 1 + this.f[n6 + 1]] % 12;
        double d18 = 0.5 - d13 * d13 - d7 * d7;
        if (d18 < 0.0) {
            d5 = 0.0;
        } else {
            d18 *= d18;
            d5 = d18 * d18 * aZC.a(b[n7], d13, d7);
        }
        double d19 = 0.5 - d14 * d14 - d15 * d15;
        if (d19 < 0.0) {
            d4 = 0.0;
        } else {
            d19 *= d19;
            d4 = d19 * d19 * aZC.a(b[n8], d14, d15);
        }
        double d20 = 0.5 - d16 * d16 - d17 * d17;
        if (d20 < 0.0) {
            d3 = 0.0;
        } else {
            d20 *= d20;
            d3 = d20 * d20 * aZC.a(b[n9], d16, d17);
        }
        return 70.0 * (d5 + d4 + d3);
    }

    public void a(double[] dArray, double d, double d2, int n, int n2, double d3, double d4, double d5) {
        int n3 = 0;
        for (int i = 0; i < n2; ++i) {
            double d6 = (d2 + (double)i) * d4 + this.e;
            for (int j = 0; j < n; ++j) {
                int n4;
                double d7;
                double d8;
                double d9;
                int n5;
                int n6;
                double d10;
                double d11;
                int n7;
                double d12;
                double d13 = (d + (double)j) * d3 + this.d;
                double d14 = (d13 + d6) * c;
                int n8 = aZC.a(d13 + d14);
                double d15 = (double)n8 - (d12 = (double)(n8 + (n7 = aZC.a(d6 + d14))) * a);
                double d16 = d13 - d15;
                if (d16 > (d11 = d6 - (d10 = (double)n7 - d12))) {
                    n6 = 1;
                    n5 = 0;
                } else {
                    n6 = 0;
                    n5 = 1;
                }
                double d17 = d16 - (double)n6 + a;
                double d18 = d11 - (double)n5 + a;
                double d19 = d16 - 1.0 + 2.0 * a;
                double d20 = d11 - 1.0 + 2.0 * a;
                int n9 = n8 & 0xFF;
                int n10 = n7 & 0xFF;
                int n11 = this.f[n9 + this.f[n10]] % 12;
                int n12 = this.f[n9 + n6 + this.f[n10 + n5]] % 12;
                int n13 = this.f[n9 + 1 + this.f[n10 + 1]] % 12;
                double d21 = 0.5 - d16 * d16 - d11 * d11;
                if (d21 < 0.0) {
                    d9 = 0.0;
                } else {
                    d21 *= d21;
                    d9 = d21 * d21 * aZC.a(b[n11], d16, d11);
                }
                double d22 = 0.5 - d17 * d17 - d18 * d18;
                if (d22 < 0.0) {
                    d8 = 0.0;
                } else {
                    d22 *= d22;
                    d8 = d22 * d22 * aZC.a(b[n12], d17, d18);
                }
                double d23 = 0.5 - d19 * d19 - d20 * d20;
                if (d23 < 0.0) {
                    d7 = 0.0;
                } else {
                    d23 *= d23;
                    d7 = d23 * d23 * aZC.a(b[n13], d19, d20);
                }
                int n14 = n4 = n3++;
                dArray[n14] = dArray[n14] + 70.0 * (d9 + d8 + d7) * d5;
            }
        }
    }

    static {
        h = MathInvoker.d(3.0);
        c = 0.5 * (h - 1.0);
        a = (3.0 - h) / 6.0;
    }

    private static int a(double d) {
        return d > 0.0 ? (int)d : (int)d - 1;
    }

    private static double a(int[] nArray, double d, double d2) {
        return (double)nArray[0] * d + (double)nArray[1] * d2;
    }

    public aZC() {
        this(new Random());
    }

    public aZC(Random random) {
        this.d = a5_0.c(random) * 256.0;
        this.e = a5_0.c(random) * 256.0;
        this.g = a5_0.c(random) * 256.0;
        int n = 0;
        while (true) {
            this.f[n] = n++;
        }
    }
}


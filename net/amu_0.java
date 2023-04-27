/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Random;
import net.aZC;
import net.amv_0;
import net.axb_0;

/*
 * Renamed from net.aMu
 */
public class amu_0
extends amv_0 {
    private aZC[] b;
    private int a;

    public double[] a(double[] dArray, double d, double d2, int n, int n2, double d3, double d4, double d5) {
        return this.a(dArray, d, d2, n, n2, d3, d4, d5, 0.5);
    }

    public double a(double d, double d2) {
        double d3 = 0.0;
        double d4 = 1.0;
        for (int i = 0; i < this.a; ++i) {
            d3 += axb_0.a(this.b[i], d * d4, d2 * d4) / d4;
            d4 /= 2.0;
        }
        return d3;
    }

    public amu_0(Random random, int n) {
        this.a = n;
        this.b = new aZC[n];
        for (int i = 0; i < n; ++i) {
            this.b[i] = new aZC(random);
        }
    }

    public double[] a(double[] dArray, double d, double d2, int n, int n2, double d3, double d4, double d5, double d6) {
        if (dArray.length >= n * n2) {
            for (int i = 0; i < dArray.length; ++i) {
                dArray[i] = 0.0;
            }
        } else {
            dArray = new double[n * n2];
        }
        double d7 = 1.0;
        double d8 = 1.0;
        for (int i = 0; i < this.a; ++i) {
            axb_0.a(this.b[i], dArray, d, d2, n, n2, d3 * d8 * d7, d4 * d8 * d7, 0.55 / d7);
            d8 *= d5;
            d7 *= d6;
        }
        return dArray;
    }
}


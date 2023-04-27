/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Random;
import net.MathHelper;
import net.aMV;
import net.aia_1;
import net.amv_0;

/*
 * Renamed from net.aMr
 */
public class amr_0
extends amv_0 {
    private int b;
    private aMV[] a;

    public double[] a(double[] dArray, int n, int n2, int n3, int n4, int n5, int n6, double d, double d2, double d3) {
        dArray = new double[n4 * n5 * n6];
        double d4 = 1.0;
        for (int i = 0; i < this.b; ++i) {
            double d5 = (double)n * d4 * d;
            double d6 = (double)n2 * d4 * d2;
            double d7 = (double)n3 * d4 * d3;
            long l4 = MathHelper.c(d5);
            long l5 = MathHelper.c(d7);
            d5 -= (double)l4;
            d7 -= (double)l5;
            aia_1.a(this.a[i], dArray, d5 += (double)(l4 %= 0x1000000L), d6, d7 += (double)(l5 %= 0x1000000L), n4, n5, n6, d * d4, d2 * d4, d3 * d4, d4);
            d4 /= 2.0;
        }
        return dArray;
    }

    public amr_0(Random random, int n) {
        this.b = n;
        this.a = new aMV[n];
        for (int i = 0; i < n; ++i) {
            this.a[i] = new aMV(random);
        }
    }

    public double[] a(double[] dArray, int n, int n2, int n3, int n4, double d, double d2, double d3) {
        return this.a(dArray, n, 10, n2, n3, 1, n4, d, 1.0, d2);
    }
}


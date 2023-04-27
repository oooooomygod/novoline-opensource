/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Random;
import net.World;
import net.a5_0;
import net.ajf_0;
import net.xb_1;

/*
 * Renamed from net.ajz
 */
public class ajz_0
extends ajf_0 {
    private float[] d = new float[1024];

    protected void a(long l4, int n, int n2, xb_1 xb_12, double d, double d2, double d3, float f, float f2, float f3, int n3, int n4, double d4) {
        Random random = new Random(l4);
        double cfr_ignored_0 = n * 16 + 8;
        double cfr_ignored_1 = n2 * 16 + 8;
        int n5 = this.c * 16 - 16;
        n4 = n5 - a5_0.a(random, n5 / 4);
        n5 = 0;
        if (n3 == -1) {
            n3 = n4 / 2;
            n5 = 1;
        }
        float f4 = 1.0f;
        int n6 = 0;
        while (true) {
            if (a5_0.a(random, 3) == 0) {
                f4 = 1.0f + a5_0.e(random) * a5_0.e(random) * 1.0f;
            }
            this.d[n6] = f4 * f4;
            ++n6;
        }
    }

    @Override
    protected void a(World world, int n, int n2, int n3, int n4, xb_1 xb_12) {
        if (a5_0.a(this.a, 50) == 0) {
            double d = n * 16 + a5_0.a(this.a, 16);
            double d2 = a5_0.a(this.a, a5_0.a(this.a, 40) + 8) + 20;
            double d3 = n2 * 16 + a5_0.a(this.a, 16);
            boolean bl = true;
            int n5 = 0;
            while (true) {
                float f = a5_0.e(this.a) * (float)Math.PI * 2.0f;
                float f2 = (a5_0.e(this.a) - 0.5f) * 2.0f / 8.0f;
                float f3 = (a5_0.e(this.a) * 2.0f + a5_0.e(this.a)) * 2.0f;
                this.a(a5_0.b(this.a), n3, n4, xb_12, d, d2, d3, f3, f, f2, 0, 0, 3.0);
                ++n5;
            }
        }
    }
}


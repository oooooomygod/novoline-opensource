/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.Ma;
import net.MathHelper;
import net.aBR;
import net.abb_0;
import net.abs_1;
import net.nx_1;
import net.py_0;
import net.tj_0;
import net.tz_1;

/*
 * Renamed from net.Pj
 */
class pj_0
extends py_0 {
    private nx_1 g;

    @Override
    public void e() {
        if (this.b && !tz_1.b(aBR.h(this.g))) {
            double d = this.e - this.g.posX;
            double d2 = this.f - this.g.posY;
            double d3 = this.c - this.g.posZ;
            double d4 = d * d + d2 * d2 + d3 * d3;
            d4 = MathHelper.e(d4);
            d2 /= d4;
            float f = (float)(MathHelper.c(d3, d) * 180.0 / Math.PI) - 90.0f;
            this.g.aD = this.g.rotationYaw = this.a(this.g.rotationYaw, f, 30.0f);
            float f2 = (float)(this.d * Ma.d(aBR.a(this.g, abb_0.e)));
            aBR.c(this.g, aBR.k(this.g) + (f2 - aBR.k(this.g)) * 0.125f);
            double d5 = (double)MathHelper.h((double)(this.g.ticksExisted + aBR.i(this.g)) * 0.5) * 0.05;
            double d6 = MathHelper.b(this.g.rotationYaw * (float)Math.PI / 180.0f);
            double d7 = MathHelper.h(this.g.rotationYaw * (float)Math.PI / 180.0f);
            this.g.motionX += d5 * d6;
            this.g.motionZ += d5 * d7;
            d5 = (double)MathHelper.h((double)(this.g.ticksExisted + aBR.i(this.g)) * 0.75) * 0.05;
            this.g.motionY += d5 * (d7 + d6) * 0.25;
            this.g.motionY += (double)aBR.k(this.g) * d2 * 0.1;
            tj_0 tj_02 = aBR.c(this.g);
            double d8 = this.g.posX + d / d4 * 2.0;
            double d9 = (double)aBR.d(this.g) + this.g.posY + d2 / d4 * 1.0;
            double d10 = this.g.posZ + d3 / d4 * 2.0;
            double d11 = abs_1.a(tj_02);
            double d12 = abs_1.e(tj_02);
            double d13 = abs_1.b(tj_02);
            if (!abs_1.c(tj_02)) {
                d11 = d8;
                d12 = d9;
                d13 = d10;
            }
            abs_1.a(aBR.c(this.g), d11 + (d8 - d11) * 0.125, d12 + (d9 - d12) * 0.125, d13 + (d10 - d13) * 0.125, 10.0f, 40.0f);
            nx_1.a(this.g, true);
        } else {
            aBR.c(this.g, 0.0f);
            nx_1.a(this.g, false);
        }
    }

    public pj_0(nx_1 nx_12) {
        super(nx_12);
        this.g = nx_12;
    }
}


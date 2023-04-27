/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import net.MathHelper;
import net.a5_0;
import net.aV8;
import net.h__0;
import net.lw_1;
import net.nw_1;
import net.py_0;
import net.rm_2;

class P6
extends py_0 {
    private int h;
    private nw_1 g;

    public P6(nw_1 nw_12) {
        super(nw_12);
        this.g = nw_12;
    }

    private boolean a(double d, double d2, double d3, double d4) {
        double d5 = (d - this.g.posX) / d4;
        double d6 = (d2 - this.g.posY) / d4;
        double d7 = (d3 - this.g.posZ) / d4;
        rm_2 rm_22 = lw_1.c(this.g);
        int n = 1;
        while ((double)n < d4) {
            if (!ListInvoker.isEmpty(aV8.b(this.g.worldObj, this.g, rm_22 = h__0.b(rm_22, d5, d6, d7)))) {
                return false;
            }
            ++n;
        }
        return true;
    }

    @Override
    public void e() {
        if (this.b) {
            double d = this.e - this.g.posX;
            double d2 = this.f - this.g.posY;
            double d3 = this.c - this.g.posZ;
            double d4 = d * d + d2 * d2 + d3 * d3;
            if (this.h-- <= 0) {
                this.h += a5_0.a(lw_1.e(this.g), 5) + 2;
                if (this.a(this.e, this.f, this.c, d4 = (double)MathHelper.e(d4))) {
                    this.g.motionX += d / d4 * 0.1;
                    this.g.motionY += d2 / d4 * 0.1;
                    this.g.motionZ += d3 / d4 * 0.1;
                } else {
                    this.b = false;
                }
            }
        }
    }
}


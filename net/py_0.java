/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.CG;
import net.Ma;
import net.MathHelper;
import net.abb_0;
import net.nl_1;
import net.qo_2;

/*
 * Renamed from net.Py
 */
public class py_0 {
    protected double e;
    protected boolean b;
    protected nl_1 a;
    protected double d;
    protected double f;
    protected double c;

    public double c() {
        return this.d;
    }

    public boolean a() {
        return this.b;
    }

    public double f() {
        return this.f;
    }

    public double b() {
        return this.e;
    }

    public void e() {
        CG.b(this.a, 0.0f);
        if (this.b) {
            double d;
            this.b = false;
            double d2 = this.e - this.a.posX;
            int n = MathHelper.floor_double(CG.v((nl_1)this.a).a + 0.5);
            double d3 = this.f - (double)n;
            double d4 = d2 * d2 + d3 * d3 + (d = this.c - this.a.posZ) * d;
            if (d4 >= 2.500000277905201E-7) {
                float f = (float)(MathHelper.c(d, d2) * 180.0 / Math.PI) - 90.0f;
                this.a.rotationYaw = this.a(this.a.rotationYaw, f, 30.0f);
                CG.a(this.a, (float)(this.d * Ma.d(CG.a(this.a, abb_0.e))));
                if (d3 > 0.0 && d2 * d2 + d * d < 1.0) {
                    qo_2.a(CG.b(this.a));
                }
            }
        }
    }

    public py_0(nl_1 nl_12) {
        this.a = nl_12;
        this.e = nl_12.posX;
        this.f = nl_12.posY;
        this.c = nl_12.posZ;
    }

    public void a(double d, double d2, double d3, double d4) {
        this.e = d;
        this.f = d2;
        this.c = d3;
        this.d = d4;
        this.b = true;
    }

    protected float a(float f, float f2, float f3) {
        float f4;
        float f5 = MathHelper.a(f2 - f);
        if (f5 > f3) {
            f5 = f3;
        }
        if (f5 < -f3) {
            f5 = -f3;
        }
        if ((f4 = f + f5) < 0.0f) {
            f4 += 360.0f;
        } else if (f4 > 360.0f) {
            f4 -= 360.0f;
        }
        return f4;
    }

    public double d() {
        return this.c;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import deobf.EntityLivingBase;
import net.CG;
import net.MathHelper;
import net.ayj_0;
import net.nl_1;
import net.tz_1;

/*
 * Renamed from net.tJ
 */
public class tj_0 {
    private float d;
    private nl_1 c;
    private double a;
    private double g;
    private double e;
    private float f;
    private boolean b;

    public double d() {
        return this.a;
    }

    public double e() {
        return this.e;
    }

    public void a(double d, double d2, double d3, float f, float f2) {
        this.g = d;
        this.e = d2;
        this.a = d3;
        this.d = f;
        this.f = f2;
        this.b = true;
    }

    public tj_0(nl_1 nl_12) {
        this.c = nl_12;
    }

    public void a(Entity entity, float f, float f2) {
        this.g = entity.posX;
        this.e = entity instanceof EntityLivingBase ? entity.posY + (double)ayj_0.n(entity) : (ayj_0.u((Entity)entity).a + ayj_0.u((Entity)entity).c) / 2.0;
        this.a = entity.posZ;
        this.d = f;
        this.f = f2;
        this.b = true;
    }

    public void b() {
        this.c.rotationPitch = 0.0f;
        if (this.b) {
            this.b = false;
            double d = this.g - this.c.posX;
            double d2 = this.e - (this.c.posY + (double)CG.A(this.c));
            double d3 = this.a - this.c.posZ;
            double d4 = MathHelper.e(d * d + d3 * d3);
            float f = (float)(MathHelper.c(d3, d) * 180.0 / Math.PI) - 90.0f;
            float f2 = (float)(-(MathHelper.c(d2, d4) * 180.0 / Math.PI));
            this.c.rotationPitch = this.a(this.c.rotationPitch, f2, this.f);
            this.c.aP = this.a(this.c.aP, f, this.d);
        } else {
            this.c.aP = this.a(this.c.aP, this.c.aD, 10.0f);
        }
        float f = MathHelper.a(this.c.aP - this.c.aD);
        if (!tz_1.b(CG.e(this.c))) {
            if (f < -75.0f) {
                this.c.aP = this.c.aD - 75.0f;
            }
            if (f > 75.0f) {
                this.c.aP = this.c.aD + 75.0f;
            }
        }
    }

    private float a(float f, float f2, float f3) {
        float f4 = MathHelper.a(f2 - f);
        if (f4 > f3) {
            f4 = f3;
        }
        if (f4 < -f3) {
            f4 = -f3;
        }
        return f + f4;
    }

    public double c() {
        return this.g;
    }

    public boolean a() {
        return this.b;
    }
}


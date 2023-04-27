/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import deobf.Entity;
import net.MathHelper;
import net.a5Y;
import net.ayj_0;
import net.q1_0;
import net.up_0;

/*
 * Renamed from net.ry
 */
public class ry_1
extends q1_0 {
    public a5Y q;
    public a5Y h;
    public int n;
    public a5Y o;
    public a5Y k;
    public a5Y j;
    public int p;
    public boolean m;
    public boolean i;
    public a5Y r;
    public a5Y l;

    public ry_1(float f, float f2, int n, int n2) {
        this.b = n;
        this.e = n2;
        this.r = new a5Y(this, 0, 0);
        up_0.a(this.r, -4.0f, -8.0f, -4.0f, 8, 8, 8, f);
        up_0.a(this.r, 0.0f, 0.0f + f2, 0.0f);
        this.k = new a5Y(this, 32, 0);
        up_0.a(this.k, -4.0f, -8.0f, -4.0f, 8, 8, 8, f + 0.5f);
        up_0.a(this.k, 0.0f, 0.0f + f2, 0.0f);
        this.q = new a5Y(this, 16, 16);
        up_0.a(this.q, -4.0f, 0.0f, -2.0f, 8, 12, 4, f);
        up_0.a(this.q, 0.0f, 0.0f + f2, 0.0f);
        this.h = new a5Y(this, 40, 16);
        up_0.a(this.h, -3.0f, -2.0f, -2.0f, 4, 12, 4, f);
        up_0.a(this.h, -5.0f, 2.0f + f2, 0.0f);
        this.j = new a5Y(this, 40, 16);
        this.j.x = true;
        up_0.a(this.j, -1.0f, -2.0f, -2.0f, 4, 12, 4, f);
        up_0.a(this.j, 5.0f, 2.0f + f2, 0.0f);
        this.l = new a5Y(this, 0, 16);
        up_0.a(this.l, -2.0f, 0.0f, -2.0f, 4, 12, 4, f);
        up_0.a(this.l, -1.9f, 12.0f + f2, 0.0f);
        this.o = new a5Y(this, 0, 16);
        this.o.x = true;
        up_0.a(this.o, -2.0f, 0.0f, -2.0f, 4, 12, 4, f);
        up_0.a(this.o, 1.9f, 12.0f + f2, 0.0f);
    }

    public ry_1() {
        this(0.0f);
    }

    public void a(boolean bl) {
        this.r.p = bl;
        this.k.p = bl;
        this.q.p = bl;
        this.h.p = bl;
        this.j.p = bl;
        this.l.p = bl;
        this.o.p = bl;
    }

    @Override
    public void a(q1_0 q1_02) {
        super.a(q1_02);
        if (q1_02 instanceof ry_1) {
            ry_1 ry_12 = (ry_1)q1_02;
            this.n = ry_12.n;
            this.p = ry_12.p;
            this.m = ry_12.m;
            this.i = ry_12.i;
        }
    }

    public void a(float f) {
        up_0.a(this.h, f);
    }

    public ry_1(float f) {
        this(f, 0.0f, 64, 32);
    }

    @Override
    public void a(float f, float f2, float f3, float f4, float f5, float f6, Entity entity) {
        float f7;
        float f8;
        this.r.m = f4 / 57.295776f;
        this.r.t = f5 / 57.295776f;
        this.h.t = MathHelper.cos(f * 0.6662f + (float)Math.PI) * 2.0f * f2 * 0.5f;
        this.j.t = MathHelper.cos(f * 0.6662f) * 2.0f * f2 * 0.5f;
        this.h.n = 0.0f;
        this.j.n = 0.0f;
        this.l.t = MathHelper.cos(f * 0.6662f) * 1.4f * f2;
        this.o.t = MathHelper.cos(f * 0.6662f + (float)Math.PI) * 1.4f * f2;
        this.l.m = 0.0f;
        this.o.m = 0.0f;
        if (this.d) {
            this.h.t += -0.62831855f;
            this.j.t += -0.62831855f;
            this.l.t = -1.2566371f;
            this.o.t = -1.2566371f;
            this.l.m = 0.31415927f;
            this.o.m = -0.31415927f;
        }
        if (this.n != 0) {
            this.j.t = this.j.t * 0.5f - 0.31415927f * (float)this.n;
        }
        this.h.m = 0.0f;
        this.h.n = 0.0f;
        switch (this.p) {
            default: {
                break;
            }
            case 1: {
                this.h.t = this.h.t * 0.5f - 0.31415927f * (float)this.p;
                break;
            }
            case 3: {
                this.h.t = this.h.t * 0.5f - 0.31415927f * (float)this.p;
                this.h.m = -0.5235988f;
            }
        }
        this.j.m = 0.0f;
        if (this.f > -9990.0f) {
            f8 = this.f;
            this.q.m = MathHelper.sin(MathHelper.g(f8) * (float)Math.PI * 2.0f) * 0.2f;
            this.h.z = MathHelper.sin(this.q.m) * 5.0f;
            this.h.g = -MathHelper.cos(this.q.m) * 5.0f;
            this.j.z = -MathHelper.sin(this.q.m) * 5.0f;
            this.j.g = MathHelper.cos(this.q.m) * 5.0f;
            this.h.m += this.q.m;
            this.j.m += this.q.m;
            this.j.t += this.q.m;
            f8 = 1.0f - this.f;
            f8 *= f8;
            f8 *= f8;
            f8 = 1.0f - f8;
            f7 = MathHelper.sin(f8 * (float)Math.PI);
            float f9 = MathHelper.sin(this.f * (float)Math.PI) * -(this.r.t - 0.7f) * 0.75f;
            this.h.t = (float)((double)this.h.t - ((double)f7 * 1.2 + (double)f9));
            this.h.m += this.q.m * 2.0f;
            this.h.n += MathHelper.sin(this.f * (float)Math.PI) * -0.4f;
        }
        if (this.m) {
            this.q.t = 0.5f;
            this.h.t += 0.4f;
            this.j.t += 0.4f;
            this.l.z = 4.0f;
            this.o.z = 4.0f;
            this.l.o = 9.0f;
            this.o.o = 9.0f;
            this.r.o = 1.0f;
        } else {
            this.q.t = 0.0f;
            this.l.z = 0.1f;
            this.o.z = 0.1f;
            this.l.o = 12.0f;
            this.o.o = 12.0f;
            this.r.o = 0.0f;
        }
        this.h.n += MathHelper.cos(f3 * 0.09f) * 0.05f + 0.05f;
        this.j.n -= MathHelper.cos(f3 * 0.09f) * 0.05f + 0.05f;
        this.h.t += MathHelper.sin(f3 * 0.067f) * 0.05f;
        this.j.t -= MathHelper.sin(f3 * 0.067f) * 0.05f;
        if (this.i) {
            f8 = 0.0f;
            f7 = 0.0f;
            this.h.n = 0.0f;
            this.j.n = 0.0f;
            this.h.m = -(0.1f - f8 * 0.6f) + this.r.m;
            this.j.m = 0.1f - f8 * 0.6f + this.r.m + 0.4f;
            this.h.t = -1.5707964f + this.r.t;
            this.j.t = -1.5707964f + this.r.t;
            this.h.t -= f8 * 1.2f - f7 * 0.4f;
            this.j.t -= f8 * 1.2f - f7 * 0.4f;
            this.h.n += MathHelper.cos(f3 * 0.09f) * 0.05f + 0.05f;
            this.j.n -= MathHelper.cos(f3 * 0.09f) * 0.05f + 0.05f;
            this.h.t += MathHelper.sin(f3 * 0.067f) * 0.05f;
            this.j.t -= MathHelper.sin(f3 * 0.067f) * 0.05f;
        }
        ry_1.a(this.r, this.k);
    }

    @Override
    public void a(Entity entity, float f, float f2, float f3, float f4, float f5, float f6) {
        this.a(f, f2, f3, f4, f5, f6, entity);
        GlStateManagerInvoker.pushMatrix();
        if (this.g) {
            GlStateManagerInvoker.c(0.75f, 0.75f, 0.75f);
            GlStateManagerInvoker.translate(0.0f, 16.0f * f6, 0.0f);
            up_0.b(this.r, f6);
            GlStateManagerInvoker.popMatrix();
            GlStateManagerInvoker.pushMatrix();
            GlStateManagerInvoker.c(0.5f, 0.5f, 0.5f);
            GlStateManagerInvoker.translate(0.0f, 24.0f * f6, 0.0f);
        } else {
            if (ayj_0.l(entity)) {
                GlStateManagerInvoker.translate(0.0f, 0.2f, 0.0f);
            }
            up_0.b(this.r, f6);
        }
        up_0.b(this.q, f6);
        up_0.b(this.h, f6);
        up_0.b(this.j, f6);
        up_0.b(this.l, f6);
        up_0.b(this.o, f6);
        up_0.b(this.k, f6);
        GlStateManagerInvoker.popMatrix();
    }
}


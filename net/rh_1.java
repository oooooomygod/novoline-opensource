/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import deobf.Entity;
import deobf.EntityLivingBase;
import net.MathHelper;
import net.a5Y;
import net.aQ1;
import net.ayq_1;
import net.nb_1;
import net.q1_0;
import net.up_0;

/*
 * Renamed from net.rh
 */
public class rh_1
extends q1_0 {
    int h = 1;
    a5Y o;
    a5Y n;
    a5Y i;
    a5Y j;
    a5Y k;
    a5Y p;
    a5Y m;
    a5Y l;

    public rh_1() {
        this.a(aQ1.i, 0, 0);
        this.a(aQ1.d, 0, 24);
        this.a(aQ1.b, 0, 10);
        this.a(aQ1.c, 6, 10);
        this.m = new a5Y(this, aQ1.h);
        up_0.a(this.m, aQ1.e, -2.5f, -2.0f, -3.0f, 5, 4, 5);
        up_0.a(this.m, aQ1.a, -1.5f, 0.0f, -4.0f, 3, 2, 2);
        up_0.a(this.m, aQ1.g, -2.0f, -3.0f, 0.0f, 1, 1, 2);
        up_0.a(this.m, aQ1.f, 1.0f, -3.0f, 0.0f, 1, 1, 2);
        up_0.a(this.m, 0.0f, 15.0f, -9.0f);
        this.n = new a5Y(this, 20, 0);
        up_0.a(this.n, -2.0f, 3.0f, -8.0f, 4, 16, 6, 0.0f);
        up_0.a(this.n, 0.0f, 12.0f, -10.0f);
        this.j = new a5Y(this, 0, 15);
        up_0.a(this.j, -0.5f, 0.0f, 0.0f, 1, 8, 1);
        this.j.t = 0.9f;
        up_0.a(this.j, 0.0f, 15.0f, 8.0f);
        this.i = new a5Y(this, 4, 15);
        up_0.a(this.i, -0.5f, 0.0f, 0.0f, 1, 8, 1);
        up_0.a(this.i, 0.0f, 20.0f, 14.0f);
        this.k = new a5Y(this, 8, 13);
        up_0.a(this.k, -1.0f, 0.0f, 1.0f, 2, 6, 2);
        up_0.a(this.k, 1.1f, 18.0f, 5.0f);
        this.p = new a5Y(this, 8, 13);
        up_0.a(this.p, -1.0f, 0.0f, 1.0f, 2, 6, 2);
        up_0.a(this.p, -1.1f, 18.0f, 5.0f);
        this.o = new a5Y(this, 40, 0);
        up_0.a(this.o, -1.0f, 0.0f, 0.0f, 2, 10, 2);
        up_0.a(this.o, 1.2f, 13.8f, -5.0f);
        this.l = new a5Y(this, 40, 0);
        up_0.a(this.l, -1.0f, 0.0f, 0.0f, 2, 10, 2);
        up_0.a(this.l, -1.2f, 13.8f, -5.0f);
    }

    @Override
    public void a(Entity entity, float f, float f2, float f3, float f4, float f5, float f6) {
        this.a(f, f2, f3, f4, f5, f6, entity);
        if (this.g) {
            GlStateManagerInvoker.pushMatrix();
            GlStateManagerInvoker.c(0.75f, 0.75f, 0.75f);
            GlStateManagerInvoker.translate(0.0f, 10.0f * f6, 4.0f * f6);
            up_0.b(this.m, f6);
            GlStateManagerInvoker.popMatrix();
            GlStateManagerInvoker.pushMatrix();
            GlStateManagerInvoker.c(0.5f, 0.5f, 0.5f);
            GlStateManagerInvoker.translate(0.0f, 24.0f * f6, 0.0f);
            up_0.b(this.n, f6);
            up_0.b(this.k, f6);
            up_0.b(this.p, f6);
            up_0.b(this.o, f6);
            up_0.b(this.l, f6);
            up_0.b(this.j, f6);
            up_0.b(this.i, f6);
            GlStateManagerInvoker.popMatrix();
        } else {
            up_0.b(this.m, f6);
            up_0.b(this.n, f6);
            up_0.b(this.j, f6);
            up_0.b(this.i, f6);
            up_0.b(this.k, f6);
            up_0.b(this.p, f6);
            up_0.b(this.o, f6);
            up_0.b(this.l, f6);
        }
    }

    @Override
    public void a(EntityLivingBase entityLivingBase, float f, float f2, float f3) {
        nb_1 nb_12 = (nb_1)entityLivingBase;
        this.n.o = 12.0f;
        this.n.z = -10.0f;
        this.m.o = 15.0f;
        this.m.z = -9.0f;
        this.j.o = 15.0f;
        this.j.z = 8.0f;
        this.i.o = 20.0f;
        this.i.z = 14.0f;
        this.l.o = 13.8f;
        this.o.o = 13.8f;
        this.l.z = -5.0f;
        this.o.z = -5.0f;
        this.p.o = 18.0f;
        this.k.o = 18.0f;
        this.p.z = 5.0f;
        this.k.z = 5.0f;
        this.j.t = 0.9f;
        if (ayq_1.a(nb_12)) {
            this.n.o += 1.0f;
            this.m.o += 2.0f;
            this.j.o += 1.0f;
            this.i.o += -4.0f;
            this.i.z += 2.0f;
            this.j.t = 1.5707964f;
            this.i.t = 1.5707964f;
            this.h = 0;
        } else if (ayq_1.f(nb_12)) {
            this.i.o = this.j.o;
            this.i.z += 2.0f;
            this.j.t = 1.5707964f;
            this.i.t = 1.5707964f;
            this.h = 2;
        } else if (ayq_1.b(nb_12)) {
            this.n.t = 0.7853982f;
            this.n.o += -4.0f;
            this.n.z += 5.0f;
            this.m.o += -3.3f;
            this.m.z += 1.0f;
            this.j.o += 8.0f;
            this.j.z += -2.0f;
            this.i.o += 2.0f;
            this.i.z += -0.8f;
            this.j.t = 1.7278761f;
            this.i.t = 2.670354f;
            this.l.t = -0.15707964f;
            this.o.t = -0.15707964f;
            this.l.o = 15.8f;
            this.o.o = 15.8f;
            this.l.z = -7.0f;
            this.o.z = -7.0f;
            this.p.t = -1.5707964f;
            this.k.t = -1.5707964f;
            this.p.o = 21.0f;
            this.k.o = 21.0f;
            this.p.z = 1.0f;
            this.k.z = 1.0f;
            this.h = 3;
        } else {
            this.h = 1;
        }
    }

    @Override
    public void a(float f, float f2, float f3, float f4, float f5, float f6, Entity entity) {
        this.m.t = f5 / 57.295776f;
        this.m.m = f4 / 57.295776f;
        if (this.h != 3) {
            this.n.t = 1.5707964f;
            if (this.h == 2) {
                this.k.t = MathHelper.cos(f * 0.6662f) * 1.0f * f2;
                this.p.t = MathHelper.cos(f * 0.6662f + 0.3f) * 1.0f * f2;
                this.o.t = MathHelper.cos(f * 0.6662f + (float)Math.PI + 0.3f) * 1.0f * f2;
                this.l.t = MathHelper.cos(f * 0.6662f + (float)Math.PI) * 1.0f * f2;
                this.i.t = 1.7278761f + 0.31415927f * MathHelper.cos(f) * f2;
            } else {
                this.k.t = MathHelper.cos(f * 0.6662f) * 1.0f * f2;
                this.p.t = MathHelper.cos(f * 0.6662f + (float)Math.PI) * 1.0f * f2;
                this.o.t = MathHelper.cos(f * 0.6662f + (float)Math.PI) * 1.0f * f2;
                this.l.t = MathHelper.cos(f * 0.6662f) * 1.0f * f2;
                this.i.t = this.h == 1 ? 1.7278761f + 0.7853982f * MathHelper.cos(f) * f2 : 1.7278761f + 0.47123894f * MathHelper.cos(f) * f2;
            }
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import deobf.Entity;
import deobf.EntityLivingBase;
import net.MathHelper;
import net.QV;
import net.a5Y;
import net.nf_1;
import net.q1_0;
import net.up_0;

/*
 * Renamed from net.rS
 */
public class rs_0
extends q1_0 {
    public a5Y l;
    public a5Y j;
    public a5Y m = new a5Y(this, 0, 0);
    a5Y k;
    a5Y i;
    public a5Y o;
    public a5Y n;
    public a5Y h;

    @Override
    public void a(Entity entity, float f, float f2, float f3, float f4, float f5, float f6) {
        super.a(entity, f, f2, f3, f4, f5, f6);
        this.a(f, f2, f3, f4, f5, f6, entity);
        if (this.g) {
            GlStateManagerInvoker.pushMatrix();
            GlStateManagerInvoker.translate(0.0f, 5.0f * f6, 2.0f * f6);
            up_0.c(this.m, f6);
            GlStateManagerInvoker.popMatrix();
            GlStateManagerInvoker.pushMatrix();
            GlStateManagerInvoker.c(0.5f, 0.5f, 0.5f);
            GlStateManagerInvoker.translate(0.0f, 24.0f * f6, 0.0f);
            up_0.b(this.n, f6);
            up_0.b(this.h, f6);
            up_0.b(this.l, f6);
            up_0.b(this.o, f6);
            up_0.b(this.j, f6);
            up_0.c(this.k, f6);
            up_0.b(this.i, f6);
            GlStateManagerInvoker.popMatrix();
        } else {
            up_0.c(this.m, f6);
            up_0.b(this.n, f6);
            up_0.b(this.h, f6);
            up_0.b(this.l, f6);
            up_0.b(this.o, f6);
            up_0.b(this.j, f6);
            up_0.c(this.k, f6);
            up_0.b(this.i, f6);
        }
    }

    public rs_0() {
        up_0.a(this.m, -3.0f, -3.0f, -2.0f, 6, 6, 4, 0.0f);
        up_0.a(this.m, -1.0f, 13.5f, -7.0f);
        this.n = new a5Y(this, 18, 14);
        up_0.a(this.n, -4.0f, -2.0f, -3.0f, 6, 9, 6, 0.0f);
        up_0.a(this.n, 0.0f, 14.0f, 2.0f);
        this.i = new a5Y(this, 21, 0);
        up_0.a(this.i, -4.0f, -3.0f, -3.0f, 8, 6, 7, 0.0f);
        up_0.a(this.i, -1.0f, 14.0f, 2.0f);
        this.h = new a5Y(this, 0, 18);
        up_0.a(this.h, -1.0f, 0.0f, -1.0f, 2, 8, 2, 0.0f);
        up_0.a(this.h, -2.5f, 16.0f, 7.0f);
        this.l = new a5Y(this, 0, 18);
        up_0.a(this.l, -1.0f, 0.0f, -1.0f, 2, 8, 2, 0.0f);
        up_0.a(this.l, 0.5f, 16.0f, 7.0f);
        this.o = new a5Y(this, 0, 18);
        up_0.a(this.o, -1.0f, 0.0f, -1.0f, 2, 8, 2, 0.0f);
        up_0.a(this.o, -2.5f, 16.0f, -4.0f);
        this.j = new a5Y(this, 0, 18);
        up_0.a(this.j, -1.0f, 0.0f, -1.0f, 2, 8, 2, 0.0f);
        up_0.a(this.j, 0.5f, 16.0f, -4.0f);
        this.k = new a5Y(this, 9, 18);
        up_0.a(this.k, -1.0f, 0.0f, -1.0f, 2, 8, 2, 0.0f);
        up_0.a(this.k, -1.0f, 12.0f, 8.0f);
        up_0.a(up_0.b(this.m, 16, 14), -3.0f, -5.0f, 0.0f, 2, 2, 1, 0.0f);
        up_0.a(up_0.b(this.m, 16, 14), 1.0f, -5.0f, 0.0f, 2, 2, 1, 0.0f);
        up_0.a(up_0.b(this.m, 0, 10), -1.5f, 0.0f, -5.0f, 3, 3, 4, 0.0f);
    }

    @Override
    public void a(EntityLivingBase entityLivingBase, float f, float f2, float f3) {
        nf_1 nf_12 = (nf_1)entityLivingBase;
        this.k.m = QV.c(nf_12) ? 0.0f : MathHelper.cos(f * 0.6662f) * 1.4f * f2;
        if (QV.e(nf_12)) {
            up_0.a(this.i, -1.0f, 16.0f, -3.0f);
            this.i.t = 1.2566371f;
            this.i.m = 0.0f;
            up_0.a(this.n, 0.0f, 18.0f, 0.0f);
            this.n.t = 0.7853982f;
            up_0.a(this.k, -1.0f, 21.0f, 6.0f);
            up_0.a(this.h, -2.5f, 22.0f, 2.0f);
            this.h.t = 4.712389f;
            up_0.a(this.l, 0.5f, 22.0f, 2.0f);
            this.l.t = 4.712389f;
            this.o.t = 5.811947f;
            up_0.a(this.o, -2.49f, 17.0f, -4.0f);
            this.j.t = 5.811947f;
            up_0.a(this.j, 0.51f, 17.0f, -4.0f);
        } else {
            up_0.a(this.n, 0.0f, 14.0f, 2.0f);
            this.n.t = 1.5707964f;
            up_0.a(this.i, -1.0f, 14.0f, -3.0f);
            this.i.t = this.n.t;
            up_0.a(this.k, -1.0f, 12.0f, 8.0f);
            up_0.a(this.h, -2.5f, 16.0f, 7.0f);
            up_0.a(this.l, 0.5f, 16.0f, 7.0f);
            up_0.a(this.o, -2.5f, 16.0f, -4.0f);
            up_0.a(this.j, 0.5f, 16.0f, -4.0f);
            this.h.t = MathHelper.cos(f * 0.6662f) * 1.4f * f2;
            this.l.t = MathHelper.cos(f * 0.6662f + (float)Math.PI) * 1.4f * f2;
            this.o.t = MathHelper.cos(f * 0.6662f + (float)Math.PI) * 1.4f * f2;
            this.j.t = MathHelper.cos(f * 0.6662f) * 1.4f * f2;
        }
        this.m.n = QV.a(nf_12, f3) + QV.a(nf_12, f3, 0.0f);
        this.i.n = QV.a(nf_12, f3, -0.08f);
        this.n.n = QV.a(nf_12, f3, -0.16f);
        this.k.n = QV.a(nf_12, f3, -0.2f);
    }

    @Override
    public void a(float f, float f2, float f3, float f4, float f5, float f6, Entity entity) {
        super.a(f, f2, f3, f4, f5, f6, entity);
        this.m.t = f5 / 57.295776f;
        this.m.m = f4 / 57.295776f;
        this.k.t = f3;
    }
}


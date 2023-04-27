/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import deobf.Entity;
import deobf.EntityLivingBase;
import net.FY;
import net.MathHelper;
import net.a5Y;
import net.ng_1;
import net.pm_2;
import net.q1_0;
import net.up_0;

/*
 * Renamed from net.rZ
 */
public class rz_1
extends q1_0 {
    a5Y u;
    a5Y l;
    a5Y m;
    a5Y h;
    a5Y j;
    a5Y q;
    a5Y n;
    a5Y k;
    a5Y s;
    a5Y r;
    a5Y o;
    private float i = 0.0f;
    private float p = 0.0f;
    a5Y t;

    private void a(a5Y a5Y2, float f, float f2, float f3) {
        a5Y2.t = f;
        a5Y2.m = f2;
        a5Y2.n = f3;
    }

    @Override
    public void a(float f, float f2, float f3, float f4, float f5, float f6, Entity entity) {
        float f7 = f3 - (float)entity.ticksExisted;
        ng_1 ng_12 = (ng_1)entity;
        this.u.t = this.q.t = f5 * ((float)Math.PI / 180);
        this.j.t = this.q.t;
        this.r.t = this.q.t;
        this.r.m = this.j.m = f4 * ((float)Math.PI / 180);
        this.u.m = this.r.m - 0.2617994f;
        this.q.m = this.r.m + 0.2617994f;
        this.p = MathHelper.sin(FY.a(ng_12, f7) * (float)Math.PI);
        this.s.t = this.m.t = (this.p * 50.0f - 21.0f) * ((float)Math.PI / 180);
        this.h.t = this.o.t = this.p * 50.0f * ((float)Math.PI / 180);
        this.t.t = this.l.t = (this.p * -40.0f - 11.0f) * ((float)Math.PI / 180);
    }

    @Override
    public void a(Entity entity, float f, float f2, float f3, float f4, float f5, float f6) {
        this.a(f, f2, f3, f4, f5, f6, entity);
        if (this.g) {
            GlStateManagerInvoker.pushMatrix();
            GlStateManagerInvoker.translate(0.0f, 5.0f * f6, 2.0f * f6);
            up_0.b(this.j, f6);
            up_0.b(this.q, f6);
            up_0.b(this.u, f6);
            up_0.b(this.r, f6);
            GlStateManagerInvoker.popMatrix();
            GlStateManagerInvoker.pushMatrix();
            GlStateManagerInvoker.c(0.5f, 0.5f, 0.5f);
            GlStateManagerInvoker.translate(0.0f, 24.0f * f6, 0.0f);
            up_0.b(this.h, f6);
            up_0.b(this.o, f6);
            up_0.b(this.s, f6);
            up_0.b(this.m, f6);
            up_0.b(this.k, f6);
            up_0.b(this.t, f6);
            up_0.b(this.l, f6);
            up_0.b(this.n, f6);
            GlStateManagerInvoker.popMatrix();
        } else {
            up_0.b(this.h, f6);
            up_0.b(this.o, f6);
            up_0.b(this.s, f6);
            up_0.b(this.m, f6);
            up_0.b(this.k, f6);
            up_0.b(this.t, f6);
            up_0.b(this.l, f6);
            up_0.b(this.j, f6);
            up_0.b(this.u, f6);
            up_0.b(this.q, f6);
            up_0.b(this.n, f6);
            up_0.b(this.r, f6);
        }
    }

    @Override
    public void a(EntityLivingBase entityLivingBase, float f, float f2, float f3) {
    }

    public rz_1() {
        this.a(pm_2.b, 0, 0);
        this.a(pm_2.a, 0, 24);
        this.a(pm_2.c, 0, 10);
        this.a(pm_2.d, 6, 10);
        this.h = new a5Y(this, 26, 24);
        up_0.a(this.h, -1.0f, 5.5f, -3.7f, 2, 1, 7);
        up_0.a(this.h, 3.0f, 17.5f, 3.7f);
        this.h.x = true;
        this.a(this.h, 0.0f, 0.0f, 0.0f);
        this.o = new a5Y(this, 8, 24);
        up_0.a(this.o, -1.0f, 5.5f, -3.7f, 2, 1, 7);
        up_0.a(this.o, -3.0f, 17.5f, 3.7f);
        this.o.x = true;
        this.a(this.o, 0.0f, 0.0f, 0.0f);
        this.s = new a5Y(this, 30, 15);
        up_0.a(this.s, -1.0f, 0.0f, 0.0f, 2, 4, 5);
        up_0.a(this.s, 3.0f, 17.5f, 3.7f);
        this.s.x = true;
        this.a(this.s, -0.34906584f, 0.0f, 0.0f);
        this.m = new a5Y(this, 16, 15);
        up_0.a(this.m, -1.0f, 0.0f, 0.0f, 2, 4, 5);
        up_0.a(this.m, -3.0f, 17.5f, 3.7f);
        this.m.x = true;
        this.a(this.m, -0.34906584f, 0.0f, 0.0f);
        this.k = new a5Y(this, 0, 0);
        up_0.a(this.k, -3.0f, -2.0f, -10.0f, 6, 5, 10);
        up_0.a(this.k, 0.0f, 19.0f, 8.0f);
        this.k.x = true;
        this.a(this.k, -0.34906584f, 0.0f, 0.0f);
        this.t = new a5Y(this, 8, 15);
        up_0.a(this.t, -1.0f, 0.0f, -1.0f, 2, 7, 2);
        up_0.a(this.t, 3.0f, 17.0f, -1.0f);
        this.t.x = true;
        this.a(this.t, -0.17453292f, 0.0f, 0.0f);
        this.l = new a5Y(this, 0, 15);
        up_0.a(this.l, -1.0f, 0.0f, -1.0f, 2, 7, 2);
        up_0.a(this.l, -3.0f, 17.0f, -1.0f);
        this.l.x = true;
        this.a(this.l, -0.17453292f, 0.0f, 0.0f);
        this.j = new a5Y(this, 32, 0);
        up_0.a(this.j, -2.5f, -4.0f, -5.0f, 5, 4, 5);
        up_0.a(this.j, 0.0f, 16.0f, -1.0f);
        this.j.x = true;
        this.a(this.j, 0.0f, 0.0f, 0.0f);
        this.u = new a5Y(this, 52, 0);
        up_0.a(this.u, -2.5f, -9.0f, -1.0f, 2, 5, 1);
        up_0.a(this.u, 0.0f, 16.0f, -1.0f);
        this.u.x = true;
        this.a(this.u, 0.0f, -0.2617994f, 0.0f);
        this.q = new a5Y(this, 58, 0);
        up_0.a(this.q, 0.5f, -9.0f, -1.0f, 2, 5, 1);
        up_0.a(this.q, 0.0f, 16.0f, -1.0f);
        this.q.x = true;
        this.a(this.q, 0.0f, 0.2617994f, 0.0f);
        this.n = new a5Y(this, 52, 6);
        up_0.a(this.n, -1.5f, -1.5f, 0.0f, 3, 3, 2);
        up_0.a(this.n, 0.0f, 20.0f, 7.0f);
        this.n.x = true;
        this.a(this.n, -0.3490659f, 0.0f, 0.0f);
        this.r = new a5Y(this, 32, 9);
        up_0.a(this.r, -0.5f, -2.5f, -5.5f, 1, 1, 1);
        up_0.a(this.r, 0.0f, 16.0f, -1.0f);
        this.r.x = true;
        this.a(this.r, 0.0f, 0.0f, 0.0f);
    }
}


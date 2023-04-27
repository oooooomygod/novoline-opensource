/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.EventManagerInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import deobf.Entity;
import net.a5Y;
import net.ayj_0;
import net.ry_1;
import net.up_0;
import net.xi_2;

/*
 * Renamed from net.rV
 */
public class rv_0
extends ry_1 {
    private a5Y u;
    private a5Y t;
    public a5Y z;
    public a5Y w;
    public a5Y s;
    private boolean v;
    public a5Y y;
    public a5Y x;

    public void b() {
        up_0.b(this.j, 0.0625f);
        up_0.b(this.y, 0.0625f);
    }

    @Override
    public void a(boolean bl) {
        super.a(bl);
        this.y.p = bl;
        this.w.p = bl;
        this.x.p = bl;
        this.s.p = bl;
        this.z.p = bl;
        this.u.p = bl;
        this.t.p = bl;
    }

    @Override
    public void a(float f) {
        if (this.v) {
            this.h.g += 1.0f;
            up_0.a(this.h, f);
            this.h.g -= 1.0f;
        } else {
            up_0.a(this.h, f);
        }
    }

    @Override
    public void a(float f, float f2, float f3, float f4, float f5, float f6, Entity entity) {
        super.a(f, f2, f3, f4, f5, f6, entity);
        rv_0.a(this.o, this.x);
        rv_0.a(this.l, this.s);
        rv_0.a(this.j, this.y);
        rv_0.a(this.h, this.w);
        rv_0.a(this.q, this.z);
        EventManagerInvoker.call(new xi_2(entity, this));
    }

    public void b(float f) {
        rv_0.a(this.r, this.t);
        this.t.g = 0.0f;
        this.t.o = 0.0f;
        up_0.b(this.t, f);
    }

    public void c(float f) {
        up_0.b(this.u, f);
    }

    public rv_0(float f, boolean bl) {
        super(f, 0.0f, 64, 64);
        this.v = bl;
        this.t = new a5Y(this, 24, 0);
        up_0.a(this.t, -3.0f, -6.0f, -1.0f, 6, 6, 1, f);
        this.u = new a5Y(this, 0, 0);
        up_0.a(this.u, 64, 32);
        up_0.a(this.u, -5.0f, 0.0f, -1.0f, 10, 16, 1, f);
        this.j = new a5Y(this, 32, 48);
        up_0.a(this.j, -1.0f, -2.0f, -2.0f, 3, 12, 4, f);
        up_0.a(this.j, 5.0f, 2.5f, 0.0f);
        this.h = new a5Y(this, 40, 16);
        up_0.a(this.h, -2.0f, -2.0f, -2.0f, 3, 12, 4, f);
        up_0.a(this.h, -5.0f, 2.5f, 0.0f);
        this.y = new a5Y(this, 48, 48);
        up_0.a(this.y, -1.0f, -2.0f, -2.0f, 3, 12, 4, f + 0.25f);
        up_0.a(this.y, 5.0f, 2.5f, 0.0f);
        this.w = new a5Y(this, 40, 32);
        up_0.a(this.w, -2.0f, -2.0f, -2.0f, 3, 12, 4, f + 0.25f);
        up_0.a(this.w, -5.0f, 2.5f, 10.0f);
        this.o = new a5Y(this, 16, 48);
        up_0.a(this.o, -2.0f, 0.0f, -2.0f, 4, 12, 4, f);
        up_0.a(this.o, 1.9f, 12.0f, 0.0f);
        this.x = new a5Y(this, 0, 48);
        up_0.a(this.x, -2.0f, 0.0f, -2.0f, 4, 12, 4, f + 0.25f);
        up_0.a(this.x, 1.9f, 12.0f, 0.0f);
        this.s = new a5Y(this, 0, 32);
        up_0.a(this.s, -2.0f, 0.0f, -2.0f, 4, 12, 4, f + 0.25f);
        up_0.a(this.s, -1.9f, 12.0f, 0.0f);
        this.z = new a5Y(this, 16, 32);
        up_0.a(this.z, -4.0f, 0.0f, -2.0f, 8, 12, 4, f + 0.25f);
        up_0.a(this.z, 0.0f, 0.0f, 0.0f);
    }

    public void a() {
        up_0.b(this.h, 0.0625f);
        up_0.b(this.w, 0.0625f);
    }

    @Override
    public void a(Entity entity, float f, float f2, float f3, float f4, float f5, float f6) {
        super.a(entity, f, f2, f3, f4, f5, f6);
        GlStateManagerInvoker.pushMatrix();
        if (this.g) {
            float f7 = 2.0f;
            GlStateManagerInvoker.c(1.0f / f7, 1.0f / f7, 1.0f / f7);
            GlStateManagerInvoker.translate(0.0f, 24.0f * f6, 0.0f);
        } else if (ayj_0.l(entity)) {
            GlStateManagerInvoker.translate(0.0f, 0.2f, 0.0f);
        }
        up_0.b(this.x, f6);
        up_0.b(this.s, f6);
        up_0.b(this.y, f6);
        up_0.b(this.w, f6);
        up_0.b(this.z, f6);
        GlStateManagerInvoker.popMatrix();
    }
}


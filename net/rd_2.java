/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MathInvoker;
import deobf.Entity;
import net.MathHelper;
import net.a5Y;
import net.q1_0;
import net.up_0;

/*
 * Renamed from net.rd
 */
public class rd_2
extends q1_0 {
    public a5Y q;
    public a5Y j;
    public a5Y r;
    public a5Y n;
    public a5Y o;
    public a5Y k = new a5Y(this, 32, 4);
    public a5Y l;
    public a5Y m;
    public a5Y p;
    public a5Y h;
    public a5Y i;

    @Override
    public void a(Entity entity, float f, float f2, float f3, float f4, float f5, float f6) {
        this.a(f, f2, f3, f4, f5, f6, entity);
        up_0.b(this.k, f6);
        up_0.b(this.q, f6);
        up_0.b(this.p, f6);
        up_0.b(this.i, f6);
        up_0.b(this.r, f6);
        up_0.b(this.j, f6);
        up_0.b(this.h, f6);
        up_0.b(this.m, f6);
        up_0.b(this.o, f6);
        up_0.b(this.n, f6);
        up_0.b(this.l, f6);
    }

    @Override
    public void a(float f, float f2, float f3, float f4, float f5, float f6, Entity entity) {
        this.k.m = f4 / 57.295776f;
        this.k.t = f5 / 57.295776f;
        this.i.n = -0.7853982f;
        this.r.n = 0.7853982f;
        this.j.n = -0.58119464f;
        this.h.n = 0.58119464f;
        this.m.n = -0.58119464f;
        this.o.n = 0.58119464f;
        this.n.n = -0.7853982f;
        this.l.n = 0.7853982f;
        this.i.m = 0.7853982f;
        this.r.m = -0.7853982f;
        this.j.m = 0.3926991f;
        this.h.m = -0.3926991f;
        this.m.m = -0.3926991f;
        this.o.m = 0.3926991f;
        this.n.m = -0.7853982f;
        this.l.m = 0.7853982f;
        float f7 = -(MathHelper.cos(f * 0.6662f * 2.0f + 0.0f) * 0.4f) * f2;
        float f8 = -(MathHelper.cos(f * 0.6662f * 2.0f + (float)Math.PI) * 0.4f) * f2;
        float f9 = -(MathHelper.cos(f * 0.6662f * 2.0f + 1.5707964f) * 0.4f) * f2;
        float f10 = -(MathHelper.cos(f * 0.6662f * 2.0f + 4.712389f) * 0.4f) * f2;
        float f11 = MathInvoker.b(MathHelper.sin(f * 0.6662f + 0.0f) * 0.4f) * f2;
        float f12 = MathInvoker.b(MathHelper.sin(f * 0.6662f + (float)Math.PI) * 0.4f) * f2;
        float f13 = MathInvoker.b(MathHelper.sin(f * 0.6662f + 1.5707964f) * 0.4f) * f2;
        float f14 = MathInvoker.b(MathHelper.sin(f * 0.6662f + 4.712389f) * 0.4f) * f2;
        this.i.m += f7;
        this.r.m += -f7;
        this.j.m += f8;
        this.h.m += -f8;
        this.m.m += f9;
        this.o.m += -f9;
        this.n.m += f10;
        this.l.m += -f10;
        this.i.n += f11;
        this.r.n += -f11;
        this.j.n += f12;
        this.h.n += -f12;
        this.m.n += f13;
        this.o.n += -f13;
        this.n.n += f14;
        this.l.n += -f14;
    }

    public rd_2() {
        up_0.a(this.k, -4.0f, -4.0f, -8.0f, 8, 8, 8, 0.0f);
        up_0.a(this.k, 0.0f, 15.0f, -3.0f);
        this.q = new a5Y(this, 0, 0);
        up_0.a(this.q, -3.0f, -3.0f, -3.0f, 6, 6, 6, 0.0f);
        up_0.a(this.q, 0.0f, 15.0f, 0.0f);
        this.p = new a5Y(this, 0, 12);
        up_0.a(this.p, -5.0f, -4.0f, -6.0f, 10, 8, 12, 0.0f);
        up_0.a(this.p, 0.0f, 15.0f, 9.0f);
        this.i = new a5Y(this, 18, 0);
        up_0.a(this.i, -15.0f, -1.0f, -1.0f, 16, 2, 2, 0.0f);
        up_0.a(this.i, -4.0f, 15.0f, 2.0f);
        this.r = new a5Y(this, 18, 0);
        up_0.a(this.r, -1.0f, -1.0f, -1.0f, 16, 2, 2, 0.0f);
        up_0.a(this.r, 4.0f, 15.0f, 2.0f);
        this.j = new a5Y(this, 18, 0);
        up_0.a(this.j, -15.0f, -1.0f, -1.0f, 16, 2, 2, 0.0f);
        up_0.a(this.j, -4.0f, 15.0f, 1.0f);
        this.h = new a5Y(this, 18, 0);
        up_0.a(this.h, -1.0f, -1.0f, -1.0f, 16, 2, 2, 0.0f);
        up_0.a(this.h, 4.0f, 15.0f, 1.0f);
        this.m = new a5Y(this, 18, 0);
        up_0.a(this.m, -15.0f, -1.0f, -1.0f, 16, 2, 2, 0.0f);
        up_0.a(this.m, -4.0f, 15.0f, 0.0f);
        this.o = new a5Y(this, 18, 0);
        up_0.a(this.o, -1.0f, -1.0f, -1.0f, 16, 2, 2, 0.0f);
        up_0.a(this.o, 4.0f, 15.0f, 0.0f);
        this.n = new a5Y(this, 18, 0);
        up_0.a(this.n, -15.0f, -1.0f, -1.0f, 16, 2, 2, 0.0f);
        up_0.a(this.n, -4.0f, 15.0f, -1.0f);
        this.l = new a5Y(this, 18, 0);
        up_0.a(this.l, -1.0f, -1.0f, -1.0f, 16, 2, 2, 0.0f);
        up_0.a(this.l, 4.0f, 15.0f, -1.0f);
    }
}


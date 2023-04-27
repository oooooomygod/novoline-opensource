/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import deobf.Entity;
import net.C3;
import net.a5Y;
import net.awl_1;
import net.ayj_0;
import net.ol_2;
import net.rp_2;
import net.up_0;

/*
 * Renamed from net.rW
 */
public class rw_1
extends rp_2 {
    public a5Y s;
    public a5Y u;
    public a5Y t;
    public a5Y v;

    @Override
    public void a(float f, float f2, float f3, float f4, float f5, float f6, Entity entity) {
        super.a(f, f2, f3, f4, f5, f6, entity);
        if (entity instanceof ol_2) {
            ol_2 ol_22 = (ol_2)entity;
            this.j.p = awl_1.h(ol_22);
            this.h.p = awl_1.h(ol_22);
            this.v.p = !awl_1.c(ol_22);
            up_0.a(this.o, 1.9f, 12.0f, 0.0f);
            up_0.a(this.l, -1.9f, 12.0f, 0.0f);
            this.t.t = (float)Math.PI / 180 * C3.a(awl_1.g(ol_22));
            this.t.m = (float)Math.PI / 180 * C3.d(awl_1.g(ol_22));
            this.t.n = (float)Math.PI / 180 * C3.b(awl_1.g(ol_22));
            this.s.t = (float)Math.PI / 180 * C3.a(awl_1.g(ol_22));
            this.s.m = (float)Math.PI / 180 * C3.d(awl_1.g(ol_22));
            this.s.n = (float)Math.PI / 180 * C3.b(awl_1.g(ol_22));
            this.u.t = (float)Math.PI / 180 * C3.a(awl_1.g(ol_22));
            this.u.m = (float)Math.PI / 180 * C3.d(awl_1.g(ol_22));
            this.u.n = (float)Math.PI / 180 * C3.b(awl_1.g(ol_22));
            float cfr_ignored_0 = (C3.a(awl_1.f(ol_22)) + C3.a(awl_1.a(ol_22))) / 2.0f;
            float cfr_ignored_1 = (C3.d(awl_1.f(ol_22)) + C3.d(awl_1.a(ol_22))) / 2.0f;
            float cfr_ignored_2 = (C3.b(awl_1.f(ol_22)) + C3.b(awl_1.a(ol_22))) / 2.0f;
            this.v.t = 0.0f;
            this.v.m = (float)Math.PI / 180 * -entity.rotationYaw;
            this.v.n = 0.0f;
        }
    }

    public rw_1(float f) {
        super(f, 64, 64);
        this.r = new a5Y(this, 0, 0);
        up_0.a(this.r, -1.0f, -7.0f, -1.0f, 2, 7, 2, f);
        up_0.a(this.r, 0.0f, 0.0f, 0.0f);
        this.q = new a5Y(this, 0, 26);
        up_0.a(this.q, -6.0f, 0.0f, -1.5f, 12, 3, 3, f);
        up_0.a(this.q, 0.0f, 0.0f, 0.0f);
        this.h = new a5Y(this, 24, 0);
        up_0.a(this.h, -2.0f, -2.0f, -1.0f, 2, 12, 2, f);
        up_0.a(this.h, -5.0f, 2.0f, 0.0f);
        this.j = new a5Y(this, 32, 16);
        this.j.x = true;
        up_0.a(this.j, 0.0f, -2.0f, -1.0f, 2, 12, 2, f);
        up_0.a(this.j, 5.0f, 2.0f, 0.0f);
        this.l = new a5Y(this, 8, 0);
        up_0.a(this.l, -1.0f, 0.0f, -1.0f, 2, 11, 2, f);
        up_0.a(this.l, -1.9f, 12.0f, 0.0f);
        this.o = new a5Y(this, 40, 16);
        this.o.x = true;
        up_0.a(this.o, -1.0f, 0.0f, -1.0f, 2, 11, 2, f);
        up_0.a(this.o, 1.9f, 12.0f, 0.0f);
        this.t = new a5Y(this, 16, 0);
        up_0.a(this.t, -3.0f, 3.0f, -1.0f, 2, 7, 2, f);
        up_0.a(this.t, 0.0f, 0.0f, 0.0f);
        this.t.p = true;
        this.s = new a5Y(this, 48, 16);
        up_0.a(this.s, 1.0f, 3.0f, -1.0f, 2, 7, 2, f);
        up_0.a(this.s, 0.0f, 0.0f, 0.0f);
        this.u = new a5Y(this, 0, 48);
        up_0.a(this.u, -4.0f, 10.0f, -1.0f, 8, 2, 2, f);
        up_0.a(this.u, 0.0f, 0.0f, 0.0f);
        this.v = new a5Y(this, 0, 32);
        up_0.a(this.v, -6.0f, 11.0f, -6.0f, 12, 1, 12, f);
        up_0.a(this.v, 0.0f, 12.0f, 0.0f);
    }

    public rw_1() {
        this(0.0f);
    }

    @Override
    public void a(float f) {
        boolean bl = this.h.p;
        this.h.p = true;
        super.a(f);
        this.h.p = bl;
    }

    @Override
    public void a(Entity entity, float f, float f2, float f3, float f4, float f5, float f6) {
        super.a(entity, f, f2, f3, f4, f5, f6);
        GlStateManagerInvoker.pushMatrix();
        if (this.g) {
            GlStateManagerInvoker.c(0.5f, 0.5f, 0.5f);
            GlStateManagerInvoker.translate(0.0f, 24.0f * f6, 0.0f);
        } else if (ayj_0.l(entity)) {
            GlStateManagerInvoker.translate(0.0f, 0.2f, 0.0f);
        }
        up_0.b(this.t, f6);
        up_0.b(this.s, f6);
        up_0.b(this.u, f6);
        up_0.b(this.v, f6);
        GlStateManagerInvoker.popMatrix();
    }
}


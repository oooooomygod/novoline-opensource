/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import deobf.Entity;
import net.MathHelper;
import net.a5Y;
import net.q1_0;
import net.up_0;

/*
 * Renamed from net.rn
 */
public class rn_2
extends q1_0 {
    public a5Y j;
    public a5Y m = new a5Y(this, 0, 0);
    public a5Y k;
    public a5Y i;
    public a5Y n;
    public a5Y o;
    public a5Y l;
    public a5Y h;

    @Override
    public void a(Entity entity, float f, float f2, float f3, float f4, float f5, float f6) {
        this.a(f, f2, f3, f4, f5, f6, entity);
        if (this.g) {
            GlStateManagerInvoker.pushMatrix();
            GlStateManagerInvoker.translate(0.0f, 5.0f * f6, 2.0f * f6);
            up_0.b(this.m, f6);
            up_0.b(this.j, f6);
            up_0.b(this.i, f6);
            GlStateManagerInvoker.popMatrix();
            GlStateManagerInvoker.pushMatrix();
            GlStateManagerInvoker.c(0.5f, 0.5f, 0.5f);
            GlStateManagerInvoker.translate(0.0f, 24.0f * f6, 0.0f);
            up_0.b(this.l, f6);
            up_0.b(this.n, f6);
            up_0.b(this.h, f6);
            up_0.b(this.o, f6);
            up_0.b(this.k, f6);
            GlStateManagerInvoker.popMatrix();
        } else {
            up_0.b(this.m, f6);
            up_0.b(this.j, f6);
            up_0.b(this.i, f6);
            up_0.b(this.l, f6);
            up_0.b(this.n, f6);
            up_0.b(this.h, f6);
            up_0.b(this.o, f6);
            up_0.b(this.k, f6);
        }
    }

    public rn_2() {
        up_0.a(this.m, -2.0f, -6.0f, -2.0f, 4, 6, 3, 0.0f);
        up_0.a(this.m, 0.0f, 15.0f, -4.0f);
        this.j = new a5Y(this, 14, 0);
        up_0.a(this.j, -2.0f, -4.0f, -4.0f, 4, 2, 2, 0.0f);
        up_0.a(this.j, 0.0f, 15.0f, -4.0f);
        this.i = new a5Y(this, 14, 4);
        up_0.a(this.i, -1.0f, -2.0f, -3.0f, 2, 2, 2, 0.0f);
        up_0.a(this.i, 0.0f, 15.0f, -4.0f);
        this.l = new a5Y(this, 0, 9);
        up_0.a(this.l, -3.0f, -4.0f, -3.0f, 6, 8, 6, 0.0f);
        up_0.a(this.l, 0.0f, 16.0f, 0.0f);
        this.n = new a5Y(this, 26, 0);
        up_0.a(this.n, -1.0f, 0.0f, -3.0f, 3, 5, 3);
        up_0.a(this.n, -2.0f, 19.0f, 1.0f);
        this.h = new a5Y(this, 26, 0);
        up_0.a(this.h, -1.0f, 0.0f, -3.0f, 3, 5, 3);
        up_0.a(this.h, 1.0f, 19.0f, 1.0f);
        this.o = new a5Y(this, 24, 13);
        up_0.a(this.o, 0.0f, 0.0f, -3.0f, 1, 4, 6);
        up_0.a(this.o, -4.0f, 13.0f, 0.0f);
        this.k = new a5Y(this, 24, 13);
        up_0.a(this.k, -1.0f, 0.0f, -3.0f, 1, 4, 6);
        up_0.a(this.k, 4.0f, 13.0f, 0.0f);
    }

    @Override
    public void a(float f, float f2, float f3, float f4, float f5, float f6, Entity entity) {
        this.m.t = f5 / 57.295776f;
        this.m.m = f4 / 57.295776f;
        this.j.t = this.m.t;
        this.j.m = this.m.m;
        this.i.t = this.m.t;
        this.i.m = this.m.m;
        this.l.t = 1.5707964f;
        this.n.t = MathHelper.cos(f * 0.6662f) * 1.4f * f2;
        this.h.t = MathHelper.cos(f * 0.6662f + (float)Math.PI) * 1.4f * f2;
        this.o.n = f3;
        this.k.n = -f3;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import net.MathHelper;
import net.a5Y;
import net.aia_0;
import net.n1_0;
import net.q1_0;
import net.up_0;

/*
 * Renamed from net.rl
 */
public class rl_2
extends q1_0 {
    private a5Y m;
    private a5Y k;
    private a5Y l;
    private a5Y h;
    private a5Y j;
    private a5Y i;

    public rl_2() {
        this.b = 64;
        this.e = 64;
        this.m = new a5Y(this, 0, 0);
        up_0.a(this.m, -3.0f, -3.0f, -3.0f, 6, 6, 6);
        a5Y a5Y2 = new a5Y(this, 24, 0);
        up_0.a(a5Y2, -4.0f, -6.0f, -2.0f, 3, 4, 1);
        up_0.a(this.m, a5Y2);
        a5Y a5Y3 = new a5Y(this, 24, 0);
        a5Y3.x = true;
        up_0.a(a5Y3, 1.0f, -6.0f, -2.0f, 3, 4, 1);
        up_0.a(this.m, a5Y3);
        this.i = new a5Y(this, 0, 16);
        up_0.a(this.i, -3.0f, 4.0f, -3.0f, 6, 12, 6);
        up_0.a(up_0.b(this.i, 0, 34), -5.0f, 16.0f, 0.0f, 10, 6, 1);
        this.l = new a5Y(this, 42, 0);
        up_0.a(this.l, -12.0f, 1.0f, 1.5f, 10, 16, 1);
        this.h = new a5Y(this, 24, 16);
        up_0.a(this.h, -12.0f, 1.0f, 1.5f);
        up_0.a(this.h, -8.0f, 1.0f, 0.0f, 8, 12, 1);
        this.k = new a5Y(this, 42, 0);
        this.k.x = true;
        up_0.a(this.k, 2.0f, 1.0f, 1.5f, 10, 16, 1);
        this.j = new a5Y(this, 24, 16);
        this.j.x = true;
        up_0.a(this.j, 12.0f, 1.0f, 1.5f);
        up_0.a(this.j, 0.0f, 1.0f, 0.0f, 8, 12, 1);
        up_0.a(this.i, this.l);
        up_0.a(this.i, this.k);
        up_0.a(this.l, this.h);
        up_0.a(this.k, this.j);
    }

    @Override
    public void a(Entity entity, float f, float f2, float f3, float f4, float f5, float f6) {
        this.a(f, f2, f3, f4, f5, f6, entity);
        up_0.b(this.m, f6);
        up_0.b(this.i, f6);
    }

    @Override
    public void a(float f, float f2, float f3, float f4, float f5, float f6, Entity entity) {
        if (aia_0.a((n1_0)entity)) {
            this.m.t = f5 / 57.295776f;
            this.m.m = (float)Math.PI - f4 / 57.295776f;
            this.m.n = (float)Math.PI;
            up_0.a(this.m, 0.0f, -2.0f, 0.0f);
            up_0.a(this.l, -3.0f, 0.0f, 3.0f);
            up_0.a(this.k, 3.0f, 0.0f, 3.0f);
            this.i.t = (float)Math.PI;
            this.l.t = -0.15707964f;
            this.l.m = -1.2566371f;
            this.h.m = -1.7278761f;
            this.k.t = this.l.t;
            this.k.m = -this.l.m;
            this.j.m = -this.h.m;
        } else {
            this.m.t = f5 / 57.295776f;
            this.m.m = f4 / 57.295776f;
            this.m.n = 0.0f;
            up_0.a(this.m, 0.0f, 0.0f, 0.0f);
            up_0.a(this.l, 0.0f, 0.0f, 0.0f);
            up_0.a(this.k, 0.0f, 0.0f, 0.0f);
            this.i.t = 0.7853982f + MathHelper.cos(f3 * 0.1f) * 0.15f;
            this.i.m = 0.0f;
            this.l.m = MathHelper.cos(f3 * 1.3f) * (float)Math.PI * 0.25f;
            this.k.m = -this.l.m;
            this.h.m = this.l.m * 0.5f;
            this.j.m = -this.l.m * 0.5f;
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import net.MathHelper;
import net.a5Y;
import net.q1_0;
import net.up_0;

/*
 * Renamed from net.ro
 */
public class ro_2
extends q1_0 {
    public a5Y j;
    public a5Y i;
    public a5Y n;
    public a5Y k;
    public a5Y h;
    public a5Y l;
    public a5Y m = new a5Y(this, 0, 0);

    @Override
    public void a(Entity entity, float f, float f2, float f3, float f4, float f5, float f6) {
        this.a(f, f2, f3, f4, f5, f6, entity);
        up_0.b(this.m, f6);
        up_0.b(this.n, f6);
        up_0.b(this.k, f6);
        up_0.b(this.i, f6);
        up_0.b(this.l, f6);
        up_0.b(this.h, f6);
    }

    public ro_2() {
        this(0.0f);
    }

    @Override
    public void a(float f, float f2, float f3, float f4, float f5, float f6, Entity entity) {
        this.m.m = f4 / 57.295776f;
        this.m.t = f5 / 57.295776f;
        this.k.t = MathHelper.cos(f * 0.6662f) * 1.4f * f2;
        this.i.t = MathHelper.cos(f * 0.6662f + (float)Math.PI) * 1.4f * f2;
        this.l.t = MathHelper.cos(f * 0.6662f + (float)Math.PI) * 1.4f * f2;
        this.h.t = MathHelper.cos(f * 0.6662f) * 1.4f * f2;
    }

    public ro_2(float f) {
        up_0.a(this.m, -4.0f, -8.0f, -4.0f, 8, 8, 8, f);
        up_0.a(this.m, 0.0f, 6.0f, 0.0f);
        this.j = new a5Y(this, 32, 0);
        up_0.a(this.j, -4.0f, -8.0f, -4.0f, 8, 8, 8, f + 0.5f);
        up_0.a(this.j, 0.0f, 6.0f, 0.0f);
        this.n = new a5Y(this, 16, 16);
        up_0.a(this.n, -4.0f, 0.0f, -2.0f, 8, 12, 4, f);
        up_0.a(this.n, 0.0f, 6.0f, 0.0f);
        this.k = new a5Y(this, 0, 16);
        up_0.a(this.k, -2.0f, 0.0f, -2.0f, 4, 6, 4, f);
        up_0.a(this.k, -2.0f, 18.0f, 4.0f);
        this.i = new a5Y(this, 0, 16);
        up_0.a(this.i, -2.0f, 0.0f, -2.0f, 4, 6, 4, f);
        up_0.a(this.i, 2.0f, 18.0f, 4.0f);
        this.l = new a5Y(this, 0, 16);
        up_0.a(this.l, -2.0f, 0.0f, -2.0f, 4, 6, 4, f);
        up_0.a(this.l, -2.0f, 18.0f, -4.0f);
        this.h = new a5Y(this, 0, 16);
        up_0.a(this.h, -2.0f, 0.0f, -2.0f, 4, 6, 4, f);
        up_0.a(this.h, 2.0f, 18.0f, -4.0f);
    }
}


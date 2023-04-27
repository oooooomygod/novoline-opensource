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
 * Renamed from net.rt
 */
public class rt_1
extends q1_0 {
    public a5Y j;
    public a5Y h;
    public a5Y l;
    public a5Y k = up_0.a(new a5Y(this, 0, 0), 64, 64);
    public a5Y i;

    @Override
    public void a(Entity entity, float f, float f2, float f3, float f4, float f5, float f6) {
        this.a(f, f2, f3, f4, f5, f6, entity);
        up_0.b(this.l, f6);
        up_0.b(this.i, f6);
        up_0.b(this.k, f6);
        up_0.b(this.j, f6);
        up_0.b(this.h, f6);
    }

    public rt_1() {
        up_0.a(this.k, -4.0f, -8.0f, -4.0f, 8, 8, 8, -0.5f);
        up_0.a(this.k, 0.0f, 4.0f, 0.0f);
        this.j = up_0.a(new a5Y(this, 32, 0), 64, 64);
        up_0.a(this.j, -1.0f, 0.0f, -1.0f, 12, 2, 2, -0.5f);
        up_0.a(this.j, 0.0f, 6.0f, 0.0f);
        this.h = up_0.a(new a5Y(this, 32, 0), 64, 64);
        up_0.a(this.h, -1.0f, 0.0f, -1.0f, 12, 2, 2, -0.5f);
        up_0.a(this.h, 0.0f, 6.0f, 0.0f);
        this.l = up_0.a(new a5Y(this, 0, 16), 64, 64);
        up_0.a(this.l, -5.0f, -10.0f, -5.0f, 10, 10, 10, -0.5f);
        up_0.a(this.l, 0.0f, 13.0f, 0.0f);
        this.i = up_0.a(new a5Y(this, 0, 36), 64, 64);
        up_0.a(this.i, -6.0f, -12.0f, -6.0f, 12, 12, 12, -0.5f);
        up_0.a(this.i, 0.0f, 24.0f, 0.0f);
    }

    @Override
    public void a(float f, float f2, float f3, float f4, float f5, float f6, Entity entity) {
        super.a(f, f2, f3, f4, f5, f6, entity);
        this.k.m = f4 / 57.295776f;
        this.k.t = f5 / 57.295776f;
        this.l.m = f4 / 57.295776f * 0.25f;
        float f7 = MathHelper.sin(this.l.m);
        float f8 = MathHelper.cos(this.l.m);
        this.j.n = 1.0f;
        this.h.n = -1.0f;
        this.j.m = 0.0f + this.l.m;
        this.h.m = (float)Math.PI + this.l.m;
        this.j.g = f8 * 5.0f;
        this.j.z = -f7 * 5.0f;
        this.h.g = -f8 * 5.0f;
        this.h.z = f7 * 5.0f;
    }
}


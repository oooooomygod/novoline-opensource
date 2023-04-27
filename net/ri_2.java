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
 * Renamed from net.ri
 */
public class ri_2
extends q1_0 {
    public a5Y m;
    public a5Y j;
    public a5Y h;
    public a5Y l;
    public a5Y k;
    public a5Y i;

    @Override
    public void a(float f, float f2, float f3, float f4, float f5, float f6, Entity entity) {
        this.k.m = f4 / 57.295776f;
        this.k.t = f5 / 57.295776f;
        this.j.o = 3.0f;
        this.j.z = -1.0f;
        this.j.t = -0.75f;
        this.l.t = MathHelper.cos(f * 0.6662f) * 1.4f * f2 * 0.5f;
        this.i.t = MathHelper.cos(f * 0.6662f + (float)Math.PI) * 1.4f * f2 * 0.5f;
        this.l.m = 0.0f;
        this.i.m = 0.0f;
    }

    @Override
    public void a(Entity entity, float f, float f2, float f3, float f4, float f5, float f6) {
        this.a(f, f2, f3, f4, f5, f6, entity);
        up_0.b(this.k, f6);
        up_0.b(this.m, f6);
        up_0.b(this.l, f6);
        up_0.b(this.i, f6);
        up_0.b(this.j, f6);
    }

    public ri_2(float f, float f2, int n, int n2) {
        this.k = up_0.a(new a5Y(this), n, n2);
        up_0.a(this.k, 0.0f, 0.0f + f2, 0.0f);
        up_0.a(up_0.b(this.k, 0, 0), -4.0f, -10.0f, -4.0f, 8, 10, 8, f);
        this.h = up_0.a(new a5Y(this), n, n2);
        up_0.a(this.h, 0.0f, f2 - 2.0f, 0.0f);
        up_0.a(up_0.b(this.h, 24, 0), -1.0f, -1.0f, -6.0f, 2, 4, 2, f);
        up_0.a(this.k, this.h);
        this.m = up_0.a(new a5Y(this), n, n2);
        up_0.a(this.m, 0.0f, 0.0f + f2, 0.0f);
        up_0.a(up_0.b(this.m, 16, 20), -4.0f, 0.0f, -3.0f, 8, 12, 6, f);
        up_0.a(up_0.b(this.m, 0, 38), -4.0f, 0.0f, -3.0f, 8, 18, 6, f + 0.5f);
        this.j = up_0.a(new a5Y(this), n, n2);
        up_0.a(this.j, 0.0f, 0.0f + f2 + 2.0f, 0.0f);
        up_0.a(up_0.b(this.j, 44, 22), -8.0f, -2.0f, -2.0f, 4, 8, 4, f);
        up_0.a(up_0.b(this.j, 44, 22), 4.0f, -2.0f, -2.0f, 4, 8, 4, f);
        up_0.a(up_0.b(this.j, 40, 38), -4.0f, 2.0f, -2.0f, 8, 4, 4, f);
        this.l = up_0.a(new a5Y(this, 0, 22), n, n2);
        up_0.a(this.l, -2.0f, 12.0f + f2, 0.0f);
        up_0.a(this.l, -2.0f, 0.0f, -2.0f, 4, 12, 4, f);
        this.i = up_0.a(new a5Y(this, 0, 22), n, n2);
        this.i.x = true;
        up_0.a(this.i, 2.0f, 12.0f + f2, 0.0f);
        up_0.a(this.i, -2.0f, 0.0f, -2.0f, 4, 12, 4, f);
    }

    public ri_2(float f) {
        this(f, 0.0f, 64, 64);
    }
}


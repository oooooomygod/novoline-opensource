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
 * Renamed from net.rI
 */
public class ri_1
extends q1_0 {
    public a5Y m;
    public a5Y k;
    public a5Y j;
    public a5Y h = up_0.a(up_0.b(new a5Y(this), 0, 0), -6.0f, -5.0f, 0.0f, 6, 10, 0);
    public a5Y i;
    public a5Y l;
    public a5Y n = up_0.a(up_0.b(new a5Y(this), 16, 0), 0.0f, -5.0f, 0.0f, 6, 10, 0);

    public ri_1() {
        this.l = up_0.a(up_0.b(new a5Y(this), 0, 10), 0.0f, -4.0f, -0.99f, 5, 8, 1);
        this.i = up_0.a(up_0.b(new a5Y(this), 12, 10), 0.0f, -4.0f, -0.01f, 5, 8, 1);
        this.m = up_0.a(up_0.b(new a5Y(this), 24, 10), 0.0f, -4.0f, 0.0f, 5, 8, 0);
        this.j = up_0.a(up_0.b(new a5Y(this), 24, 10), 0.0f, -4.0f, 0.0f, 5, 8, 0);
        this.k = up_0.a(up_0.b(new a5Y(this), 12, 0), -1.0f, -5.0f, 0.0f, 2, 10, 0);
        up_0.a(this.h, 0.0f, 0.0f, -1.0f);
        up_0.a(this.n, 0.0f, 0.0f, 1.0f);
        this.k.m = 1.5707964f;
    }

    @Override
    public void a(Entity entity, float f, float f2, float f3, float f4, float f5, float f6) {
        this.a(f, f2, f3, f4, f5, f6, entity);
        up_0.b(this.h, f6);
        up_0.b(this.n, f6);
        up_0.b(this.k, f6);
        up_0.b(this.l, f6);
        up_0.b(this.i, f6);
        up_0.b(this.m, f6);
        up_0.b(this.j, f6);
    }

    @Override
    public void a(float f, float f2, float f3, float f4, float f5, float f6, Entity entity) {
        float f7 = (MathHelper.sin(f * 0.02f) * 0.1f + 1.25f) * f4;
        this.h.m = (float)Math.PI + f7;
        this.n.m = -f7;
        this.l.m = f7;
        this.i.m = -f7;
        this.m.m = f7 - f7 * 2.0f * f2;
        this.j.m = f7 - f7 * 2.0f * f3;
        this.l.g = MathHelper.sin(f7);
        this.i.g = MathHelper.sin(f7);
        this.m.g = MathHelper.sin(f7);
        this.j.g = MathHelper.sin(f7);
    }
}


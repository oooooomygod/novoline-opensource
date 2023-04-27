/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MathInvoker;
import deobf.Entity;
import deobf.EntityLivingBase;
import net.a5Y;
import net.avp_0;
import net.nf_2;
import net.q1_0;
import net.up_0;

/*
 * Renamed from net.rD
 */
public class rd_1
extends q1_0 {
    public a5Y h;
    public a5Y m;
    public a5Y k;
    public a5Y i;
    public a5Y j = up_0.a(new a5Y(this), 128, 128);
    public a5Y l;

    public rd_1() {
        this(0.0f);
    }

    public rd_1(float f) {
        this(f, -7.0f);
    }

    @Override
    public void a(Entity entity, float f, float f2, float f3, float f4, float f5, float f6) {
        this.a(f, f2, f3, f4, f5, f6, entity);
        up_0.b(this.j, f6);
        up_0.b(this.i, f6);
        up_0.b(this.k, f6);
        up_0.b(this.h, f6);
        up_0.b(this.l, f6);
        up_0.b(this.m, f6);
    }

    public rd_1(float f, float f2) {
        up_0.a(this.j, 0.0f, 0.0f + f2, -2.0f);
        up_0.a(up_0.b(this.j, 0, 0), -4.0f, -12.0f, -5.5f, 8, 10, 8, f);
        up_0.a(up_0.b(this.j, 24, 0), -1.0f, -5.0f, -7.5f, 2, 4, 2, f);
        this.i = up_0.a(new a5Y(this), 128, 128);
        up_0.a(this.i, 0.0f, 0.0f + f2, 0.0f);
        up_0.a(up_0.b(this.i, 0, 40), -9.0f, -2.0f, -6.0f, 18, 12, 11, f);
        up_0.a(up_0.b(this.i, 0, 70), -4.5f, 10.0f, -3.0f, 9, 5, 6, f + 0.5f);
        this.l = up_0.a(new a5Y(this), 128, 128);
        up_0.a(this.l, 0.0f, -7.0f, 0.0f);
        up_0.a(up_0.b(this.l, 60, 21), -13.0f, -2.5f, -3.0f, 4, 30, 6, f);
        this.m = up_0.a(new a5Y(this), 128, 128);
        up_0.a(this.m, 0.0f, -7.0f, 0.0f);
        up_0.a(up_0.b(this.m, 60, 58), 9.0f, -2.5f, -3.0f, 4, 30, 6, f);
        this.k = up_0.a(new a5Y(this, 0, 22), 128, 128);
        up_0.a(this.k, -4.0f, 18.0f + f2, 0.0f);
        up_0.a(up_0.b(this.k, 37, 0), -3.5f, -3.0f, -3.0f, 6, 16, 5, f);
        this.h = up_0.a(new a5Y(this, 0, 22), 128, 128);
        this.h.x = true;
        up_0.a(up_0.b(this.h, 60, 0), 5.0f, 18.0f + f2, 0.0f);
        up_0.a(this.h, -3.5f, -3.0f, -3.0f, 6, 16, 5, f);
    }

    private float a(float f, float f2) {
        return (MathInvoker.b(f % f2 - f2 * 0.5f) - f2 * 0.25f) / (f2 * 0.25f);
    }

    @Override
    public void a(float f, float f2, float f3, float f4, float f5, float f6, Entity entity) {
        this.j.m = f4 / 57.295776f;
        this.j.t = f5 / 57.295776f;
        this.k.t = -1.5f * this.a(f, 13.0f) * f2;
        this.h.t = 1.5f * this.a(f, 13.0f) * f2;
        this.k.m = 0.0f;
        this.h.m = 0.0f;
    }

    @Override
    public void a(EntityLivingBase entityLivingBase, float f, float f2, float f3) {
        nf_2 nf_22 = (nf_2)entityLivingBase;
        int n = avp_0.e(nf_22);
        this.l.t = -2.0f + 1.5f * this.a((float)n - f3, 10.0f);
        this.m.t = -2.0f + 1.5f * this.a((float)n - f3, 10.0f);
    }
}


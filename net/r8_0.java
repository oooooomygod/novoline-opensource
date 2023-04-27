/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import net.MathHelper;
import net.a5Y;
import net.ayj_0;
import net.ri_2;
import net.up_0;

/*
 * Renamed from net.r8
 */
public class r8_0
extends ri_2 {
    private a5Y p = up_0.a(new a5Y(this), 64, 128);
    private a5Y o;
    public boolean n;

    @Override
    public void a(float f, float f2, float f3, float f4, float f5, float f6, Entity entity) {
        super.a(f, f2, f3, f4, f5, f6, entity);
        this.h.f = 0.0f;
        this.h.r = 0.0f;
        this.h.e = 0.0f;
        float f7 = 0.01f * (float)(ayj_0.B(entity) % 10);
        this.h.t = MathHelper.sin((float)entity.ticksExisted * f7) * 4.5f * (float)Math.PI / 180.0f;
        this.h.m = 0.0f;
        this.h.n = MathHelper.cos((float)entity.ticksExisted * f7) * 2.5f * (float)Math.PI / 180.0f;
        if (this.n) {
            this.h.t = -0.9f;
            this.h.f = -0.09375f;
            this.h.r = 0.1875f;
        }
    }

    public r8_0(float f) {
        super(f, 0.0f, 64, 128);
        up_0.a(this.p, 0.0f, -2.0f, 0.0f);
        up_0.a(up_0.b(this.p, 0, 0), 0.0f, 3.0f, -6.75f, 1, 1, 1, -0.25f);
        up_0.a(this.h, this.p);
        this.o = up_0.a(new a5Y(this), 64, 128);
        up_0.a(this.o, -5.0f, -10.03125f, -5.0f);
        up_0.a(up_0.b(this.o, 0, 64), 0.0f, 0.0f, 0.0f, 10, 2, 10);
        up_0.a(this.k, this.o);
        a5Y a5Y2 = up_0.a(new a5Y(this), 64, 128);
        up_0.a(a5Y2, 1.75f, -4.0f, 2.0f);
        up_0.a(up_0.b(a5Y2, 0, 76), 0.0f, 0.0f, 0.0f, 7, 4, 7);
        a5Y2.t = -0.05235988f;
        a5Y2.n = 0.02617994f;
        up_0.a(this.o, a5Y2);
        a5Y a5Y3 = up_0.a(new a5Y(this), 64, 128);
        up_0.a(a5Y3, 1.75f, -4.0f, 2.0f);
        up_0.a(up_0.b(a5Y3, 0, 87), 0.0f, 0.0f, 0.0f, 4, 4, 4);
        a5Y3.t = -0.10471976f;
        a5Y3.n = 0.05235988f;
        up_0.a(a5Y2, a5Y3);
        a5Y a5Y4 = up_0.a(new a5Y(this), 64, 128);
        up_0.a(a5Y4, 1.75f, -2.0f, 2.0f);
        up_0.a(up_0.b(a5Y4, 0, 95), 0.0f, 0.0f, 0.0f, 1, 2, 1, 0.25f);
        a5Y4.t = -0.20943952f;
        a5Y4.n = 0.10471976f;
        up_0.a(a5Y3, a5Y4);
    }
}


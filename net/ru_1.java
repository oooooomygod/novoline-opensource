/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import net.MathHelper;
import net.ry_1;

/*
 * Renamed from net.ru
 */
public class ru_1
extends ry_1 {
    @Override
    public void a(float f, float f2, float f3, float f4, float f5, float f6, Entity entity) {
        super.a(f, f2, f3, f4, f5, f6, entity);
        float f7 = MathHelper.sin(this.f * (float)Math.PI);
        float f8 = MathHelper.sin((1.0f - (1.0f - this.f) * (1.0f - this.f)) * (float)Math.PI);
        this.h.n = 0.0f;
        this.j.n = 0.0f;
        this.h.m = -(0.1f - f7 * 0.6f);
        this.j.m = 0.1f - f7 * 0.6f;
        this.h.t = -1.5707964f;
        this.j.t = -1.5707964f;
        this.h.t -= f7 * 1.2f - f8 * 0.4f;
        this.j.t -= f7 * 1.2f - f8 * 0.4f;
        this.h.n += MathHelper.cos(f3 * 0.09f) * 0.05f + 0.05f;
        this.j.n -= MathHelper.cos(f3 * 0.09f) * 0.05f + 0.05f;
        this.h.t += MathHelper.sin(f3 * 0.067f) * 0.05f;
        this.j.t -= MathHelper.sin(f3 * 0.067f) * 0.05f;
    }

    public ru_1() {
        this(0.0f, false);
    }

    protected ru_1(float f, float f2, int n, int n2) {
        super(f, f2, n, n2);
    }

    public ru_1(float f, boolean bl) {
        super(f, 0.0f, 64, 32);
    }
}


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
 * Renamed from net.r7
 */
public class r7_0
extends q1_0 {
    private a5Y[] h = new a5Y[12];
    private a5Y i;

    @Override
    public void a(float f, float f2, float f3, float f4, float f5, float f6, Entity entity) {
        float f7 = f3 * (float)Math.PI * -0.1f;
        int n = 0;
        while (true) {
            this.h[n].o = -2.0f + MathHelper.cos(((float)(n * 2) + f3) * 0.25f);
            this.h[n].g = MathHelper.cos(f7) * 9.0f;
            this.h[n].z = MathHelper.sin(f7) * 9.0f;
            f7 += 1.0f;
            ++n;
        }
    }

    public r7_0() {
        for (int i = 0; i < this.h.length; ++i) {
            this.h[i] = new a5Y(this, 0, 16);
            up_0.a(this.h[i], 0.0f, 0.0f, 0.0f, 2, 8, 2);
        }
        this.i = new a5Y(this, 0, 0);
        up_0.a(this.i, -4.0f, -4.0f, -4.0f, 8, 8, 8);
    }

    @Override
    public void a(Entity entity, float f, float f2, float f3, float f4, float f5, float f6) {
        this.a(f, f2, f3, f4, f5, f6, entity);
        up_0.b(this.i, f6);
        for (a5Y a5Y2 : this.h) {
            up_0.b(a5Y2, f6);
        }
    }
}


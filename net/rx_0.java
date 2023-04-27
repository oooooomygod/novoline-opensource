/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import deobf.EntityLivingBase;
import net.MathHelper;
import net.a5Y;
import net.hd_0;
import net.nz_1;
import net.q1_0;
import net.up_0;

/*
 * Renamed from net.rX
 */
public class rx_0
extends q1_0 {
    private a5Y[] h;
    private a5Y[] i;

    @Override
    public void a(float f, float f2, float f3, float f4, float f5, float f6, Entity entity) {
        float f7 = MathHelper.cos(f3 * 0.1f);
        this.i[1].t = (0.065f + 0.05f * f7) * (float)Math.PI;
        up_0.a(this.i[2], -2.0f, 6.9f + MathHelper.cos(this.i[1].t) * 10.0f, -0.5f + MathHelper.sin(this.i[1].t) * 10.0f);
        this.i[2].t = (0.265f + 0.1f * f7) * (float)Math.PI;
        this.h[0].m = f4 / 57.295776f;
        this.h[0].t = f5 / 57.295776f;
    }

    public rx_0(float f) {
        this.b = 64;
        this.e = 64;
        this.i = new a5Y[3];
        this.i[0] = new a5Y(this, 0, 16);
        up_0.a(this.i[0], -10.0f, 3.9f, -0.5f, 20, 3, 3, f);
        this.i[1] = up_0.a(new a5Y(this), this.b, this.e);
        up_0.a(this.i[1], -2.0f, 6.9f, -0.5f);
        up_0.a(up_0.b(this.i[1], 0, 22), 0.0f, 0.0f, 0.0f, 3, 10, 3, f);
        up_0.a(up_0.b(this.i[1], 24, 22), -4.0f, 1.5f, 0.5f, 11, 2, 2, f);
        up_0.a(up_0.b(this.i[1], 24, 22), -4.0f, 4.0f, 0.5f, 11, 2, 2, f);
        up_0.a(up_0.b(this.i[1], 24, 22), -4.0f, 6.5f, 0.5f, 11, 2, 2, f);
        this.i[2] = new a5Y(this, 12, 22);
        up_0.a(this.i[2], 0.0f, 0.0f, 0.0f, 3, 6, 3, f);
        this.h = new a5Y[3];
        this.h[0] = new a5Y(this, 0, 0);
        up_0.a(this.h[0], -4.0f, -4.0f, -4.0f, 8, 8, 8, f);
        this.h[1] = new a5Y(this, 32, 0);
        up_0.a(this.h[1], -4.0f, -4.0f, -4.0f, 6, 6, 6, f);
        this.h[1].g = -8.0f;
        this.h[1].o = 4.0f;
        this.h[2] = new a5Y(this, 32, 0);
        up_0.a(this.h[2], -4.0f, -4.0f, -4.0f, 6, 6, 6, f);
        this.h[2].g = 10.0f;
        this.h[2].o = 4.0f;
    }

    @Override
    public void a(EntityLivingBase entityLivingBase, float f, float f2, float f3) {
        nz_1 nz_12 = (nz_1)entityLivingBase;
        int n = 1;
        while (true) {
            this.h[n].m = (hd_0.a(nz_12, n - 1) - entityLivingBase.aD) / 57.295776f;
            this.h[n].t = hd_0.b(nz_12, n - 1) / 57.295776f;
            ++n;
        }
    }

    @Override
    public void a(Entity entity, float f, float f2, float f3, float f4, float f5, float f6) {
        this.a(f, f2, f3, f4, f5, f6, entity);
        for (a5Y a5Y2 : this.h) {
            up_0.b(a5Y2, f6);
        }
        for (a5Y a5Y2 : this.i) {
            up_0.b(a5Y2, f6);
        }
    }
}


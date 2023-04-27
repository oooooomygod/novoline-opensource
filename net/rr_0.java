/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import deobf.EntityLivingBase;
import net.a5Y;
import net.nk_1;
import net.q1_0;
import net.up_0;

/*
 * Renamed from net.rR
 */
public class rr_0
extends q1_0 {
    a5Y i;
    a5Y[] h = new a5Y[8];

    @Override
    public void a(EntityLivingBase entityLivingBase, float f, float f2, float f3) {
        nk_1 nk_12 = (nk_1)entityLivingBase;
        float f4 = nk_12.bE + (nk_12.bC - nk_12.bE) * f3;
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        for (int i = 0; i < this.h.length; ++i) {
            this.h[i].o = (float)(-(4 - i)) * f4 * 1.7f;
        }
    }

    public rr_0() {
        for (int i = 0; i < this.h.length; ++i) {
            int n = 0;
            int n2 = i;
            this.h[i] = new a5Y(this, n, n2);
            up_0.a(this.h[i], -4.0f, 16 + i, -4.0f, 8, 1, 8);
        }
        this.i = new a5Y(this, 0, 16);
        up_0.a(this.i, -2.0f, 18.0f, -2.0f, 4, 4, 4);
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


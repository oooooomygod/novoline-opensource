/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import net.a5Y;
import net.q1_0;
import net.up_0;

/*
 * Renamed from net.rQ
 */
public class rq_1
extends q1_0 {
    public a5Y[] h = new a5Y[5];

    public rq_1() {
        this.h[0] = new a5Y(this, 0, 8);
        this.h[1] = new a5Y(this, 0, 0);
        this.h[2] = new a5Y(this, 0, 0);
        this.h[3] = new a5Y(this, 0, 0);
        this.h[4] = new a5Y(this, 0, 0);
        up_0.a(this.h[0], -12.0f, -8.0f, -3.0f, 24, 16, 4, 0.0f);
        up_0.a(this.h[0], 0.0f, 4.0f, 0.0f);
        up_0.a(this.h[1], -10.0f, -7.0f, -1.0f, 20, 6, 2, 0.0f);
        up_0.a(this.h[1], -11.0f, 4.0f, 0.0f);
        up_0.a(this.h[2], -10.0f, -7.0f, -1.0f, 20, 6, 2, 0.0f);
        up_0.a(this.h[2], 11.0f, 4.0f, 0.0f);
        up_0.a(this.h[3], -10.0f, -7.0f, -1.0f, 20, 6, 2, 0.0f);
        up_0.a(this.h[3], 0.0f, 4.0f, -9.0f);
        up_0.a(this.h[4], -10.0f, -7.0f, -1.0f, 20, 6, 2, 0.0f);
        up_0.a(this.h[4], 0.0f, 4.0f, 9.0f);
        this.h[0].t = 1.5707964f;
        this.h[1].m = 4.712389f;
        this.h[2].m = 1.5707964f;
        this.h[3].m = (float)Math.PI;
    }

    @Override
    public void a(Entity entity, float f, float f2, float f3, float f4, float f5, float f6) {
        int n = 0;
        while (true) {
            up_0.b(this.h[n], f6);
            ++n;
        }
    }
}


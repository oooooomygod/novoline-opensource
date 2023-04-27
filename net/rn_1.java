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
 * Renamed from net.rN
 */
public class rn_1
extends q1_0 {
    a5Y[] i = new a5Y[8];
    a5Y h = new a5Y(this, 0, 0);

    public rn_1() {
        up_0.a(this.h, -6.0f, -8.0f, -6.0f, 12, 16, 12);
        this.h.o += 8.0f;
        for (int i = 0; i < this.i.length; ++i) {
            this.i[i] = new a5Y(this, 48, 0);
            double d = (double)i * Math.PI * 2.0 / (double)this.i.length;
            float f = MathHelper.b(d) * 5.0f;
            float f2 = MathHelper.h(d) * 5.0f;
            up_0.a(this.i[i], -1.0f, 0.0f, -1.0f, 2, 18, 2);
            this.i[i].g = f;
            this.i[i].z = f2;
            this.i[i].o = 15.0f;
            d = (double)i * Math.PI * -2.0 / (double)this.i.length + 1.5707963267948966;
            this.i[i].m = (float)d;
        }
    }

    @Override
    public void a(Entity entity, float f, float f2, float f3, float f4, float f5, float f6) {
        this.a(f, f2, f3, f4, f5, f6, entity);
        up_0.b(this.h, f6);
        for (a5Y a5Y2 : this.i) {
            up_0.b(a5Y2, f6);
        }
    }

    @Override
    public void a(float f, float f2, float f3, float f4, float f5, float f6, Entity entity) {
        for (a5Y a5Y2 : this.i) {
            a5Y2.t = f3;
        }
    }
}


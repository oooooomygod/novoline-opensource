/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import deobf.Entity;
import java.util.Random;
import net.MathHelper;
import net.a5Y;
import net.a5_0;
import net.q1_0;
import net.up_0;

/*
 * Renamed from net.rU
 */
public class ru_0
extends q1_0 {
    a5Y i;
    a5Y[] h = new a5Y[9];

    public ru_0() {
        this.i = new a5Y(this, 0, 0);
        up_0.a(this.i, -8.0f, -8.0f, -8.0f, 16, 16, 16);
        this.i.o += 8.0f;
        Random random = new Random(1660L);
        for (int i = 0; i < this.h.length; ++i) {
            this.h[i] = new a5Y(this, 0, 0);
            float f = (((float)(i % 3) - (float)(i / 3 % 2) * 0.5f + 0.25f) / 2.0f * 2.0f - 1.0f) * 5.0f;
            float f2 = ((float)(i / 3) / 2.0f * 2.0f - 1.0f) * 5.0f;
            int n = a5_0.a(random, 7) + 8;
            up_0.a(this.h[i], -1.0f, 0.0f, -1.0f, 2, n, 2);
            this.h[i].g = f;
            this.h[i].z = f2;
            this.h[i].o = 15.0f;
        }
    }

    @Override
    public void a(float f, float f2, float f3, float f4, float f5, float f6, Entity entity) {
        for (int i = 0; i < this.h.length; ++i) {
            this.h[i].t = 0.2f * MathHelper.sin(f3 * 0.3f + (float)i) + 0.4f;
        }
    }

    @Override
    public void a(Entity entity, float f, float f2, float f3, float f4, float f5, float f6) {
        this.a(f, f2, f3, f4, f5, f6, entity);
        GlStateManagerInvoker.pushMatrix();
        GlStateManagerInvoker.translate(0.0f, 0.6f, 0.0f);
        up_0.b(this.i, f6);
        for (a5Y a5Y2 : this.h) {
            up_0.b(a5Y2, f6);
        }
        GlStateManagerInvoker.popMatrix();
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import net.MathHelper;
import net.a5Y;
import net.aBR;
import net.nx_1;
import net.q1_0;
import net.up_0;

/*
 * Renamed from net.r4
 */
public class r4_0
extends q1_0 {
    private a5Y h;
    private a5Y[] j;
    private a5Y k;
    private a5Y[] i;

    @Override
    public void a(float f, float f2, float f3, float f4, float f5, float f6, Entity entity) {
        nx_1 nx_12 = (nx_1)entity;
        float f7 = f3 - (float)nx_12.ticksExisted;
        this.k.m = f4 / 57.295776f;
        this.k.t = f5 / 57.295776f;
        float[] fArray = new float[]{1.75f, 0.25f, 0.0f, 0.0f, 0.5f, 0.5f, 0.5f, 0.5f, 1.25f, 0.75f, 0.0f, 0.0f};
        float[] fArray2 = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.25f, 1.75f, 1.25f, 0.75f, 0.0f, 0.0f, 0.0f, 0.0f};
        float[] fArray3 = new float[]{0.0f, 0.0f, 0.25f, 1.75f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.75f, 1.25f};
        float[] fArray4 = new float[]{0.0f, 0.0f, 8.0f, -8.0f, -8.0f, 8.0f, 8.0f, -8.0f, 0.0f, 0.0f, 8.0f, -8.0f};
        float[] fArray5 = new float[]{-8.0f, -8.0f, -8.0f, -8.0f, 0.0f, 0.0f, 0.0f, 0.0f, 8.0f, 8.0f, 8.0f, 8.0f};
        float[] fArray6 = new float[]{8.0f, -8.0f, 0.0f, 0.0f, -8.0f, -8.0f, 8.0f, 8.0f, 8.0f, -8.0f, 0.0f, 0.0f};
        float f8 = (1.0f - aBR.a(nx_12, f7)) * 0.55f;
        int n = 0;
        while (true) {
            this.j[n].t = (float)Math.PI * fArray[n];
            this.j[n].m = (float)Math.PI * fArray2[n];
            this.j[n].n = (float)Math.PI * fArray3[n];
            this.j[n].g = fArray4[n] * (1.0f + MathHelper.cos(f3 * 1.5f + (float)n) * 0.01f - f8);
            this.j[n].o = 16.0f + fArray5[n] * (1.0f + MathHelper.cos(f3 * 1.5f + (float)n) * 0.01f - f8);
            this.j[n].z = fArray6[n] * (1.0f + MathHelper.cos(f3 * 1.5f + (float)n) * 0.01f - f8);
            ++n;
        }
    }

    public r4_0() {
        this.b = 64;
        this.e = 64;
        this.j = new a5Y[12];
        this.k = new a5Y(this);
        up_0.a(up_0.b(this.k, 0, 0), -6.0f, 10.0f, -8.0f, 12, 12, 16);
        up_0.a(up_0.b(this.k, 0, 28), -8.0f, 10.0f, -6.0f, 2, 12, 12);
        up_0.a(up_0.b(this.k, 0, 28), 6.0f, 10.0f, -6.0f, 2, 12, 12, true);
        up_0.a(up_0.b(this.k, 16, 40), -6.0f, 8.0f, -6.0f, 12, 2, 12);
        up_0.a(up_0.b(this.k, 16, 40), -6.0f, 22.0f, -6.0f, 12, 2, 12);
        for (int i = 0; i < this.j.length; ++i) {
            this.j[i] = new a5Y(this, 0, 0);
            up_0.a(this.j[i], -1.0f, -4.5f, -1.0f, 2, 9, 2);
            up_0.a(this.k, this.j[i]);
        }
        this.h = new a5Y(this, 8, 0);
        up_0.a(this.h, -1.0f, 15.0f, 0.0f, 2, 2, 1);
        up_0.a(this.k, this.h);
        this.i = new a5Y[3];
        this.i[0] = new a5Y(this, 40, 0);
        up_0.a(this.i[0], -2.0f, 14.0f, 7.0f, 4, 4, 8);
        this.i[1] = new a5Y(this, 0, 54);
        up_0.a(this.i[1], 0.0f, 14.0f, 0.0f, 3, 3, 7);
        this.i[2] = new a5Y(this);
        up_0.a(up_0.b(this.i[2], 41, 32), 0.0f, 14.0f, 0.0f, 2, 2, 6);
        up_0.a(up_0.b(this.i[2], 25, 19), 1.0f, 10.5f, 3.0f, 1, 9, 9);
        up_0.a(this.k, this.i[0]);
        up_0.a(this.i[0], this.i[1]);
        up_0.a(this.i[1], this.i[2]);
    }

    @Override
    public void a(Entity entity, float f, float f2, float f3, float f4, float f5, float f6) {
        this.a(f, f2, f3, f4, f5, f6, entity);
        up_0.b(this.k, f6);
    }

    public int a() {
        return 54;
    }
}


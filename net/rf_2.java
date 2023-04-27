/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MathInvoker;
import deobf.Entity;
import net.MathHelper;
import net.a5Y;
import net.q1_0;
import net.up_0;

/*
 * Renamed from net.rf
 */
public class rf_2
extends q1_0 {
    private static int[][] j = new int[][]{{3, 2, 2}, {4, 3, 2}, {6, 4, 3}, {3, 3, 3}, {2, 2, 3}, {2, 1, 2}, {1, 1, 2}};
    private a5Y[] h = new a5Y[7];
    private a5Y[] i;
    private static int[][] k = new int[][]{{0, 0}, {0, 4}, {0, 9}, {0, 16}, {0, 22}, {11, 0}, {13, 4}};
    private float[] l = new float[7];

    @Override
    public void a(float f, float f2, float f3, float f4, float f5, float f6, Entity entity) {
        for (int i = 0; i < this.h.length; ++i) {
            this.h[i].m = MathHelper.cos(f3 * 0.9f + (float)i * 0.15f * (float)Math.PI) * (float)Math.PI * 0.05f * (float)(1 + MathInvoker.a(i - 2));
            this.h[i].g = MathHelper.sin(f3 * 0.9f + (float)i * 0.15f * (float)Math.PI) * (float)Math.PI * 0.2f * (float)MathInvoker.a(i - 2);
        }
        this.i[0].m = this.h[2].m;
        this.i[1].m = this.h[4].m;
        this.i[1].g = this.h[4].g;
        this.i[2].m = this.h[1].m;
        this.i[2].g = this.h[1].g;
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

    public rf_2() {
        float f = -3.5f;
        for (int i = 0; i < this.h.length; ++i) {
            this.h[i] = new a5Y(this, k[i][0], k[i][1]);
            up_0.a(this.h[i], (float)j[i][0] * -0.5f, 0.0f, (float)j[i][2] * -0.5f, j[i][0], j[i][1], j[i][2]);
            up_0.a(this.h[i], 0.0f, 24 - j[i][1], f);
            this.l[i] = f;
            if (i >= this.h.length - 1) continue;
            f += (float)(j[i][2] + j[i + 1][2]) * 0.5f;
        }
        this.i = new a5Y[3];
        this.i[0] = new a5Y(this, 20, 0);
        up_0.a(this.i[0], -5.0f, 0.0f, (float)j[2][2] * -0.5f, 10, 8, j[2][2]);
        up_0.a(this.i[0], 0.0f, 16.0f, this.l[2]);
        this.i[1] = new a5Y(this, 20, 11);
        up_0.a(this.i[1], -3.0f, 0.0f, (float)j[4][2] * -0.5f, 6, 4, j[4][2]);
        up_0.a(this.i[1], 0.0f, 20.0f, this.l[4]);
        this.i[2] = new a5Y(this, 20, 18);
        up_0.a(this.i[2], -3.0f, 0.0f, (float)j[4][2] * -0.5f, 6, 5, j[1][2]);
        up_0.a(this.i[2], 0.0f, 19.0f, this.l[1]);
    }
}


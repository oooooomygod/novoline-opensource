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
 * Renamed from net.rL
 */
public class rl_1
extends q1_0 {
    private static int h;
    private static int[][] k;
    private static int[][] j;
    private a5Y[] i = new a5Y[h];

    static {
        k = new int[][]{{4, 3, 2}, {6, 4, 5}, {3, 3, 1}, {1, 2, 1}};
        j = new int[][]{{0, 0}, {0, 5}, {0, 14}, {0, 18}};
        h = k.length;
    }

    public rl_1() {
        float f = -3.5f;
        for (int i = 0; i < this.i.length; ++i) {
            this.i[i] = new a5Y(this, j[i][0], j[i][1]);
            up_0.a(this.i[i], (float)k[i][0] * -0.5f, 0.0f, (float)k[i][2] * -0.5f, k[i][0], k[i][1], k[i][2]);
            up_0.a(this.i[i], 0.0f, 24 - k[i][1], f);
            if (i >= this.i.length - 1) continue;
            f += (float)(k[i][2] + k[i + 1][2]) * 0.5f;
        }
    }

    @Override
    public void a(float f, float f2, float f3, float f4, float f5, float f6, Entity entity) {
        for (int i = 0; i < this.i.length; ++i) {
            this.i[i].m = MathHelper.cos(f3 * 0.9f + (float)i * 0.15f * (float)Math.PI) * (float)Math.PI * 0.01f * (float)(1 + MathInvoker.a(i - 2));
            this.i[i].g = MathHelper.sin(f3 * 0.9f + (float)i * 0.15f * (float)Math.PI) * (float)Math.PI * 0.1f * (float)MathInvoker.a(i - 2);
        }
    }

    @Override
    public void a(Entity entity, float f, float f2, float f3, float f4, float f5, float f6) {
        this.a(f, f2, f3, f4, f5, f6, entity);
        for (a5Y a5Y2 : this.i) {
            up_0.b(a5Y2, f6);
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.WorldRendererInvoker;
import deobf.DefaultVertexFormats;
import deobf.Vec3;
import net.minecraft.renderer.WorldRenderer;

/*
 * Renamed from net.aFz
 */
public class afz_0 {
    public ei_1[] b;
    public int a;
    private boolean c;

    public void a(WorldRenderer worldRenderer, float f) {
        Vec3 vec3 = aNE.d(this.b[1].c, this.b[0].c);
        Vec3 vec32 = aNE.d(this.b[1].c, this.b[2].c);
        Vec3 vec33 = aNE.b(aNE.f(vec32, vec3));
        float f2 = (float)vec33.xCoord;
        float f3 = (float)vec33.yCoord;
        float f4 = (float)vec33.zCoord;
        if (this.c) {
            f2 = -f2;
            f3 = -f3;
            f4 = -f4;
        }
        if (ys_2.aC()) {
            WorldRendererInvoker.begin(worldRenderer, 7, id_0.e);
        } else {
            WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.u);
        }
        int n = 0;
        while (true) {
            ei_1 ei_12 = this.b[n];
            WorldRendererInvoker.pos(WorldRendererInvoker.d(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, ei_12.c.xCoord * (double)f, ei_12.c.yCoord * (double)f, ei_12.c.zCoord * (double)f), ei_12.b, ei_12.a), f2, f3, f4));
            ++n;
        }
    }

    public afz_0(ei_1[] ei_1Array) {
        this.b = ei_1Array;
        this.a = ei_1Array.length;
    }

    public void a() {
        ei_1[] ei_1Array = new ei_1[this.b.length];
        for (int i = 0; i < this.b.length; ++i) {
            ei_1Array[i] = this.b[this.b.length - i - 1];
        }
        this.b = ei_1Array;
    }

    public afz_0(ei_1[] ei_1Array, int n, int n2, int n3, int n4, float f, float f2) {
        this(ei_1Array);
        float f3 = 0.0f / f;
        float f4 = 0.0f / f2;
        ei_1Array[0] = a4A.a(ei_1Array[0], (float)n3 / f - f3, (float)n2 / f2 + f4);
        ei_1Array[1] = a4A.a(ei_1Array[1], (float)n / f + f3, (float)n2 / f2 + f4);
        ei_1Array[2] = a4A.a(ei_1Array[2], (float)n / f + f3, (float)n4 / f2 - f4);
        ei_1Array[3] = a4A.a(ei_1Array[3], (float)n3 / f - f3, (float)n4 / f2 - f4);
    }
}


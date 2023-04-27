/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.renderer.WorldRenderer;

/*
 * Renamed from net.kF
 */
public class kf_0 {
    public float g;
    public float i;
    public float e;
    public String d;
    private afz_0[] f;
    public float a;
    public float c;
    private ei_1[] h;
    public float b;

    public void a(WorldRenderer worldRenderer, float f) {
        for (int i = 0; i < this.f.length; ++i) {
            ae1_0.a(this.f[i], worldRenderer, f);
        }
    }

    public kf_0(a5Y a5Y2, int n, int n2, float f, float f2, float f3, int n3, int n4, int n5, float f4, boolean bl) {
        this.c = f;
        this.b = f2;
        this.g = f3;
        this.i = f + (float)n3;
        this.a = f2 + (float)n4;
        this.e = f3 + (float)n5;
        this.h = new ei_1[8];
        this.f = new afz_0[6];
        float f5 = f + (float)n3;
        float f6 = f2 + (float)n4;
        float f7 = f3 + (float)n5;
        f -= f4;
        f2 -= f4;
        f3 -= f4;
        f6 += f4;
        f7 += f4;
        float f8 = f5 += f4;
        f5 = f;
        f = f8;
        ei_1 ei_12 = new ei_1(f, f2, f3, 0.0f, 0.0f);
        ei_1 ei_13 = new ei_1(f5, f2, f3, 0.0f, 8.0f);
        ei_1 ei_14 = new ei_1(f5, f6, f3, 8.0f, 8.0f);
        ei_1 ei_15 = new ei_1(f, f6, f3, 8.0f, 0.0f);
        ei_1 ei_16 = new ei_1(f, f2, f7, 0.0f, 0.0f);
        ei_1 ei_17 = new ei_1(f5, f2, f7, 0.0f, 8.0f);
        ei_1 ei_18 = new ei_1(f5, f6, f7, 8.0f, 8.0f);
        ei_1 ei_19 = new ei_1(f, f6, f7, 8.0f, 0.0f);
        this.h[0] = ei_12;
        this.h[1] = ei_13;
        this.h[2] = ei_14;
        this.h[3] = ei_15;
        this.h[4] = ei_16;
        this.h[5] = ei_17;
        this.h[6] = ei_18;
        this.h[7] = ei_19;
        this.f[0] = new afz_0(new ei_1[]{ei_17, ei_13, ei_14, ei_18}, n + n5 + n3, n2 + n5, n + n5 + n3 + n5, n2 + n5 + n4, a5Y2.c, a5Y2.d);
        this.f[1] = new afz_0(new ei_1[]{ei_12, ei_16, ei_19, ei_15}, n, n2 + n5, n + n5, n2 + n5 + n4, a5Y2.c, a5Y2.d);
        this.f[2] = new afz_0(new ei_1[]{ei_17, ei_16, ei_12, ei_13}, n + n5, n2, n + n5 + n3, n2 + n5, a5Y2.c, a5Y2.d);
        this.f[3] = new afz_0(new ei_1[]{ei_14, ei_15, ei_19, ei_18}, n + n5 + n3, n2 + n5, n + n5 + n3 + n3, n2, a5Y2.c, a5Y2.d);
        this.f[4] = new afz_0(new ei_1[]{ei_13, ei_12, ei_15, ei_14}, n + n5, n2 + n5, n + n5 + n3, n2 + n5 + n4, a5Y2.c, a5Y2.d);
        this.f[5] = new afz_0(new ei_1[]{ei_16, ei_17, ei_18, ei_19}, n + n5 + n3 + n5, n2 + n5, n + n5 + n3 + n5 + n3, n2 + n5 + n4, a5Y2.c, a5Y2.d);
        for (int i = 0; i < this.f.length; ++i) {
            ae1_0.a(this.f[i]);
        }
    }

    public kf_0 a(String string) {
        this.d = string;
        return this;
    }

    public kf_0(a5Y a5Y2, int n, int n2, float f, float f2, float f3, int n3, int n4, int n5, float f4) {
        this(a5Y2, n, n2, f, f2, f3, n3, n4, n5, f4, a5Y2.x);
    }
}


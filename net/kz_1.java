/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import net.minecraft.renderer.WorldRenderer;

/*
 * Renamed from net.kZ
 */
public class kz_1
extends kf_0 {
    public float m;
    public float p;
    public float j;
    public float v;
    public float t;
    public float k;
    public static int B = 0;
    public float w;
    public static int y = 5;
    public float z;
    public static int x = 4;
    public float r;
    public float s;
    public static int n = 3;
    public float A;
    public static int q = 2;
    public ei_1[] u;
    public static int l = 1;
    public float C;
    public afz_0[] o;

    public void a(a5Y a5Y2) {
        a5K.c();
        float f = this.v + this.r;
        float f2 = this.s + this.C;
        float f3 = this.t + this.A;
        int n = (int)this.m;
        int n2 = (int)this.w;
        int n3 = (int)this.j;
        int n4 = (int)this.k;
        int n5 = (int)this.z;
        float f4 = this.v;
        float f5 = this.s;
        float f6 = this.t;
        f4 -= this.p;
        f5 -= this.p;
        f6 -= this.p;
        f += this.p;
        f2 += this.p;
        f3 += this.p;
        if (a5Y2.x) {
            float f7 = f;
            f = f4;
            f4 = f7;
        }
        ei_1 ei_12 = new ei_1(f4, f5, f6, 0.0f, 0.0f);
        ei_1 ei_13 = new ei_1(f, f5, f6, 0.0f, 8.0f);
        ei_1 ei_14 = new ei_1(f, f2, f6, 8.0f, 8.0f);
        ei_1 ei_15 = new ei_1(f4, f2, f6, 8.0f, 0.0f);
        ei_1 ei_16 = new ei_1(f4, f5, f3, 0.0f, 0.0f);
        ei_1 ei_17 = new ei_1(f, f5, f3, 0.0f, 8.0f);
        ei_1 ei_18 = new ei_1(f, f2, f3, 8.0f, 8.0f);
        ei_1 ei_19 = new ei_1(f4, f2, f3, 8.0f, 0.0f);
        this.u[0] = ei_12;
        this.u[1] = ei_13;
        this.u[2] = ei_14;
        this.u[3] = ei_15;
        this.u[4] = ei_16;
        this.u[5] = ei_17;
        this.u[6] = ei_18;
        this.u[7] = ei_19;
        this.o[0] = new afz_0(new ei_1[]{ei_17, ei_13, ei_14, ei_18}, n + n5 + n3, n2 + n5, n + n5 + n3 + n5, n2 + n5 + n4, a5Y2.c, a5Y2.d);
        this.o[1] = new afz_0(new ei_1[]{ei_12, ei_16, ei_19, ei_15}, n, n2 + n5, n + n5, n2 + n5 + n4, a5Y2.c, a5Y2.d);
        this.o[2] = new afz_0(new ei_1[]{ei_17, ei_16, ei_12, ei_13}, n + n5, n2, n + n5 + n3, n2 + n5, a5Y2.c, a5Y2.d);
        this.o[3] = new afz_0(new ei_1[]{ei_14, ei_15, ei_19, ei_18}, n + n5 + n3, n2 + n5, n + n5 + n3 + n3, n2, a5Y2.c, a5Y2.d);
        this.o[4] = new afz_0(new ei_1[]{ei_13, ei_12, ei_15, ei_14}, n + n5, n2 + n5, n + n5 + n3, n2 + n5 + n4, a5Y2.c, a5Y2.d);
        this.o[5] = new afz_0(new ei_1[]{ei_16, ei_17, ei_18, ei_19}, n + n5 + n3 + n5, n2 + n5, n + n5 + n3 + n5 + n3, n2 + n5 + n4, a5Y2.c, a5Y2.d);
        if (a5Y2.x) {
            int n6 = 0;
            if (n6 < this.o.length) {
                ae1_0.a(this.o[n6]);
                ++n6;
            }
            f4 = f;
        }
        if (ListInvoker.b() != null) {
            a5K.b(false);
        }
    }

    public kz_1(a5Y a5Y2, int n, int n2, float f, float f2, float f3, int n3, int n4, int n5, float f4) {
        super(a5Y2, n5, n5, f4, f4, f4, n5, n5, n5, f4);
        int n6;
        a5K.c();
        this.p = 0.0f;
        this.v = f;
        this.s = f2;
        this.t = f3;
        this.r = this.j = (float)n3;
        this.C = this.k = (float)n4;
        this.A = this.z = (float)n5;
        this.m = n;
        this.w = n2;
        this.u = new ei_1[8];
        this.o = new afz_0[6];
        float f5 = f + (float)n3;
        float f6 = f2 + (float)n4;
        float f7 = f3 + (float)n5;
        f -= f4;
        f2 -= f4;
        f3 -= f4;
        f5 += f4;
        f6 += f4;
        f7 += f4;
        this.p = f4;
        if (a5Y2.x) {
            float f8 = f5;
            f5 = f;
            f = f8;
        }
        ei_1 ei_12 = new ei_1(f, f2, f3, 0.0f, 0.0f);
        ei_1 ei_13 = new ei_1(f5, f2, f3, 0.0f, 8.0f);
        ei_1 ei_14 = new ei_1(f5, f6, f3, 8.0f, 8.0f);
        ei_1 ei_15 = new ei_1(f, f6, f3, 8.0f, 0.0f);
        ei_1 ei_16 = new ei_1(f, f2, f7, 0.0f, 0.0f);
        ei_1 ei_17 = new ei_1(f5, f2, f7, 0.0f, 8.0f);
        ei_1 ei_18 = new ei_1(f5, f6, f7, 8.0f, 8.0f);
        ei_1 ei_19 = new ei_1(f, f6, f7, 8.0f, 0.0f);
        this.u[0] = ei_12;
        this.u[1] = ei_13;
        this.u[2] = ei_14;
        this.u[3] = ei_15;
        this.u[4] = ei_16;
        this.u[5] = ei_17;
        this.u[6] = ei_18;
        this.u[7] = ei_19;
        this.o[0] = new afz_0(new ei_1[]{ei_17, ei_13, ei_14, ei_18}, n + n5 + n3, n2 + n5, n + n5 + n3 + n5, n2 + n5 + n4, a5Y2.c, a5Y2.d);
        this.o[1] = new afz_0(new ei_1[]{ei_12, ei_16, ei_19, ei_15}, n, n2 + n5, n + n5, n2 + n5 + n4, a5Y2.c, a5Y2.d);
        this.o[2] = new afz_0(new ei_1[]{ei_17, ei_16, ei_12, ei_13}, n + n5, n2, n + n5 + n3, n2 + n5, a5Y2.c, a5Y2.d);
        this.o[3] = new afz_0(new ei_1[]{ei_14, ei_15, ei_19, ei_18}, n + n5 + n3, n2 + n5, n + n5 + n3 + n3, n2, a5Y2.c, a5Y2.d);
        this.o[4] = new afz_0(new ei_1[]{ei_13, ei_12, ei_15, ei_14}, n + n5, n2 + n5, n + n5 + n3, n2 + n5 + n4, a5Y2.c, a5Y2.d);
        this.o[5] = new afz_0(new ei_1[]{ei_16, ei_17, ei_18, ei_19}, n + n5 + n3 + n5, n2 + n5, n + n5 + n3 + n5 + n3, n2 + n5 + n4, a5Y2.c, a5Y2.d);
        if (a5Y2.x && (n6 = 0) < this.o.length) {
            ae1_0.a(this.o[n6]);
            ++n6;
            ListInvoker.b(new ListInvoker[2]);
        }
    }

    public void b(float f, float f2, float f3) {
        this.v = f;
        this.s = f2;
        this.t = f3;
    }

    @Override
    public void a(WorldRenderer worldRenderer, float f) {
        a5K.c();
        int n = 0;
        if (n < this.o.length) {
            ae1_0.a(this.o[n], worldRenderer, f);
            ++n;
        }
    }

    public void a(a5Y a5Y2, int n, float f, float f2) {
        a5K.c();
        ea_1.a(System.out, avh_1.a);
        boolean cfr_ignored_0 = n >= 0 & n < this.o.length;
    }

    public void a(float f, float f2, float f3) {
        this.r = f;
        this.C = f2;
        this.A = f3;
    }

    public void c(float f, float f2, float f3) {
        this.v += f;
        this.s += f2;
        this.t += f3;
    }
}


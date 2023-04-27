/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import deobf.Entity;
import deobf.EntityLivingBase;
import net.CH;
import net.MathHelper;
import net.a5Y;
import net.ns_2;
import net.q1_0;
import net.up_0;
import net.yr_0;

/*
 * Renamed from net.rk
 */
public class rk_2
extends q1_0 {
    private float j;
    private a5Y s;
    private a5Y i;
    private a5Y q;
    private a5Y t;
    private a5Y r;
    private a5Y m;
    private a5Y o;
    private a5Y p;
    private a5Y k;
    private a5Y h;
    private a5Y n;
    private a5Y l;

    @Override
    public void a(EntityLivingBase entityLivingBase, float f, float f2, float f3) {
        this.j = f3;
    }

    @Override
    public void a(Entity entity, float f, float f2, float f3, float f4, float f5, float f6) {
        GlStateManagerInvoker.pushMatrix();
        ns_2 ns_22 = (ns_2)entity;
        float f7 = ns_22.bB + (ns_22.bR - ns_22.bB) * this.j;
        this.p.t = (float)((double)MathHelper.sin(f7 * (float)Math.PI * 2.0f) + 1.0) * 0.2f;
        float f8 = (float)((double)MathHelper.h(f7 * (float)Math.PI * 2.0f - 1.0f) + 1.0);
        f8 = (f8 * f8 * 1.0f + f8 * 2.0f) * 0.05f;
        GlStateManagerInvoker.translate(0.0f, f8 - 2.0f, -3.0f);
        GlStateManagerInvoker.b(f8 * 2.0f, 1.0f, 0.0f, 0.0f);
        float f9 = 0.0f;
        double[] dArray = CH.a(ns_22, 6, this.j);
        float f10 = this.a(CH.a(ns_22, 5, this.j)[0] - CH.a(ns_22, 10, this.j)[0]);
        float f11 = this.a(CH.a(ns_22, 5, this.j)[0] + (double)(f10 / 2.0f));
        float f12 = f7 * (float)Math.PI * 2.0f;
        float f13 = 20.0f;
        float f14 = -12.0f;
        int n = 0;
        while (true) {
            double[] dArray2 = CH.a(ns_22, 5 - n, this.j);
            float f15 = MathHelper.cos((float)n * 0.45f + f12) * 0.15f;
            this.s.m = this.a(dArray2[0] - dArray[0]) * ((float)Math.PI / 180) * 1.5f;
            this.s.t = f15 + (float)(dArray2[1] - dArray[1]) * ((float)Math.PI / 180) * 1.5f * 5.0f;
            this.s.n = -this.a(dArray2[0] - (double)f11) * ((float)Math.PI / 180) * 1.5f;
            this.s.o = f13;
            this.s.z = f14;
            this.s.g = f9;
            f13 = (float)((double)f13 + (double)MathHelper.sin(this.s.t) * 10.0);
            float f16 = MathHelper.cos(this.s.t);
            f14 = (float)((double)f14 - (double)(MathHelper.cos(this.s.m) * f16) * 10.0);
            f9 = (float)((double)f9 - (double)(MathHelper.sin(this.s.m) * f16) * 10.0);
            up_0.b(this.s, f6);
            ++n;
        }
    }

    public rk_2(float f) {
        this.b = 256;
        this.e = 256;
        this.a(yr_0.l, 0, 0);
        this.a(yr_0.d, -56, 88);
        this.a(yr_0.M, -56, 144);
        this.a(yr_0.G, 0, 0);
        this.a(yr_0.W, 112, 0);
        this.a(yr_0.s, 196, 0);
        this.a(yr_0.z, 112, 30);
        this.a(yr_0.Q, 112, 88);
        this.a(yr_0.F, 176, 44);
        this.a(yr_0.X, 176, 65);
        this.a(yr_0.g, 112, 104);
        this.a(yr_0.h, 112, 136);
        this.a(yr_0.c, 144, 104);
        this.a(yr_0.i, 192, 104);
        this.a(yr_0.I, 226, 138);
        this.a(yr_0.j, 220, 53);
        this.a(yr_0.a, 0, 0);
        this.a(yr_0.f, 48, 0);
        this.a(yr_0.e, 112, 0);
        this.i = new a5Y(this, yr_0.J);
        up_0.a(this.i, yr_0.R, -6.0f, -1.0f, -24.0f, 12, 5, 16);
        up_0.a(this.i, yr_0.Y, -8.0f, -8.0f, -10.0f, 16, 16, 16);
        this.i.x = true;
        up_0.a(this.i, yr_0.q, -5.0f, -12.0f, -4.0f, 2, 4, 6);
        up_0.a(this.i, yr_0.S, -5.0f, -3.0f, -22.0f, 2, 2, 4);
        this.i.x = false;
        up_0.a(this.i, yr_0.r, 3.0f, -12.0f, -4.0f, 2, 4, 6);
        up_0.a(this.i, yr_0.D, 3.0f, -3.0f, -22.0f, 2, 2, 4);
        this.p = new a5Y(this, yr_0.O);
        up_0.a(this.p, 0.0f, 4.0f, -8.0f);
        up_0.a(this.p, yr_0.t, -6.0f, 0.0f, -16.0f, 12, 4, 16);
        up_0.a(this.i, this.p);
        this.s = new a5Y(this, yr_0.x);
        up_0.a(this.s, yr_0.L, -5.0f, -5.0f, -5.0f, 10, 10, 10);
        up_0.a(this.s, yr_0.o, -1.0f, -9.0f, -3.0f, 2, 4, 6);
        this.m = new a5Y(this, yr_0.ab);
        up_0.a(this.m, 0.0f, 4.0f, 8.0f);
        up_0.a(this.m, yr_0.v, -12.0f, 0.0f, -16.0f, 24, 24, 64);
        up_0.a(this.m, yr_0.u, -1.0f, -6.0f, -10.0f, 2, 6, 12);
        up_0.a(this.m, yr_0.w, -1.0f, -6.0f, 10.0f, 2, 6, 12);
        up_0.a(this.m, yr_0.N, -1.0f, -6.0f, 30.0f, 2, 6, 12);
        this.q = new a5Y(this, yr_0.k);
        up_0.a(this.q, -12.0f, 5.0f, 2.0f);
        up_0.a(this.q, yr_0.H, -56.0f, -4.0f, -4.0f, 56, 8, 8);
        up_0.a(this.q, yr_0.P, -56.0f, 0.0f, 2.0f, 56, 0, 56);
        this.k = new a5Y(this, yr_0.aa);
        up_0.a(this.k, -56.0f, 0.0f, 0.0f);
        up_0.a(this.k, yr_0.C, -56.0f, -2.0f, -2.0f, 56, 4, 4);
        up_0.a(this.k, yr_0.E, -56.0f, 0.0f, 2.0f, 56, 0, 56);
        up_0.a(this.q, this.k);
        this.r = new a5Y(this, yr_0.K);
        up_0.a(this.r, -12.0f, 20.0f, 2.0f);
        up_0.a(this.r, yr_0.y, -4.0f, -4.0f, -4.0f, 8, 24, 8);
        this.l = new a5Y(this, yr_0.V);
        up_0.a(this.l, 0.0f, 20.0f, -1.0f);
        up_0.a(this.l, yr_0.p, -3.0f, -1.0f, -3.0f, 6, 24, 6);
        up_0.a(this.r, this.l);
        this.h = new a5Y(this, yr_0.U);
        up_0.a(this.h, 0.0f, 23.0f, 0.0f);
        up_0.a(this.h, yr_0.n, -4.0f, 0.0f, -12.0f, 8, 4, 16);
        up_0.a(this.l, this.h);
        this.n = new a5Y(this, yr_0.m);
        up_0.a(this.n, -16.0f, 16.0f, 42.0f);
        up_0.a(this.n, yr_0.B, -8.0f, -4.0f, -8.0f, 16, 32, 16);
        this.t = new a5Y(this, yr_0.Z);
        up_0.a(this.t, 0.0f, 32.0f, -4.0f);
        up_0.a(this.t, yr_0.T, -6.0f, -2.0f, 0.0f, 12, 32, 12);
        up_0.a(this.n, this.t);
        this.o = new a5Y(this, yr_0.b);
        up_0.a(this.o, 0.0f, 31.0f, 4.0f);
        up_0.a(this.o, yr_0.A, -9.0f, 0.0f, -20.0f, 18, 6, 24);
        up_0.a(this.t, this.o);
    }

    private float a(double d) {
        while (d >= 180.0) {
            d -= 360.0;
        }
        while (d < -180.0) {
            d += 360.0;
        }
        return (float)d;
    }
}


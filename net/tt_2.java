/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MathInvoker;
import cc.novoline.utils.Timer;
import deobf.TimerUtil;

/*
 * Renamed from net.tt
 */
public class tt_2 {
    public double f;
    public Timer j;
    public double k;
    public double h;
    public Timer d;
    public double l;
    public double a;
    public double c;
    public long m;
    public double i;
    public long g;
    aCT e;
    public double n;
    public int b;

    public void a(int n, boolean bl) {
        double d = abl_1.a(this.j, this.g, this.c);
        double d2 = this.l + (this.h + d) * this.f;
        TimerUtil.e();
        double d3 = this.k + (this.h + d) * this.n;
        a1V.b(d2, d3, this.a, hb_2.a(n));
        a1V.c(d2, d3, this.a, hb_2.a(n));
        this.a = this.i - abl_1.a(this.d, this.m, this.i);
    }

    public tt_2(aCT aCT2, double d, double d2, double d3) {
        this.e = aCT2;
        this.j = new Timer();
        this.d = new Timer();
        this.l = d;
        this.k = d2;
        this.f = -MathInvoker.i(MathInvoker.o(anf_2.a(anf_2.c(), -90.0, 90.0)));
        this.n = -MathInvoker.i(MathInvoker.o(anf_2.a(anf_2.c(), -90.0, 90.0)));
        this.b = hb_2.a((long)anf_2.c(anf_2.c()));
        this.a = this.i = MathHelper.a(3.0, 5.0);
        this.c = MathHelper.a(36.0, 54.0);
        this.h = d3;
        abl_1.b(this.j);
        abl_1.b(this.d);
        this.g = (long)MathHelper.d((double)anf_2.a(anf_2.c(), 800, 1600), 100.0);
        this.m = (long)MathHelper.d((double)anf_2.a(anf_2.c(), 1600, 2100), 100.0);
    }

    public void a(boolean bl) {
        TimerUtil.e();
        double d = abl_1.a(this.j, this.g, this.c);
        double d2 = this.l + (this.h + d) * this.f;
        double d3 = this.k + (this.h + d) * this.n;
        a1V.b(d2, d3, this.a, this.b);
        a1V.c(d2, d3, this.a, this.b);
        this.a = this.i - abl_1.a(this.d, this.m, this.i);
    }

    public tt_2(aCT aCT2, double d, double d2, int n, int n2, double d3) {
        this.e = aCT2;
        this.j = new Timer();
        this.d = new Timer();
        this.l = d;
        this.k = d2;
        this.f = -MathInvoker.i(MathInvoker.o(anf_2.a(anf_2.c(), -90.0, 90.0)));
        this.n = -MathInvoker.i(MathInvoker.o(anf_2.a(anf_2.c(), -90.0, 90.0)));
        this.b = hb_2.a(n, n2, (long)anf_2.c(anf_2.c()));
        this.a = this.i = MathHelper.a(3.0, 5.0);
        this.c = MathHelper.a(36.0, 54.0);
        this.h = d3;
        abl_1.b(this.j);
        abl_1.b(this.d);
        this.g = (long)MathHelper.d((double)anf_2.a(anf_2.c(), 800, 1600), 100.0);
        this.m = (long)MathHelper.d((double)anf_2.a(anf_2.c(), 1600, 2100), 100.0);
    }

    public void a(double d, boolean bl) {
        double d2 = abl_1.a(this.j, this.g, this.c);
        TimerUtil.e();
        double d3 = this.l + (this.h + d2) * this.f;
        double d4 = this.k + (this.h + d2) * this.n;
        a1V.b(d3, d4, this.a + d, this.b);
        a1V.c(d3, d4, this.a + d, this.b);
        this.a = this.i - abl_1.a(this.d, this.m, this.i);
    }

    public void a(double d, int n, boolean bl) {
        TimerUtil.e();
        double d2 = abl_1.a(this.j, this.g, this.c);
        double d3 = this.l + (this.h + d2) * this.f;
        double d4 = this.k + (this.h + d2) * this.n;
        a1V.b(d3, d4, this.a + d, hb_2.a(n));
        a1V.c(d3, d4, this.a + d, hb_2.a(n));
        this.a = this.i - abl_1.a(this.d, this.m, this.i);
    }

    public tt_2(aCT aCT2, double d, double d2, int n, double d3) {
        this.e = aCT2;
        this.j = new Timer();
        this.d = new Timer();
        this.l = d;
        this.k = d2;
        this.f = -MathInvoker.i(MathInvoker.o(anf_2.a(anf_2.c(), -90.0, 90.0)));
        this.n = -MathInvoker.i(MathInvoker.o(anf_2.a(anf_2.c(), -90.0, 90.0)));
        this.b = n;
        this.a = this.i = MathHelper.a(3.0, 5.0);
        this.c = MathHelper.a(36.0, 54.0);
        this.h = d3;
        abl_1.b(this.j);
        abl_1.b(this.d);
        this.g = (long)MathHelper.d((double)anf_2.a(anf_2.c(), 800, 1600), 100.0);
        this.m = (long)MathHelper.d((double)anf_2.a(anf_2.c(), 1600, 2100), 100.0);
    }

    public tt_2(aCT aCT2, double d, double d2) {
        this.e = aCT2;
        this.j = new Timer();
        this.d = new Timer();
        this.l = d;
        this.k = d2;
        this.f = -MathInvoker.i(MathInvoker.o(anf_2.a(anf_2.c(), -90.0, 90.0)));
        this.n = -MathInvoker.i(MathInvoker.o(anf_2.a(anf_2.c(), -90.0, 90.0)));
        this.b = hb_2.a((long)anf_2.c(anf_2.c()));
        this.a = this.i = MathHelper.a(3.0, 5.0);
        this.c = MathHelper.a(36.0, 54.0);
        this.h = MathHelper.a(18.0, 20.0);
        abl_1.b(this.j);
        abl_1.b(this.d);
        this.g = (long)MathHelper.d((double)anf_2.a(anf_2.c(), 800, 1600), 100.0);
        this.m = (long)MathHelper.d((double)anf_2.a(anf_2.c(), 1600, 2100), 100.0);
    }
}


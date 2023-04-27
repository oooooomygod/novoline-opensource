/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.SystemInvoker;
import deobf.TimerUtil;
import net.aye_1;
import net.qh_1;
import net.ws_1;

public abstract class a7M {
    protected ws_1 c;
    protected double a;
    private static int b;
    protected int d;
    public TimerUtil e;

    protected boolean e() {
        return false;
    }

    public static int f() {
        a7M.b();
        return 78;
    }

    public a7M(int n, double d, ws_1 ws_12) {
        a7M.b();
        this.e = new TimerUtil();
        this.d = n;
        this.a = d;
        this.c = ws_12;
        ListInvoker.b(new ListInvoker[4]);
    }

    public void b(double d) {
        this.a = d;
    }

    public void a(int n) {
        this.d = n;
    }

    static {
        if (a7M.b() == 0) {
            a7M.b(27);
        }
    }

    public void a(ws_1 ws_12) {
        a7M.f();
        if (this.c != ws_12) {
            this.c = ws_12;
            qh_1.a(this.e, SystemInvoker.f() - ((long)this.d - MathInvoker.b((long)this.d, qh_1.c(this.e))));
        }
    }

    public double i() {
        a7M.f();
        if (this.c == ws_1.FORWARDS) {
            if (this.h()) {
                return this.a;
            }
            return this.a(qh_1.c(this.e)) * this.a;
        }
        if (this.h()) {
            return 0.0;
        }
        if (this.e()) {
            double d = MathInvoker.b((long)this.d, MathInvoker.a(0L, (long)this.d - qh_1.c(this.e)));
            return this.a(d) * this.a;
        }
        return (1.0 - this.a(qh_1.c(this.e))) * this.a;
    }

    public ws_1 a() {
        return this.c;
    }

    protected abstract double a(double var1);

    public double g() {
        return 1.0 - (double)qh_1.c(this.e) / (double)this.d * this.a;
    }

    public boolean h() {
        return qh_1.c(this.e, this.d);
    }

    public double c() {
        return this.a;
    }

    public void d() {
        this.a(aye_1.a(this.c));
    }

    public void j() {
        this.e.a();
    }

    public boolean b(ws_1 ws_12) {
        a7M.f();
        return this.h() && this.c.equals((Object)ws_12);
    }

    public static int b() {
        return b;
    }

    public a7M(int n, double d) {
        int n2 = a7M.f();
        this.e = new TimerUtil();
        int n3 = n2;
        this.d = n;
        this.a = d;
        this.c = ws_1.FORWARDS;
        if (ListInvoker.b() != null) {
            a7M.b(++n3);
        }
    }

    public static void b(int n) {
        b = n;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MouseInvoker;
import cc.novoline.gui.alt.AltList;
import java.awt.Color;
import java.util.Iterator;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.ahE
 */
public class ahe_1
extends ahp_2<ahv_2> {
    private float a = 0.0f;
    private float h = 0.0f;
    private float g;
    private float j;
    private boolean i;
    private float k;

    @Override
    public void a(char c, int n) {
    }

    @Override
    public double a() {
        return ((ahv_2)this.c()).a() + 10.0;
    }

    public void c(boolean bl) {
        ahr_1.e();
        int n = MouseInvoker.m();
        if (bl && n != 0) {
            if (n < 0) {
                this.j += 10.0f;
            }
            this.j -= 10.0f;
        }
    }

    public float a() {
        ahr_1.a();
        float f = 0.0f;
        Iterator iterator = ListInvoker.iterator(a0I.e(avf_2.a((AltList)((ahv_2)this.c()).c())));
        if (dz_0.c(iterator)) {
            aV9 aV92 = (aV9)dz_0.b(iterator);
            f += tq_0.d(aV92) + 5.0f;
        }
        return f;
    }

    @Override
    public void a(int n, int n2, int n3) {
        ahr_1.a();
        if (this.a(n, n2) && n3 == 0 && this.a() > 215.0f) {
            this.i = true;
            this.g = n2;
        }
    }

    @Override
    public float c() {
        return this.a;
    }

    public ahe_1(ahv_2 ahv_22) {
        super(ahv_22);
    }

    public boolean a(int n, int n2) {
        ahr_1.a();
        return (double)n > this.e() && (double)n < this.e() + 5.0 && (double)n2 > this.a() && (double)n2 < this.a() + 215.0;
    }

    public void d() {
        this.j = 0.0f;
        this.a = 0.0f;
        this.h = 0.0f;
    }

    @Override
    public double e() {
        return ((AltList)((ahv_2)this.c()).c()).k() - 200.0 - avf_2.h((AltList)((ahv_2)this.c()).c()) + 206.0;
    }

    @Override
    public void a(int n, int n2) {
        this.i = false;
    }

    public float b() {
        return this.h;
    }

    @Override
    public void c(int n, int n2) {
    }

    @Override
    public void b(int n, int n2) {
        ahr_1.a();
        if (this.a() < 215.0f) {
            this.h = 0.0f;
            this.a = 0.0f;
            return;
        }
        float f = 215.0f;
        float f2 = 215.0f;
        float f3 = this.a();
        float f4 = f2 / f3 * f;
        float f5 = f - f4;
        float f6 = f3 - f;
        float f7 = f6 / f5;
        this.h += (this.a - this.h) * 0.1f;
        this.a = this.j * f7;
        if (this.a(n, n2) || this.i) {
            this.k += (1.0f - this.k) * 0.02f;
        }
        this.k -= this.k * 0.02f;
        this.j = MathHelper.b(this.j, 0.0f, f - f4);
        if (this.i && (float)n2 - this.g != 0.0f) {
            this.j += (float)n2 - this.g;
            this.j = MathHelper.b(this.j, 0.0f, f - f4);
            this.g = n2;
        }
        aV3.a(aV3.a(), this.e(), this.a(), 5.0, 215.0, 5.0, 2.0, new Color(20, 20, 20), avf_2.e((AltList)((ahv_2)this.c()).c()), true);
        aV3.a(aV3.a(), this.e(), this.a() + (double)this.j, 5.0, (double)f4, 5.0, 2.0, new Color(40, 40, 40), avf_2.e((AltList)((ahv_2)this.c()).c()), true);
    }
}


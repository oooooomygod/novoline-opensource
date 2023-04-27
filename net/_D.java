/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import deobf.Entity;
import java.util.Iterator;
import java.util.List;
import net.N7;
import net._v_0;
import net.aV8;
import net.dz_0;
import net.h__0;
import net.n5_0;
import net.tz_1;

public class _D
extends _v_0 {
    n5_0 e;
    double c;
    private int d;
    n5_0 b;

    @Override
    public void b() {
        this.d = 0;
    }

    @Override
    public void a() {
        this.e = null;
    }

    @Override
    public boolean g() {
        if (N7.f(this.b) >= 0) {
            return false;
        }
        List list = aV8.a(this.b.worldObj, this.b.getClass(), h__0.d(N7.e(this.b), 8.0, 4.0, 8.0));
        double d = Double.MAX_VALUE;
        Iterator iterator = ListInvoker.iterator(list);
        while (dz_0.c(iterator)) {
            double d2;
            n5_0 n5_02 = (n5_0)dz_0.b(iterator);
            if (N7.f(n5_02) < 0 || !((d2 = N7.a(this.b, (Entity)n5_02)) <= d)) continue;
            d = d2;
        }
        return false;
    }

    @Override
    public boolean f() {
        if (N7.f(this.b) >= 0) {
            return false;
        }
        if (!N7.d(this.e)) {
            return false;
        }
        double d = N7.a(this.b, (Entity)this.e);
        return d >= 9.0 && d <= 256.0;
    }

    @Override
    public void d() {
        if (--this.d <= 0) {
            this.d = 10;
            tz_1.a(N7.i(this.b), this.e, this.c);
        }
    }

    public _D(n5_0 n5_02, double d) {
        this.b = n5_02;
        this.c = d;
    }
}


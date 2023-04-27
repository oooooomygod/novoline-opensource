/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import deobf.Entity;
import deobf.EntityLivingBase;
import java.util.Iterator;
import java.util.List;
import net._v_0;
import net.a5_0;
import net.aV8;
import net.avu_1;
import net.ayh_1;
import net.dz_0;
import net.h__0;
import net.nz_0;
import net.tz_1;

/*
 * Renamed from net._t
 */
public class _t_0
extends _v_0 {
    private int b;
    private EntityLivingBase e;
    private nz_0 d;
    private double c;

    @Override
    public void d() {
        --this.b;
        if (this.e != null) {
            if (ayh_1.a(this.d, this.e) > 4.0) {
                tz_1.a(ayh_1.o(this.d), this.e, this.c);
            }
        } else if (tz_1.b(ayh_1.o(this.d))) {
            avu_1.a(this.d, 16, 3);
            return;
        }
    }

    @Override
    public void a() {
        ayh_1.a(this.d, false);
        this.e = null;
    }

    @Override
    public void b() {
        if (this.e != null) {
            ayh_1.a(this.d, true);
        }
        this.b = 1000;
    }

    @Override
    public boolean f() {
        return this.b > 0;
    }

    @Override
    public boolean g() {
        if (ayh_1.c(this.d) >= 0) {
            return false;
        }
        if (a5_0.a(ayh_1.q(this.d), 400) != 0) {
            return false;
        }
        List list = aV8.a(this.d.worldObj, nz_0.class, h__0.d(ayh_1.k(this.d), 6.0, 3.0, 6.0));
        double d = Double.MAX_VALUE;
        Object object = ListInvoker.iterator(list);
        while (dz_0.c((Iterator)object)) {
            double d2;
            nz_0 nz_02 = (nz_0)dz_0.b((Iterator)object);
            if (nz_02 == this.d || ayh_1.p(nz_02) || ayh_1.c(nz_02) >= 0 || !((d2 = ayh_1.a(nz_02, (Entity)this.d)) <= d)) continue;
            d = d2;
            this.e = nz_02;
        }
        if (this.e == null) {
            object = avu_1.a(this.d, 16, 3);
            return true;
        }
        return true;
    }

    public _t_0(nz_0 nz_02, double d) {
        this.d = nz_02;
        this.c = d;
        this.a(1);
    }
}


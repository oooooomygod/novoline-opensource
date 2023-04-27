/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import java.util.Iterator;
import java.util.List;
import net._v_0;
import net.a5_0;
import net.aV8;
import net.abs_1;
import net.avp_0;
import net.ayh_1;
import net.dz_0;
import net.h__0;
import net.nf_2;
import net.nz_0;
import net.tz_1;

public class _4
extends _v_0 {
    private nz_0 d;
    private nf_2 b;
    private int c;
    private boolean e;

    @Override
    public void a() {
        this.b = null;
        tz_1.a(ayh_1.o(this.d));
    }

    @Override
    public boolean f() {
        return avp_0.c(this.b) > 0;
    }

    @Override
    public void b() {
        this.c = a5_0.a(ayh_1.q(this.d), 320);
        this.e = false;
        tz_1.a(avp_0.b(this.b));
    }

    @Override
    public boolean g() {
        if (ayh_1.c(this.d) >= 0) {
            return false;
        }
        if (!aV8.t(this.d.worldObj)) {
            return false;
        }
        List list = aV8.a(this.d.worldObj, nf_2.class, h__0.d(ayh_1.k(this.d), 6.0, 2.0, 6.0));
        if (ListInvoker.isEmpty(list)) {
            return false;
        }
        Iterator iterator = ListInvoker.iterator(list);
        while (dz_0.c(iterator)) {
            nf_2 nf_22 = (nf_2)dz_0.b(iterator);
            if (avp_0.c(nf_22) <= 0) continue;
            this.b = nf_22;
            break;
        }
        return this.b != null;
    }

    @Override
    public void d() {
        abs_1.a(ayh_1.l(this.d), this.b, 30.0f, 30.0f);
        if (avp_0.c(this.b) == this.c) {
            tz_1.a(ayh_1.o(this.d), this.b, 0.5);
            this.e = true;
        }
        if (this.e && ayh_1.a(this.d, this.b) < 4.0) {
            avp_0.b(this.b, false);
            tz_1.a(ayh_1.o(this.d));
        }
    }

    public _4(nz_0 nz_02) {
        this.d = nz_02;
        this.a(3);
    }
}


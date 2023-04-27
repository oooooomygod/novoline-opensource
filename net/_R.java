/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import net._v_0;
import net.a5_0;
import net.aV8;
import net.abs_1;
import net.avp_0;
import net.h__0;
import net.nf_2;
import net.nz_0;

public class _R
extends _v_0 {
    private nf_2 b;
    private int c;
    private nz_0 d;

    @Override
    public void a() {
        avp_0.b(this.b, false);
        this.d = null;
    }

    public _R(nf_2 nf_22) {
        this.b = nf_22;
        this.a(3);
    }

    @Override
    public boolean f() {
        return this.c > 0;
    }

    @Override
    public void b() {
        this.c = 400;
        avp_0.b(this.b, true);
    }

    @Override
    public boolean g() {
        if (!aV8.t(this.b.worldObj)) {
            return false;
        }
        if (a5_0.a(avp_0.f(this.b), 8000) != 0) {
            return false;
        }
        this.d = (nz_0)aV8.a(this.b.worldObj, nz_0.class, h__0.d(avp_0.d(this.b), 6.0, 2.0, 6.0), (Entity)this.b);
        return this.d != null;
    }

    @Override
    public void d() {
        abs_1.a(avp_0.g(this.b), this.d, 30.0f, 30.0f);
        --this.c;
    }
}


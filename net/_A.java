/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.CG;
import net.MathHelper;
import net._v_0;
import net.a5_0;
import net.abs_1;
import net.nl_1;

public class _A
extends _v_0 {
    private double b;
    private double e;
    private nl_1 d;
    private int c;

    @Override
    public void d() {
        --this.c;
        abs_1.a(CG.F(this.d), this.d.posX + this.e, this.d.posY + (double)CG.A(this.d), this.d.posZ + this.b, 10.0f, CG.C(this.d));
    }

    @Override
    public boolean f() {
        return this.c >= 0;
    }

    @Override
    public boolean g() {
        return a5_0.e(CG.a(this.d)) < 0.02f;
    }

    @Override
    public void b() {
        double d = Math.PI * 2 * a5_0.c(CG.a(this.d));
        this.e = MathHelper.b(d);
        this.b = MathHelper.h(d);
        this.c = 20 + a5_0.a(CG.a(this.d), 20);
    }

    public _A(nl_1 nl_12) {
        this.d = nl_12;
        this.a(3);
    }
}


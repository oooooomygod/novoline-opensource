/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EntityLivingBase;
import net.CG;
import net.MathHelper;
import net._v_0;
import net.a1l;
import net.aCE;
import net.abs_1;
import net.ahb_0;
import net.atn_0;
import net.nl_1;
import net.tz_1;

public class _V
extends _v_0 {
    private int g;
    private double k;
    private nl_1 i;
    private EntityLivingBase d;
    private int b = -1;
    private float h;
    private float j;
    private a1l c;
    private int f;
    private int e;

    @Override
    public void d() {
        double d = CG.a(this.i, this.d.posX, atn_0.i((EntityLivingBase)this.d).a, this.d.posZ);
        aCE.a(CG.k(this.i), this.d);
        ++this.e;
        if (d <= (double)this.j && this.e >= 20) {
            tz_1.a(CG.e(this.i));
        } else {
            tz_1.a(CG.e(this.i), this.d, this.k);
        }
        abs_1.a(CG.F(this.i), this.d, 30.0f, 30.0f);
        if (--this.b == 0) {
            if (!(d > (double)this.j)) {
                // empty if block
            }
            return;
        }
        if (this.b < 0) {
            float f = MathHelper.e(d) / this.h;
            this.b = MathHelper.f(f * (float)(this.g - this.f) + (float)this.f);
        }
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    public _V(a1l a1l2, double d, int n, int n2, float f) {
        if (!(a1l2 instanceof EntityLivingBase)) {
            throw new IllegalArgumentException(ahb_0.a);
        }
        this.c = a1l2;
        this.i = (nl_1)((Object)a1l2);
        this.k = d;
        this.f = n;
        this.g = n2;
        this.h = f;
        this.j = f * f;
        this.a(3);
    }

    @Override
    public boolean g() {
        CG.o(this.i);
        return false;
    }

    @Override
    public boolean f() {
        return this.g() || !tz_1.b(CG.e(this.i));
    }

    @Override
    public void a() {
        this.d = null;
        this.e = 0;
        this.b = -1;
    }

    public _V(a1l a1l2, double d, int n, float f) {
        this(a1l2, d, n, n, f);
    }
}


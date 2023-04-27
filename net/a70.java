/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import net.a7M;
import net.a7_;
import net.ws_1;

public class a70
extends a7M {
    float g;
    float f;
    boolean h;

    public a70(int n, double d, float f, float f2, boolean bl) {
        super(n, d);
        this.f = f;
        this.g = f2;
        this.h = bl;
    }

    @Override
    protected double a(double d) {
        a7_.a();
        double d2 = MathInvoker.b(d / (double)this.d, (double)this.g);
        double d3 = this.f * 0.1f;
        double d4 = MathInvoker.b(2.0, -10.0 * (this.h ? MathInvoker.d(d2) : d2)) * MathInvoker.i((d2 - d3 / 4.0) * (Math.PI * 2 / d3)) + 1.0;
        ListInvoker.b(new ListInvoker[2]);
        return d4;
    }

    public a70(int n, double d, float f, float f2, boolean bl, ws_1 ws_12) {
        super(n, d, ws_12);
        this.f = f;
        this.g = f2;
        this.h = bl;
    }
}


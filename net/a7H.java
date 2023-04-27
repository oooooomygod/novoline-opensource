/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import net.a7M;
import net.a7_;
import net.ws_1;

public class a7H
extends a7M {
    private float f;

    public a7H(int n, double d, float f) {
        super(n, d);
        this.f = f;
    }

    @Override
    protected double a(double d) {
        a7_.a();
        double d2 = d / (double)this.d;
        float f = this.f + 1.0f;
        double d3 = MathInvoker.d(0.0, 1.0 + (double)f * MathInvoker.b(d2 - 1.0, 3.0) + (double)this.f * MathInvoker.b(d2 - 1.0, 2.0));
        if (ListInvoker.b() != null) {
            a7_.b("NHNwgb");
        }
        return d3;
    }

    public a7H(int n, double d, float f, ws_1 ws_12) {
        super(n, d, ws_12);
        this.f = f;
    }

    @Override
    protected boolean e() {
        return true;
    }
}


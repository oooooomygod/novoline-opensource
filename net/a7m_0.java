/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MathInvoker;
import net.a7M;
import net.a7_;
import net.ws_1;

/*
 * Renamed from net.a7m
 */
public class a7m_0
extends a7M {
    public a7m_0(int n, double d) {
        super(n, d);
    }

    public a7m_0(int n, double d, ws_1 ws_12) {
        super(n, d, ws_12);
    }

    @Override
    protected double a(double d) {
        a7_.a();
        double d2 = d / (double)this.d;
        return d2 < 0.5 ? 2.0 * MathInvoker.b(d2, 2.0) : 1.0 - MathInvoker.b(-2.0 * d2 + 2.0, 2.0) / 2.0;
    }
}


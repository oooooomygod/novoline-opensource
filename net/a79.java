/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a7M;
import net.ws_1;

public class a79
extends a7M {
    public a79(int n, double d) {
        super(n, d);
    }

    public a79(int n, double d, ws_1 ws_12) {
        super(n, d, ws_12);
    }

    @Override
    protected double a(double d) {
        double d2 = d / (double)this.d;
        return 1.0 - (d2 - 1.0) * (d2 - 1.0);
    }
}


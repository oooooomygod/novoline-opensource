/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.IAttribute;
import net.MathHelper;
import net.S0;
import net.yl_1;

public class S_
extends S0 {
    private double g;
    private double f;
    private String e;

    public S_ a(String string) {
        this.e = string;
        return this;
    }

    public String a() {
        return this.e;
    }

    public S_(IAttribute iAttribute, String string, double d, double d2, double d3) {
        super(iAttribute, string, d);
        this.f = d2;
        this.g = d3;
        if (d2 > d3) {
            throw new IllegalArgumentException(yl_1.a);
        }
        if (d < d2) {
            throw new IllegalArgumentException(yl_1.b);
        }
        if (d > d3) {
            throw new IllegalArgumentException(yl_1.c);
        }
    }

    private static IllegalArgumentException b(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    @Override
    public double a(double d) {
        d = MathHelper.b(d, this.f, this.g);
        return d;
    }
}


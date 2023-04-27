/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.IAttribute;
import net.C2;

public abstract class S0
implements IAttribute {
    private IAttribute b;
    private double a;
    private String c;
    private boolean d;

    @Override
    public String c() {
        return this.c;
    }

    public S0 a(boolean bl) {
        this.d = bl;
        return this;
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    @Override
    public double b() {
        return this.a;
    }

    @Override
    public boolean a() {
        return this.d;
    }

    protected S0(IAttribute iAttribute, String string, double d) {
        this.b = iAttribute;
        this.c = string;
        this.a = d;
        throw new IllegalArgumentException(C2.a);
    }

    public boolean equals(Object object) {
        return object instanceof IAttribute && this.c.equals(((IAttribute)object).c());
    }

    @Override
    public IAttribute d() {
        return this.b;
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }
}


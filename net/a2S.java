/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package net;

import net.P8;
import net.UY;
import net.a1V;
import net.a2X;
import net.aL0;
import net.aU3;
import net.agc_2;
import net.asl_0;
import net.kq_0;
import net.v6_0;
import org.checkerframework.checker.nullness.qual.Nullable;

public abstract class a2S
extends a2X
implements kq_0 {
    protected @Nullable agc_2 i;

    @Override
    public boolean equals(Object object) {
        a2X.a();
        if (this == object) {
            return true;
        }
        if (!(object instanceof a2S)) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }
        a2S a2S2 = (a2S)object;
        return UY.a((Object)this.i, a2S2.i);
    }

    @Override
    public void a(int n, int n2) {
        a2X.a();
        a1V.c(this.b, this.c, this.f, this.e, this.g);
        if (this.i != null) {
            this.i.b(n, n2);
        }
    }

    private static NullPointerException a(NullPointerException nullPointerException) {
        return nullPointerException;
    }

    @Override
    public String toString() {
        return aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(aL0.a(aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(aL0.a(aL0.a(new StringBuilder(), aU3.g), this.i), aU3.f), this.g), aU3.h), this.f), aU3.c), this.e), aU3.b), this.a), aU3.a), this.b), aU3.e), this.c), '}').toString();
    }

    public void a() throws NullPointerException {
        asl_0.a(this.i, aU3.d);
        int n = (int)((float)this.b + (float)(this.f - this.i.i()) / 2.0f);
        int n2 = this.c + 4;
        v6_0.a(this.i, n, n2);
    }

    public a2S(@Nullable agc_2 agc_22, int n, int n2, int n3, int n4, int n5) {
        super(n, n2, n3, n4, n5);
        this.c(agc_22);
    }

    @Override
    public @Nullable agc_2 c() {
        return this.i;
    }

    @Override
    public void c(@Nullable agc_2 agc_22) {
        a2X.a();
        this.i = agc_22;
        this.a();
    }

    @Override
    public int hashCode() {
        return UY.a(new Object[]{P8.d(super.hashCode()), this.i});
    }
}


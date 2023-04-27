/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package net;

import cc.novoline.invoke.ListInvoker;
import net.P8;
import net.UY;
import net.a1V;
import net.a2X;
import net.aGS;
import net.aL0;
import net.agc_2;
import net.asl_0;
import net.lh_2;
import net.v6_0;
import org.checkerframework.checker.nullness.qual.Nullable;

/*
 * Renamed from net.a2m
 */
public abstract class a2m_0
extends a2X
implements aGS {
    protected @Nullable agc_2 i;
    protected int j;

    public void a() throws NullPointerException {
        asl_0.a(this.i, lh_2.i);
        int n = (int)((float)this.b + (float)(this.f - this.i.i()) / 2.0f);
        int n2 = this.c + 4;
        v6_0.a(this.i, n, n2);
    }

    @Override
    public @Nullable agc_2 c() {
        return this.i;
    }

    @Override
    public boolean equals(Object object) {
        a2X.a();
        if (this == object) {
            return true;
        }
        if (!(object instanceof a2m_0)) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }
        a2m_0 a2m_02 = (a2m_0)object;
        return this.j == a2m_02.j && UY.a((Object)this.i, a2m_02.i);
    }

    private static NullPointerException a(NullPointerException nullPointerException) {
        return nullPointerException;
    }

    @Override
    public void c(@Nullable agc_2 agc_22) {
        a2X.a();
        this.i = agc_22;
        this.a();
    }

    @Override
    public int hashCode() {
        return UY.a(new Object[]{P8.d(super.hashCode()), this.i, P8.d(this.j)});
    }

    @Override
    public String toString() {
        a2X.a();
        String string = aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(aL0.a(aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(aL0.a(aL0.a(new StringBuilder(), lh_2.d), this.i), lh_2.f), this.j), lh_2.e), this.g), lh_2.b), this.f), lh_2.g), this.e), lh_2.c), this.a), lh_2.a), this.b), lh_2.h), this.c), '}').toString();
        ListInvoker.b(new ListInvoker[5]);
        return string;
    }

    @Override
    public void a(int n, int n2) {
        a2X.a();
        a1V.a((float)this.b, (float)this.c, (float)this.f, (float)this.e, (float)this.j, this.g);
        if (this.i != null) {
            this.i.b(n, n2);
        }
    }

    public a2m_0(@Nullable agc_2 agc_22, int n, int n2, int n3, int n4, int n5, int n6) {
        super(n2, n3, n4, n5, n6);
        this.c(agc_22);
        this.j = n;
    }

    @Override
    public void g(int n) {
        this.j = n;
    }

    @Override
    public int f() {
        return this.j;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import net.P8;
import net.UY;
import net.a1V;
import net.a2X;
import net.aL0;
import net.bl_0;
import net.px_1;

public abstract class a29
extends a2X
implements bl_0 {
    protected int i;

    @Override
    public boolean equals(Object object) {
        a2X.a();
        if (this == object) {
            return true;
        }
        if (!(object instanceof a29)) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }
        a29 a292 = (a29)object;
        return this.i == a292.i;
    }

    @Override
    public int f() {
        return this.i;
    }

    @Override
    public int hashCode() {
        return UY.a(new Object[]{P8.d(super.hashCode()), P8.d(this.i)});
    }

    @Override
    public void a(int n, int n2) {
        a1V.a((float)this.b, (float)this.c, (float)this.f, (float)this.e, (float)this.i, this.g);
    }

    public a29(int n, int n2, int n3, int n4, int n5, int n6) {
        super(n2, n3, n4, n5, n6);
        this.i = n;
    }

    @Override
    public void g(int n) {
        this.i = n;
    }

    @Override
    public String toString() {
        a2X.a();
        String string = aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(aL0.a(aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(new StringBuilder(), px_1.c), this.i), px_1.e), this.g), px_1.g), this.f), px_1.b), this.e), px_1.a), this.a), px_1.f), this.b), px_1.d), this.c), '}').toString();
        if (ListInvoker.b() != null) {
            a2X.b(new int[4]);
        }
        return string;
    }
}


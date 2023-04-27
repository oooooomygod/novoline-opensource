/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import net.P8;
import net.UY;
import net.a2d_0;
import net.aL0;
import net.awl_0;
import net.nu_0;

public abstract class a2N
extends a2d_0
implements nu_0 {
    protected int e;
    protected int f;

    @Override
    public String toString() {
        a2d_0.b();
        String string = aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(aL0.a(aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(new StringBuilder(), awl_0.b), this.f), awl_0.e), this.e), awl_0.d), this.a), awl_0.a), this.b), awl_0.c), this.c), '}').toString();
        if (ListInvoker.b() != null) {
            a2d_0.b(new ListInvoker[1]);
        }
        return string;
    }

    @Override
    public int hashCode() {
        return UY.a(new Object[]{P8.d(super.hashCode()), P8.d(this.f), P8.d(this.e)});
    }

    @Override
    public int b() {
        return this.e;
    }

    @Override
    public boolean a(int n, int n2) {
        a2d_0.b();
        boolean bl = n >= this.b && n <= this.b + this.f && n2 >= this.c && n2 <= this.c + this.e;
        return bl;
    }

    @Override
    public boolean equals(Object object) {
        a2d_0.b();
        if (this == object) {
            return true;
        }
        if (!(object instanceof a2N)) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }
        a2N a2N2 = (a2N)object;
        return this.f == a2N2.f && this.e == a2N2.e;
    }

    @Override
    public void d(int n) {
        this.e = n;
    }

    public a2N(int n, int n2, int n3, int n4) {
        super(n, n2);
        this.f = n3;
        this.e = n4;
    }

    @Override
    public int d() {
        return this.f;
    }

    @Override
    public void c(int n) {
        this.f = n;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import net.KU;
import net.P8;
import net.UY;
import net.a6l_0;
import net.aL0;
import net.auk_2;
import net.oh_1;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.a2d
 */
public abstract class a2d_0
implements KU {
    protected int b;
    private static ListInvoker[] d;
    protected boolean a = true;
    protected int c;

    @Override
    public void b(int n) {
        this.b = n;
    }

    public a2d_0(int n, int n2) {
        this.b = n;
        this.c = n2;
    }

    @Override
    public boolean b() {
        return this.a;
    }

    static {
        if (a2d_0.b() == null) {
            a2d_0.b(new ListInvoker[3]);
        }
    }

    public int hashCode() {
        return UY.a(new Object[]{auk_2.b(this.a), P8.d(this.b), P8.d(this.c)});
    }

    public boolean equals(Object object) {
        a2d_0.b();
        if (this == object) {
            return true;
        }
        if (!(object instanceof a2d_0)) {
            return false;
        }
        a2d_0 a2d_02 = (a2d_0)object;
        return this.a == a2d_02.a && this.b == a2d_02.b && this.c == a2d_02.c;
    }

    public static ListInvoker[] b() {
        return d;
    }

    @Override
    public void b(int n, int n2) {
        a2d_0.b();
        if (!this.a) {
            return;
        }
        a6l_0.a(this, n, n2);
    }

    @Override
    public void a(int n) {
        this.c = n;
    }

    public static void b(ListInvoker[] listInvokerArray) {
        d = listInvokerArray;
    }

    @Override
    public int a() {
        return this.b;
    }

    @Override
    public int c() {
        return this.c;
    }

    public String toString() {
        return aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(aL0.a(aL0.a(new StringBuilder(), oh_1.c), this.a), oh_1.a), this.b), oh_1.b), this.c), '}').toString();
    }

    @Override
    public void a(boolean bl) {
        this.a = bl;
    }
}


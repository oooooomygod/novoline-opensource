/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.AbstractIterator
 */
package net;

import cc.novoline.invoke.ListInvoker;
import com.google.common.collect.AbstractIterator;
import java.util.ArrayDeque;
import java.util.Iterator;
import net.a8O;
import net.a8Z;
import net.aXJ;
import net.ad__0;
import net.anz_0;
import net.dx_1;
import net.dz_0;
import net.ki_0;
import net.u2_0;
import net.w2_0;

/*
 * Renamed from net.ql
 */
class ql_1<N extends ad__0>
extends AbstractIterator<a8Z<N>> {
    private ArrayDeque<dx_1> a;

    ql_1(N n) {
        w2_0.e();
        this.a = new ArrayDeque();
        a8O.a(this.a, new dx_1(this, null, (Iterator)anz_0.a(new aXJ<N>(ki_0.c(n), n))));
        ListInvoker.b(new ListInvoker[3]);
    }

    protected a8Z<N> a() {
        w2_0.d();
        if (!a8O.f(this.a)) {
            dx_1 dx_12 = (dx_1)a8O.c(this.a);
            if (dz_0.c(dx_12.c)) {
                aXJ aXJ2 = (aXJ)dz_0.b(dx_12.c);
                a8O.a(this.a, new dx_1(this, aXJ2, u2_0.a(aXJ2)));
            }
            a8O.d(this.a);
            if (dx_12.a != null) {
                return dx_12.a;
            }
        }
        return (a8Z)this.endOfData();
    }
}


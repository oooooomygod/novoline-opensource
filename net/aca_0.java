/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import net.a8Z;
import net.aXJ;
import net.ad__0;
import net.anz_0;
import net.ki_0;
import net.sd_0;
import net.u2_0;
import net.w2_0;

/*
 * Renamed from net.aCa
 */
class aca_0<N extends ad__0>
implements Iterator<a8Z<N>> {
    private Deque<Iterator<aXJ<N>>> a = new ArrayDeque<Iterator<aXJ<N>>>();

    aca_0(N n) {
        sd_0.a(this.a, anz_0.a(new aXJ<N>(ki_0.c(n), n)));
    }

    @Override
    public boolean hasNext() {
        w2_0.e();
        return !sd_0.a(this.a);
    }

    public a8Z<N> a() {
        Iterator iterator;
        w2_0.e();
        Iterator iterator2 = (Iterator)sd_0.f(this.a);
        aXJ aXJ2 = (aXJ)iterator2.next();
        if (!iterator2.hasNext()) {
            sd_0.c(this.a);
        }
        if ((iterator = u2_0.a(aXJ2)).hasNext()) {
            sd_0.c(this.a, iterator);
        }
        return aXJ2;
    }
}


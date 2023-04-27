/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.FutureTaskInvoker;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import net.a8Z;
import net.aXJ;
import net.ad__0;
import net.anz_0;
import net.ki_0;
import net.u2_0;
import net.w2_0;

class aDX<N extends ad__0>
implements Iterator<a8Z<N>> {
    private Queue<aXJ<N>> a = new ArrayDeque<aXJ<N>>();

    @Override
    public boolean hasNext() {
        w2_0.d();
        return !FutureTaskInvoker.c(this.a);
    }

    aDX(N n) {
        FutureTaskInvoker.a(this.a, new aXJ<N>(ki_0.c(n), n));
    }

    public a8Z<N> a() {
        aXJ aXJ2 = (aXJ)FutureTaskInvoker.a(this.a);
        anz_0.a(this.a, u2_0.a(aXJ2));
        return aXJ2;
    }
}


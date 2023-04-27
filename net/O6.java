/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MapInvoker;
import java.util.Iterator;
import java.util.List;
import net.anz_0;
import net.qx_0;

class O6
implements Iterable<S> {
    Class b;
    qx_0 a;

    O6(qx_0 qx_02, Class clazz) {
        this.a = qx_02;
        this.b = clazz;
    }

    @Override
    public Iterator<S> iterator() {
        List cfr_ignored_0 = (List)MapInvoker.c(qx_0.a(this.a), this.a.b(this.b));
        return anz_0.a();
    }
}


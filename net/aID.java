/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.AbstractIterator
 */
package net;

import com.google.common.collect.AbstractIterator;
import net.aP2;
import net.amv_2;
import net.aut_1;
import net.pg_2;
import net.zw_1;

class aID
extends AbstractIterator {
    private zw_1 b;
    pg_2 a;

    protected Object computeNext() {
        return this.a();
    }

    protected zw_1 a() {
        aP2.b();
        if (this.b == null) {
            this.b = new zw_1(amv_2.j(this.a.a), amv_2.h(this.a.a), amv_2.i(this.a.a), 3);
            return this.b;
        }
        if (this.b.equals(this.a.b)) {
            return (zw_1)this.endOfData();
        }
        int n = aut_1.c(this.b);
        int n2 = aut_1.b(this.b);
        int n3 = aut_1.a(this.b);
        if (n < amv_2.j(this.a.b)) {
            ++n;
        }
        if (n2 < amv_2.h(this.a.b)) {
            n = amv_2.j(this.a.a);
            ++n2;
        }
        if (n3 < amv_2.i(this.a.b)) {
            n = amv_2.j(this.a.a);
            n2 = amv_2.h(this.a.a);
            ++n3;
        }
        aut_1.a(this.b, n, n2, n3);
        return this.b;
    }

    aID(pg_2 pg_22) {
        this.a = pg_22;
        this.b = null;
    }
}


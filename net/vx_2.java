/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.AbstractIterator
 */
package net;

import com.google.common.collect.AbstractIterator;
import net.ain_1;
import net.amv_2;
import net.ar_2;
import net.z6_0;

/*
 * Renamed from net.vx
 */
class vx_2
extends AbstractIterator<z6_0> {
    ar_2 a;
    private z6_0 b;

    protected z6_0 a() {
        if (this.b == null) {
            this.b = new z6_0(amv_2.j(this.a.a), amv_2.h(this.a.a), amv_2.i(this.a.a));
            return this.b;
        }
        if (this.b.equals(this.a.b)) {
            return (z6_0)this.endOfData();
        }
        int n = ain_1.e(this.b);
        int n2 = ain_1.g(this.b);
        int n3 = ain_1.a(this.b);
        if (n < amv_2.j(this.a.b)) {
            ++n;
        } else if (n2 < amv_2.h(this.a.b)) {
            n = amv_2.j(this.a.a);
            ++n2;
        } else if (n3 < amv_2.i(this.a.b)) {
            n = amv_2.j(this.a.a);
            n2 = amv_2.h(this.a.a);
            ++n3;
        }
        z6_0.c(this.b, n);
        z6_0.a(this.b, n2);
        z6_0.b(this.b, n3);
        return this.b;
    }

    vx_2(ar_2 ar_22) {
        this.a = ar_22;
        this.b = null;
    }
}


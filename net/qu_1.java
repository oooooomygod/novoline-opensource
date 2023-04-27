/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.ZT;
import net.aci_1;
import net.agl_1;
import net.ak9_0;

/*
 * Renamed from net.qU
 */
class qu_1
implements aci_1 {
    ZT a;

    qu_1(ZT zT) {
        this.a = zT;
    }

    @Override
    public void a(agl_1 agl_12, int n) {
        ak9_0.c(this.a.R(), n);
    }

    @Override
    public void a(agl_1 agl_12, double d, double d2) {
        ak9_0.b(this.a.R(), d, d2);
    }

    @Override
    public void c(agl_1 agl_12, double d) {
        ak9_0.c(this.a.R(), d);
    }

    @Override
    public void a(agl_1 agl_12, double d) {
        ak9_0.a(this.a.R(), d);
    }

    @Override
    public void b(agl_1 agl_12, double d) {
        ak9_0.b(this.a.R(), d);
    }

    @Override
    public void a(agl_1 agl_12, double d, double d2, long l4) {
        ak9_0.a(this.a.R(), d, d2, l4);
    }

    @Override
    public void b(agl_1 agl_12, int n) {
        ak9_0.a(this.a.R(), n);
    }
}


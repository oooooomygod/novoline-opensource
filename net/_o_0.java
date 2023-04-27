/*
 * Decompiled with CFR 0.152.
 */
package net;

import net._c_0;
import net.af4_0;
import net.nl_1;

/*
 * Renamed from net._o
 */
public class _o_0
extends _c_0 {
    int i;
    boolean h;

    @Override
    public void d() {
        --this.i;
        super.d();
    }

    @Override
    public void a() {
        if (this.h) {
            af4_0.a(this.f, this.c.worldObj, this.b, false);
        }
    }

    @Override
    public void b() {
        this.i = 20;
        af4_0.a(this.f, this.c.worldObj, this.b, true);
    }

    @Override
    public boolean f() {
        return this.h && this.i > 0 && super.f();
    }

    public _o_0(nl_1 nl_12, boolean bl) {
        super(nl_12);
        this.c = nl_12;
        this.h = bl;
    }
}


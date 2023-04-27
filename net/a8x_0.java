/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.ListInvoker;
import net.aiy_1;
import net.rq_0;

/*
 * Renamed from net.a8x
 */
class a8x_0
extends aiy_1 {
    rq_0 x;

    public a8x_0(rq_0 rq_02) {
        this.x = rq_02;
        super(rq_02.t, rq_02.n, rq_02.f, 80, rq_02.f - 40, FontRendererInvoker.d(rq_02.q) + 1);
    }

    @Override
    protected int h() {
        return this.r - 10;
    }

    @Override
    protected boolean c(int n) {
        return false;
    }

    @Override
    protected void a() {
    }

    @Override
    protected void a(int n, boolean bl, int n2, int n3) {
    }

    @Override
    protected int f() {
        return ListInvoker.size(rq_0.b(this.x));
    }

    @Override
    protected void a(int n, int n2, int n3, int n4, int n5, int n6) {
        FontRendererInvoker.a(this.x.q, (String)ListInvoker.get(rq_0.b(this.x), n), 10.0f, n3, 0xFFFFFF);
        FontRendererInvoker.a(this.x.q, (String)ListInvoker.get(rq_0.a(this.x), n), 230.0f, n3, 0xFFFFFF);
    }
}


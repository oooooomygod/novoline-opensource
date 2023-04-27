/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MouseInvoker;
import deobf.MCInvoker;
import net._p_0;
import net.a8J;
import net.aiy_1;
import net.y4_0;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.aiK
 */
public class aik_1
extends aiy_1 {
    private a8J x;

    @Override
    protected int h() {
        return _p_0.a(this.x);
    }

    @Override
    protected void a(int n, int n2, int n3, int n4) {
        int n5 = this.f();
        for (int i = 0; i < n5; ++i) {
            int n6 = n2 + i * this.m + this.u;
            int n7 = this.m - 4;
            if (n6 > this.t || n6 + n7 < this.l) {
                this.a(i, n, n6);
            }
            if (this.h && this.c(i)) {
                this.a(this.r, n6, n7, y4_0.b);
            }
            this.a(i, n, n6, n7, n3, n4);
        }
    }

    public int a() {
        return this.o;
    }

    public void a(int n, int n2, int n3, y4_0 y4_02) {
        _p_0.a(this.x, n, n2, n3, y4_02);
    }

    @Override
    protected void a(int n, boolean bl, int n2, int n3) {
        _p_0.a(this.x, n, bl, n2, n3);
    }

    @Override
    protected boolean c(int n) {
        return _p_0.a(this.x, n);
    }

    public aik_1(a8J a8J2, int n, int n2, int n3, int n4, int n5) {
        super(MCInvoker.f(), n, n2, n3, n4, n5);
        this.x = a8J2;
    }

    @Override
    protected void a() {
        _p_0.c(this.x);
    }

    @Override
    protected int f() {
        return _p_0.b(this.x);
    }

    @Override
    protected void a(int n, int n2, int n3, int n4, int n5, int n6) {
        _p_0.a(this.x, n, n2, n3, n4, n5, n6);
    }

    @Override
    protected int e() {
        return _p_0.d(this.x);
    }

    @Override
    public void g() {
        super.g();
        if (this.s > 0.0f && MouseInvoker.i()) {
            _p_0.a(this.x, this.l, this.t, this.u, this.p, this.m);
        }
    }

    public int g() {
        return this.r;
    }

    public int b() {
        return this.w;
    }
}


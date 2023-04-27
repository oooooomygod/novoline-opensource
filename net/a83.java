/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.MCInvoker;
import net.CK;
import net.aiy_1;
import net.ars_1;


public class a83
extends aiy_1 {
    private ars_1 x;

    public a83(ars_1 ars_12, int n, int n2, int n3, int n4, int n5) {
        super(MCInvoker.f(), n, n2, n3, n4, n5);
        this.x = ars_12;
    }

    @Override
    protected int h() {
        return CK.b(this.x);
    }

    @Override
    protected void a() {
        CK.d(this.x);
    }

    public int b() {
        return this.o;
    }

    @Override
    public void g() {
        super.g();
    }

    public int a() {
        return this.w;
    }

    @Override
    protected int e() {
        return CK.a(this.x);
    }

    public int g() {
        return this.r;
    }

    @Override
    protected void a(int n, boolean bl, int n2, int n3) {
        CK.a(this.x, n, bl, n2, n3);
    }

    @Override
    protected int f() {
        return CK.c(this.x);
    }

    @Override
    protected boolean c(int n) {
        return CK.a(this.x, n);
    }

    @Override
    protected void a(int n, int n2, int n3, int n4, int n5, int n6) {
        CK.a(this.x, n, n2, n3, n4, n5, n6);
    }
}


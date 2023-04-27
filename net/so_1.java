/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.MCInvoker;

/*
 * Renamed from net.sO
 */
public class so_1
extends sg_1 {
    private ResourcePackRepositoryEntry g;

    @Override
    protected String d() {
        return ad6_0.d(this.g);
    }

    @Override
    protected int e() {
        return ad6_0.c(this.g);
    }

    public so_1(RB rB, ResourcePackRepositoryEntry resourcePackRepositoryEntry2) {
        super(rB);
        this.g = resourcePackRepositoryEntry2;
    }

    @Override
    protected String i() {
        return ad6_0.e(this.g);
    }

    @Override
    protected void f() {
        ad6_0.a(this.g, MCInvoker.E(this.c));
    }

    public ResourcePackRepositoryEntry a() {
        return this.g;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.client.Minecraft;


public class QF
extends QG {
    private mf_2 p;

    public int b(boolean bl) {
        return super.a(bl);
    }

    public int b() {
        return this.i;
    }

    public boolean e() {
        return this.g;
    }

    public int g() {
        return this.m;
    }

    public mf_2 f() {
        return this.p;
    }

    public void b(String string) {
        this.k = string;
    }

    @Override
    public void a(int n, int n2) {
        T3.a(this.p, n, n2);
    }

    public void a(boolean bl) {
        this.g = bl;
    }

    @Override
    public int a(boolean bl) {
        return T3.a(this.p, bl);
    }

    @Override
    public void a(Minecraft minecraft, int n, int n2) {
        T3.b(this.p, n, n2);
    }

    public QF(mf_2 mf_22, int n, int n2, int n3, String string) {
        super(n, n2, n3, string);
        this.p = mf_22;
    }

    public QF(mf_2 mf_22, int n, int n2, int n3, String string, int n4, int n5) {
        super(n, n2, n3, n4, n5, string);
        this.p = mf_22;
    }

    @Override
    public boolean b(Minecraft minecraft, int n, int n2) {
        if (super.b(minecraft, n, n2)) {
            T3.c(this.p, n, n2);
        }
        return super.b(minecraft, n, n2);
    }

    @Override
    public int c() {
        return super.c();
    }

    public int d() {
        return (int)this.h;
    }
}


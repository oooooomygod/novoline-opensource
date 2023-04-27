/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import net.minecraft.client.Minecraft;


public class QX
extends QG {
    private float p;
    private sp_2 q;
    private String v;
    private float r;
    private aYM s;
    private float u = 1.0f;
    public boolean t;

    @Override
    public void a(int n, int n2) {
        this.t = false;
    }

    public QX(aYM aYM2, int n, int n2, int n3, String string, float f, float f2, float f3, sp_2 sp_22) {
        super(n, n2, n3, 150, 20, a27.a);
        this.v = string;
        this.p = f;
        this.r = f2;
        this.u = (f3 - f) / (f2 - f);
        this.q = sp_22;
        this.s = aYM2;
        this.k = this.b();
    }

    public void a(float f) {
        this.u = f;
        this.k = this.b();
        UQ.a(this.s, this.m, this.b());
    }

    @Override
    public String b() {
        return this.q == null ? aL0.a(aL0.a(aL0.a(new StringBuilder(), I18n.format(this.v, new Object[0])), a27.b), this.b()).toString() : awb_1.a(this.q, this.m, I18n.format(this.v, new Object[0]), this.b());
    }

    @Override
    public boolean b(Minecraft minecraft, int n, int n2) {
        if (super.b(minecraft, n, n2)) {
            this.u = (float)((double)n - (this.n + 4.0)) / (float)(this.o - 8);
            if (this.u < 0.0f) {
                this.u = 0.0f;
            }
            if (this.u > 1.0f) {
                this.u = 1.0f;
            }
            this.k = this.b();
            UQ.a(this.s, this.m, this.b());
            this.t = true;
            return true;
        }
        return false;
    }

    public float b() {
        return this.p + (this.r - this.p) * this.u;
    }

    public void a(float f, boolean bl) {
        this.u = (f - this.p) / (this.r - this.p);
        this.k = this.b();
        UQ.a(this.s, this.m, this.b());
    }

    public float a() {
        return this.u;
    }

    @Override
    protected int a(boolean bl) {
        return 0;
    }

    @Override
    protected void a(Minecraft minecraft, int n, int n2) {
        if (this.j) {
            if (this.t) {
                this.u = (float)((double)n - (this.n + 4.0)) / (float)(this.o - 8);
                if (this.u < 0.0f) {
                    this.u = 0.0f;
                }
                if (this.u > 1.0f) {
                    this.u = 1.0f;
                }
                this.k = this.b();
                UQ.a(this.s, this.m, this.b());
            }
            GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
            this.c((int)this.n + (int)(this.u * (float)(this.o - 8)), (int)this.h, 0, 66, 4, 20);
            this.c((int)this.n + (int)(this.u * (float)(this.o - 8)) + 4, (int)this.h, 196, 66, 4, 20);
        }
    }
}


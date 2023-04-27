/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import deobf.MCInvoker;
import net.MathHelper;
import net.apv_1;
import net.atB;
import net.mf_2;

/*
 * Renamed from net.mq
 */
public class mq_2
extends mf_2 {
    public float e = 1.0f;
    private int c;
    private float d;
    private float g;
    public boolean f;

    public void a(float f) {
    }

    public float b(float f) {
        return this.c(this.g + (this.d - this.g) * MathHelper.b(f, 0.0f, 1.0f));
    }

    @Override
    public void c(int n, int n2) {
        if (this.c().j) {
            if (this.f) {
                this.e = (float)((double)n - (this.c().n + 4.0)) / (float)(atB.b(this.c()) - 8);
                this.e = MathHelper.b(this.e, 0.0f, 1.0f);
                float f = this.b(this.e);
                this.a(f);
                this.e = this.e(f);
                this.c().k = this.a();
            }
            TextureManagerInvoker.bindTexture(MCInvoker.E(MCInvoker.f()), a);
            GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
            this.a((int)this.c().n + (int)(this.e * (float)(atB.b(this.c()) - 8)), (int)this.c().h, 0, 66, 4, 20);
            this.a((int)this.c().n + (int)(this.e * (float)(atB.b(this.c()) - 8)) + 4, (int)this.c().h, 196, 66, 4, 20);
        }
    }

    public float e(float f) {
        return MathHelper.b((this.c(f) - this.g) / (this.d - this.g), 0.0f, 1.0f);
    }

    public String a() {
        return apv_1.a;
    }

    @Override
    public void a(int n, int n2) {
        this.f = false;
    }

    public mq_2(int n, int n2, int n3, int n4, int n5, int n6, float f, float f2) {
        super(n, n2, n3, n4, 20, apv_1.b);
        this.g = f;
        this.d = f2;
        this.e = this.e(n6);
        this.c().k = this.a();
    }

    public mq_2(int n, int n2, int n3, int n4, int n5, int n6) {
        this(n, n2, n3, n4, n6, 0, 1.0f, n5);
    }

    public float c(float f) {
        f = this.d(f);
        return MathHelper.b(f, this.g, this.d);
    }

    @Override
    public void b(int n, int n2) {
        this.e = (float)((double)n - (this.c().n + 4.0)) / (float)(atB.b(this.c()) - 8);
        this.e = MathHelper.b(this.e, 0.0f, 1.0f);
        this.a(this.b(this.e));
        this.c().k = this.a();
        this.f = true;
    }

    protected float d(float f) {
        if (this.c > 0) {
            f = this.c * MathInvoker.a(f / (float)this.c);
        }
        return f;
    }

    @Override
    public int a(boolean bl) {
        return 0;
    }
}


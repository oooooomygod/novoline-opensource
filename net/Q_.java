/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import deobf.MCInvoker;
import net.minecraft.client.Minecraft;

public class Q_
extends QG {
    private ajP[] p;
    private float r;
    private float s = (float)(ajP.values().length - ListInvoker.indexOf(a7r_0.a((Object[])ajP.values()), (Object)acu_0.c(47))) / (float)ajP.values().length;
    public boolean q;

    @Override
    public void c(Minecraft minecraft, int n, int n2) {
        super.c(minecraft, n, n2);
    }

    @Override
    public boolean b(Minecraft minecraft, int n, int n2) {
        ayy_0.b();
        if (super.b(minecraft, n, n2)) {
            this.r = (float)((double)n - (this.n + 4.0)) / (float)(this.o - 8);
            this.s = this.r = MathHelper.b(this.r, 0.0f, 1.0f);
            this.k = awc_2.a(acu_0.a(this.p[(int)(this.r * (float)(this.p.length - 1))]));
            fo_0.a().a(awc_2.b(acu_0.a(this.p[(int)(this.r * (float)(this.p.length - 1))])));
            this.q = true;
            return true;
        }
        return false;
    }

    public void c(int n) {
        this.r = this.s = (float)(ajP.values().length - ListInvoker.indexOf(a7r_0.a((Object[])ajP.values()), (Object)acu_0.c(n))) / (float)ajP.values().length;
        this.k = awc_2.a(acu_0.a(this.p[(int)(this.r * (float)(this.p.length - 1))]));
    }

    public Q_(int n, int n2, int n3, int n4, int n5) {
        super(n, n2, n3, MathInvoker.max(n4, 110), n5, aS2.a);
        this.p = ajP.values();
        asg_0.e(a7r_0.a((Object[])this.p));
        this.r = this.s;
        this.k = awc_2.a(acu_0.a(this.p[(int)(this.r * (float)(this.p.length - 1))]));
    }

    @Override
    protected int a(boolean bl) {
        return 0;
    }

    @Override
    public void a(int n, int n2) {
        this.q = false;
    }

    @Override
    protected void a(Minecraft minecraft, int n, int n2) {
        ayy_0.b();
        if (this.j) {
            if (this.q) {
                this.r = (float)((double)n - (this.n + 4.0)) / (float)(this.o - 8);
                this.s = this.r = MathHelper.b(this.r, 0.0f, 1.0f);
                this.k = awc_2.a(acu_0.a(this.p[(int)(this.r * (float)(this.p.length - 1))]));
                fo_0.a().a(awc_2.b(acu_0.a(this.p[(int)(this.r * (float)(this.p.length - 1))])));
            }
            TextureManagerInvoker.bindTexture(MCInvoker.E(minecraft), l);
            GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
            Q_.b(this.n + (double)((int)(this.r * (float)(this.o - 8))), this.h, 0, 66, 4, 20);
            Q_.b(this.n + (double)((int)(this.r * (float)(this.o - 8))) + 4.0, this.h, 196, 66, 4, 20);
        }
    }
}


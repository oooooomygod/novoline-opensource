/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.SoundHandlerInvoker;
import deobf.MCInvoker;
import net.minecraft.client.Minecraft;
import org.checkerframework.checker.nullness.qual.NonNull;

class Q8
extends QG {
    private String r;
    public float q;
    private N6 t;
    RE p;
    public boolean s;

    @Override
    public void a(@NonNull SoundHandler soundHandler) {
    }

    @Override
    public void a(int n, int n2) {
        if (this.s) {
            if (this.t != N6.MASTER) {
                awu_1.a(RE.a(this.p), this.t);
            }
            SoundHandlerInvoker.c(MCInvoker.l(this.p.t), aih_1.a(new ResourceLocation(jf_0.f), 1.0f));
        }
        this.s = false;
    }

    @Override
    protected void a(Minecraft minecraft, int n, int n2) {
        if (this.j) {
            if (this.s) {
                this.q = (float)((double)n - (this.n + 4.0)) / (float)(this.o - 8);
                this.q = MathHelper.b(this.q, 0.0f, 1.0f);
                awu_1.a(minecraft.gameSettings, this.t, this.q);
                awu_1.c(minecraft.gameSettings);
                this.k = aL0.a(aL0.a(aL0.a(new StringBuilder(), this.r), jf_0.c), this.p.a(this.t)).toString();
            }
            GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
            this.c((int)this.n + (int)(this.q * (float)(this.o - 8)), (int)this.h, 0, 66, 4, 20);
            this.c((int)this.n + (int)(this.q * (float)(this.o - 8)) + 4, (int)this.h, 196, 66, 4, 20);
        }
    }

    @Override
    public boolean b(Minecraft minecraft, int n, int n2) {
        if (super.b(minecraft, n, n2)) {
            this.q = (float)((double)n - (this.n + 4.0)) / (float)(this.o - 8);
            this.q = MathHelper.b(this.q, 0.0f, 1.0f);
            awu_1.a(minecraft.gameSettings, this.t, this.q);
            awu_1.c(minecraft.gameSettings);
            this.k = aL0.a(aL0.a(aL0.a(new StringBuilder(), this.r), jf_0.b), this.p.a(this.t)).toString();
            this.s = true;
            return true;
        }
        return false;
    }

    @Override
    protected int a(boolean bl) {
        return 0;
    }

    public Q8(RE rE, int n, int n2, int n3, N6 n6, boolean bl) {
        this.p = rE;
        super(n, n2, n3, 310, 20, jf_0.a);
        this.q = 1.0f;
        this.t = n6;
        this.r = I18n.format(aL0.a(aL0.a(new StringBuilder(), jf_0.d), wt_0.b(n6)).toString(), new Object[0]);
        this.k = aL0.a(aL0.a(aL0.a(new StringBuilder(), this.r), jf_0.e), rE.a(n6)).toString();
        this.q = awu_1.a(RE.a(rE), n6);
    }
}


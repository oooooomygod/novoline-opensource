/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import deobf.MCInvoker;
import net.minecraft.client.Minecraft;

class QS
extends QG {
    private boolean s;
    private ResourceLocation q;
    private int r;
    private int p;

    public void a(boolean bl) {
        this.s = bl;
    }

    @Override
    public void c(Minecraft minecraft, int n, int n2) {
        if (this.j) {
            TextureManagerInvoker.bindTexture(MCInvoker.E(minecraft), rm_0.a());
            GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
            this.f = (double)n >= this.n && (double)n2 >= this.h && (double)n < this.n + (double)this.o && (double)n2 < this.h + (double)this.i;
            int n3 = 0;
            if (!this.g) {
                n3 += this.o * 2;
            } else if (this.s) {
                n3 += this.o;
            } else if (this.f) {
                n3 += this.o * 3;
            }
            this.c((int)this.n, (int)this.h, n3, 219, this.o, this.i);
            if (!rm_0.a().equals(this.q)) {
                TextureManagerInvoker.bindTexture(MCInvoker.E(minecraft), this.q);
            }
            this.c((int)this.n + 2, (int)this.h + 2, this.r, this.p, 18, 18);
        }
    }

    public boolean a() {
        return this.s;
    }

    protected QS(int n, int n2, int n3, ResourceLocation resourceLocation, int n4, int n5) {
        super(n, n2, n3, 22, 22, t1.a);
        this.q = resourceLocation;
        this.r = n4;
        this.p = n5;
    }
}


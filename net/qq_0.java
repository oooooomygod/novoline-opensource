/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import deobf.MCInvoker;
import net.minecraft.client.Minecraft;

/*
 * Renamed from net.Qq
 */
class qq_0
extends QG {
    private boolean p;

    public qq_0(int n, int n2, int n3, boolean bl) {
        super(n, n2, n3, 12, 19, a7N.a);
        this.p = bl;
    }

    @Override
    public void c(Minecraft minecraft, int n, int n2) {
        if (this.j) {
            TextureManagerInvoker.bindTexture(MCInvoker.E(minecraft), R9.b());
            GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
            boolean bl = (double)n >= this.n && (double)n2 >= this.h && (double)n < this.n + (double)this.o && (double)n2 < this.h + (double)this.i;
            int n3 = 0;
            int n4 = 176;
            n4 = !this.g ? (n4 += this.o * 2) : (n4 += this.o);
            if (!this.p) {
                n3 += this.i;
            }
            this.c((int)this.n, (int)this.h, n4, n3, this.o, this.i);
        }
    }
}


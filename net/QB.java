/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import deobf.MCInvoker;
import net.minecraft.client.Minecraft;

public class QB
extends QG {
    @Override
    public void c(Minecraft minecraft, int n, int n2) {
        if (this.j) {
            TextureManagerInvoker.bindTexture(MCInvoker.E(minecraft), QG.l);
            GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
            boolean bl = (double)n >= this.n && (double)n2 >= this.h && (double)n < this.n + (double)this.o && (double)n2 < this.h + (double)this.i;
            int n3 = 106;
            this.c((int)this.n, (int)this.h, 0, n3 += this.i, this.o, this.i);
        }
    }

    public QB(int n, int n2, int n3) {
        super(n, n2, n3, 20, 20, atD.a);
    }
}


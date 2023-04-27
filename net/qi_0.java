/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import deobf.MCInvoker;
import net.minecraft.client.Minecraft;

/*
 * Renamed from net.Qi
 */
class qi_0
extends QG {
    private boolean p;

    public qi_0(int n, int n2, int n3, boolean bl) {
        super(n, n2, n3, 23, 13, awp_1.a);
        this.p = bl;
    }

    @Override
    public void c(Minecraft minecraft, int n, int n2) {
        if (this.j) {
            boolean bl = (double)n >= this.n && (double)n2 >= this.h && (double)n < this.n + (double)this.o && (double)n2 < this.h + (double)this.i;
            GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
            TextureManagerInvoker.bindTexture(MCInvoker.E(minecraft), RA.e());
            int n3 = 0;
            int n4 = 192;
            n3 += 23;
            if (!this.p) {
                n4 += 13;
            }
            this.c((int)this.n, (int)this.h, n3, n4, 23, 13);
        }
    }
}


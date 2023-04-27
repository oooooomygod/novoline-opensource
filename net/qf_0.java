/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import deobf.MCInvoker;
import net.minecraft.client.Minecraft;

/*
 * Renamed from net.Qf
 */
public class qf_0
extends QG {
    private boolean p = false;

    public void a(boolean bl) {
        this.p = bl;
    }

    @Override
    public void c(Minecraft minecraft, int n, int n2) {
        if (this.j) {
            TextureManagerInvoker.bindTexture(MCInvoker.E(minecraft), QG.l);
            GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
            boolean bl = (double)n >= this.n && (double)n2 >= this.h && (double)n < this.n + (double)this.o && (double)n2 < this.h + (double)this.i;
            aY0 aY02 = this.p ? (!this.g ? aY0.LOCKED_DISABLED : aY0.LOCKED_HOVER) : (!this.g ? aY0.UNLOCKED_DISABLED : aY0.UNLOCKED_HOVER);
            this.c((int)this.n, (int)this.h, aY02.b(), aY02.a(), this.o, this.i);
        }
    }

    public qf_0(int n, int n2, int n3) {
        super(n, n2, n3, 20, 20, WY.a);
    }

    public boolean a() {
        return this.p;
    }
}


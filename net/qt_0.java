/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import deobf.MCInvoker;
import net.minecraft.client.Minecraft;

/*
 * Renamed from net.Qt
 */
public class qt_0
extends QG {
    private float s;
    private float r;
    private aj2 t;
    public boolean p;
    private float q = 1.0f;

    @Override
    protected void a(Minecraft minecraft, int n, int n2) {
        if (this.j) {
            if (this.p) {
                this.q = (float)((double)n - (this.n + 4.0)) / (float)(this.o - 8);
                this.q = MathHelper.b(this.q, 0.0f, 1.0f);
                float f = aDY.c(this.t, this.q);
                awu_1.a(minecraft.gameSettings, this.t, f);
                this.q = aDY.b(this.t, f);
                this.k = awu_1.a(minecraft.gameSettings, this.t);
            }
            TextureManagerInvoker.bindTexture(MCInvoker.E(minecraft), l);
            GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
            this.c((int)this.n + (int)(this.q * (float)(this.o - 8)), (int)this.h, 0, 66, 4, 20);
            this.c((int)this.n + (int)(this.q * (float)(this.o - 8)) + 4, (int)this.h, 196, 66, 4, 20);
        }
    }

    @Override
    public void a(int n, int n2) {
        this.p = false;
    }

    @Override
    protected int a(boolean bl) {
        return 0;
    }

    @Override
    public boolean b(Minecraft minecraft, int n, int n2) {
        if (super.b(minecraft, n, n2)) {
            this.q = (float)((double)n - (this.n + 4.0)) / (float)(this.o - 8);
            this.q = MathHelper.b(this.q, 0.0f, 1.0f);
            awu_1.a(minecraft.gameSettings, this.t, aDY.c(this.t, this.q));
            this.k = awu_1.a(minecraft.gameSettings, this.t);
            this.p = true;
            return true;
        }
        return false;
    }

    public qt_0(int n, int n2, int n3, aj2 aj22) {
        this(n, n2, n3, aj22, 0.0f, 1.0f);
    }

    public qt_0(int n, int n2, int n3, aj2 aj22, float f, float f2) {
        super(n, n2, n3, 150, 20, CO.a);
        this.t = aj22;
        this.r = f;
        this.s = f2;
        Minecraft minecraft = MCInvoker.f();
        this.q = aDY.b(aj22, awu_1.b(minecraft.gameSettings, aj22));
        this.k = awu_1.a(minecraft.gameSettings, aj22);
    }
}


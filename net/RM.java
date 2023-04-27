/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import deobf.MCInvoker;
import net.GuiContainer;
import net.ResourceLocation;
import net.aBO;
import net.aSK;
import net.aai_2;
import net.apw_0;
import net.arg_1;
import net.rs_1;

public class RM
extends GuiContainer {
    private static ResourceLocation ai = new ResourceLocation(arg_1.a);
    private rs_1 ak;
    private rs_1 aj;

    @Override
    protected void a(float f, int n, int n2) {
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
        TextureManagerInvoker.bindTexture(MCInvoker.E(this.t), ai);
        int n3 = (this.n - this.L) / 2;
        int n4 = (this.f - this.Y) / 2;
        this.c(n3, n4, 0, 0, this.L, this.Y);
    }

    public RM(aSK aSK2, rs_1 rs_12) {
        super(new aai_2(aSK2, rs_12, MCInvoker.f().player));
        this.ak = aSK2;
        this.aj = rs_12;
        this.Y = 133;
    }

    @Override
    protected void b(int n, int n2) {
        FontRendererInvoker.a(this.q, aBO.d(apw_0.e(this.aj)), 8.0f, 6.0f, 0x404040);
        FontRendererInvoker.a(this.q, aBO.d(apw_0.e(this.ak)), 8.0f, this.Y - 96 + 2, 0x404040);
    }
}


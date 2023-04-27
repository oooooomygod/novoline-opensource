/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui.inventory;

import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import deobf.MCInvoker;
import net.minecraft.block.BlockPos;

public class GuiCrafting
extends GuiContainer {
    private static ResourceLocation ai = new ResourceLocation(axu_1.b);

    public GuiCrafting(aSK aSK2, World world) {
        this(aSK2, world, BlockPos.m);
    }

    public GuiCrafting(aSK aSK2, World world, BlockPos blockPos) {
        super(new aa9_0(aSK2, world, blockPos));
    }

    @Override
    protected void b(int n, int n2) {
        FontRendererInvoker.a(this.q, I18n.format(axu_1.a, new Object[0]), 28.0f, 6.0f, 0x404040);
        FontRendererInvoker.a(this.q, I18n.format(axu_1.c, new Object[0]), 8.0f, this.Y - 96 + 2, 0x404040);
    }

    @Override
    protected void a(float f, int n, int n2) {
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
        TextureManagerInvoker.bindTexture(MCInvoker.E(this.t), ai);
        int n3 = (this.n - this.L) / 2;
        int n4 = (this.f - this.Y) / 2;
        this.c(n3, n4, 0, 0, this.L, this.Y);
    }
}


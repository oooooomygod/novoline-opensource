/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.TessellatorInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import cc.novoline.invoke.WorldRendererInvoker;
import deobf.DefaultVertexFormats;
import deobf.Entity;
import net.minecraft.block.BlockPos;
import net.minecraft.renderer.WorldRenderer;

/*
 * Renamed from net.mT
 */
public class mt_1
extends mi_1 {
    private int aA;
    private static ResourceLocation aC = new ResourceLocation(auz_2.a);
    private int aB;
    private TextureManager az;

    @Override
    public void onUpdate() {
        ++this.aA;
        if (this.aA == this.aB) {
            this.E();
        }
    }

    @Override
    public void a(WorldRenderer worldRenderer, Entity entity, float f, float f2, float f3, float f4, float f5, float f6) {
        float f7;
        float f8 = ((float)this.aA + f) / (float)this.aB;
        if ((f7 = 2.0f - (f8 *= f8) * 2.0f) > 1.0f) {
            f7 = 1.0f;
        }
        f7 *= 0.2f;
        GlStateManagerInvoker.disableLighting();
        float f9 = (float)(this.posX - aj);
        float f10 = (float)(this.posY - ap);
        float f11 = (float)(this.posZ - aw);
        float f12 = aV8.i(this.worldObj, new BlockPos(this));
        TextureManagerInvoker.bindTexture(this.az, aC);
        GlStateManagerInvoker.enableBlend();
        GlStateManagerInvoker.b(770, 771);
        WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.POSITION_TEX_COLOR);
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, f9 - 0.125f, f10, f11 + 0.125f), 0.0, 1.0), f12, f12, f12, f7));
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, f9 + 0.125f, f10, f11 + 0.125f), 1.0, 1.0), f12, f12, f12, f7));
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, f9 + 0.125f, f10, f11 - 0.125f), 1.0, 0.0), f12, f12, f12, f7));
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, f9 - 0.125f, f10, f11 - 0.125f), 0.0, 0.0), f12, f12, f12, f7));
        TessellatorInvoker.draw(TessellatorInvoker.getInstance());
        GlStateManagerInvoker.disableBlend();
        GlStateManagerInvoker.D();
    }

    protected mt_1(TextureManager textureManager, World world, double d, double d2, double d3) {
        super(world, d, d2, d3, 0.0, 0.0, 0.0);
        this.az = textureManager;
        this.motionZ = 0.0;
        this.motionY = 0.0;
        this.motionX = 0.0;
        this.aB = 200;
    }

    @Override
    public int f() {
        return 3;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.TessellatorInvoker;
import cc.novoline.invoke.WorldRendererInvoker;
import deobf.BlockRendererDispatcher;
import deobf.DefaultVertexFormats;
import deobf.MCInvoker;
import deobf.Tessellator;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.renderer.texture.TextureMap;
import net.minecraft.renderer.WorldRenderer;

/*
 * Renamed from net.jn
 */
public class jn_1
extends j7_0<oq_1> {
    public void a(oq_1 oq_12, double d, double d2, double d3, float f, float f2) {
        if (aei_0.b(oq_12) != null) {
            this.a(TextureMap.r);
            IBlockState iBlockState = aei_0.b(oq_12);
            Block block = BlockStateInvoker.getBlock(iBlockState);
            BlockPos blockPos = new BlockPos(oq_12);
            World world = aei_0.a(oq_12);
            if (iBlockState != aV8.q(world, blockPos) && BlocksInvoker.y(block) != -1 && BlocksInvoker.y(block) == 3) {
                GlStateManagerInvoker.pushMatrix();
                GlStateManagerInvoker.translate((float)d, (float)d2, (float)d3);
                GlStateManagerInvoker.disableLighting();
                Tessellator tessellator = TessellatorInvoker.getInstance();
                WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
                WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.g);
                int n = amv_2.j(blockPos);
                int n2 = amv_2.h(blockPos);
                int n3 = amv_2.i(blockPos);
                WorldRendererInvoker.b(worldRenderer, (double)((float)(-n) - 0.5f), (double)(-n2), (double)((float)(-n3) - 0.5f));
                BlockRendererDispatcher blockRendererDispatcher = MCInvoker.Y(MCInvoker.f());
                JE jE = xd_0.a(blockRendererDispatcher, iBlockState, world, null);
                mq_1.a(xd_0.b(blockRendererDispatcher), world, jE, iBlockState, blockPos, worldRenderer, false);
                WorldRendererInvoker.b(worldRenderer, 0.0, 0.0, 0.0);
                TessellatorInvoker.draw(tessellator);
                GlStateManagerInvoker.D();
                GlStateManagerInvoker.popMatrix();
                super.b(oq_12, d, d2, d3, f, f2);
            }
        }
    }

    @Override
    protected ResourceLocation a(oq_1 oq_12) {
        return TextureMap.r;
    }

    public jn_1(RenderManager renderManager) {
        super(renderManager);
        this.c = 0.5f;
    }
}


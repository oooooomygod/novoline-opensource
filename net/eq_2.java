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
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.DefaultVertexFormats;
import deobf.MCInvoker;
import deobf.Tessellator;
import net.minecraft.renderer.texture.TextureMap;
import net.minecraft.renderer.WorldRenderer;

/*
 * Renamed from net.eq
 */
public class eq_2
extends eg_0<a6e_0> {
    private BlockRendererDispatcher c = MCInvoker.Y(MCInvoker.f());

    @Override
    public void a(a6e_0 a6e_02, double d, double d2, double d3, float f, int n) {
        BlockPos blockPos = Ut.a(a6e_02);
        IBlockState iBlockState = Ut.f(a6e_02);
        Block block = BlockStateInvoker.getBlock(iBlockState);
        if (BlocksInvoker.getBlockState(block) != Material.air && Ut.b(a6e_02, f) < 1.0f) {
            Tessellator tessellator = TessellatorInvoker.getInstance();
            WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
            this.a(TextureMap.r);
            ne_0.e();
            GlStateManagerInvoker.b(770, 771);
            GlStateManagerInvoker.enableBlend();
            GlStateManagerInvoker.A();
            if (MCInvoker.b()) {
                GlStateManagerInvoker.shadeModel(7425);
            } else {
                GlStateManagerInvoker.shadeModel(7424);
            }
            WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.g);
            WorldRendererInvoker.b(worldRenderer, (double)((float)d - (float)amv_2.j(blockPos) + Ut.a(a6e_02, f)), (double)((float)d2 - (float)amv_2.h(blockPos) + Ut.d(a6e_02, f)), (double)((float)d3 - (float)amv_2.i(blockPos) + Ut.c(a6e_02, f)));
            World world = this.b();
            if (block == Blocks.bj && Ut.b(a6e_02, f) < 0.5f) {
                iBlockState = BlockStateInvoker.a(iBlockState, g8_0.Q, Boolean.TRUE);
                mq_1.a(xd_0.b(this.c), world, xd_0.a(this.c, iBlockState, world, blockPos), iBlockState, blockPos, worldRenderer, true);
            } else if (Ut.d(a6e_02) && !Ut.e(a6e_02)) {
                a04 a042 = block == Blocks.E ? a04.STICKY : a04.DEFAULT;
                IBlockState iBlockState2 = BlockStateInvoker.a(BlockStateInvoker.a(su_1.a(Blocks.bj), g8_0.P, (Comparable)((Object)a042)), g8_0.R, BlockStateInvoker.b(iBlockState, gi_2.R));
                iBlockState2 = BlockStateInvoker.a(iBlockState2, g8_0.Q, auk_2.b(Ut.b(a6e_02, f) >= 0.5f));
                mq_1.a(xd_0.b(this.c), world, xd_0.a(this.c, iBlockState2, world, blockPos), iBlockState2, blockPos, worldRenderer, true);
                WorldRendererInvoker.b(worldRenderer, (double)((float)d - (float)amv_2.j(blockPos)), (double)((float)d2 - (float)amv_2.h(blockPos)), (double)((float)d3 - (float)amv_2.i(blockPos)));
                BlockStateInvoker.a(iBlockState, gi_2.P, Boolean.TRUE);
                mq_1.a(xd_0.b(this.c), world, xd_0.a(this.c, iBlockState, world, blockPos), iBlockState, blockPos, worldRenderer, true);
            } else {
                mq_1.a(xd_0.b(this.c), world, xd_0.a(this.c, iBlockState, world, blockPos), iBlockState, blockPos, worldRenderer, false);
            }
            WorldRendererInvoker.b(worldRenderer, 0.0, 0.0, 0.0);
            TessellatorInvoker.draw(tessellator);
            ne_0.a();
        }
    }
}


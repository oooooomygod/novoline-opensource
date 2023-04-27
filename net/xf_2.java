/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import deobf.BlockRendererDispatcher;
import deobf.MCInvoker;
import deobf.OpenGlHelper;
import net.minecraft.renderer.texture.TextureMap;

/*
 * Renamed from net.xf
 */
public class xf_2
implements KB<nn_0> {
    private jn_0 a;

    @Override
    public void a(nn_0 nn_02, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        IBlockState iBlockState = aax_2.c(nn_02);
        if (BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(iBlockState)) != Material.air) {
            BlockRendererDispatcher blockRendererDispatcher = MCInvoker.Y(MCInvoker.f());
            GlStateManagerInvoker.c();
            GlStateManagerInvoker.pushMatrix();
            GlStateManagerInvoker.translate(0.0f, 0.6875f, -0.75f);
            GlStateManagerInvoker.b(20.0f, 1.0f, 0.0f, 0.0f);
            GlStateManagerInvoker.b(45.0f, 0.0f, 1.0f, 0.0f);
            GlStateManagerInvoker.translate(0.25f, 0.1875f, 0.25f);
            float f8 = 0.5f;
            GlStateManagerInvoker.c(-f8, -f8, f8);
            int n = aax_2.a(nn_02, f3);
            int n2 = n % 65536;
            int n3 = n / 65536;
            OpenGlHelper.a(apl_1.ab, (float)n2 / 1.0f, (float)n3 / 1.0f);
            GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
            aO4.a(this.a, TextureMap.r);
            xd_0.a(blockRendererDispatcher, iBlockState, 1.0f);
            GlStateManagerInvoker.popMatrix();
            GlStateManagerInvoker.y();
        }
    }

    @Override
    public boolean a() {
        return false;
    }

    public xf_2(jn_0 jn_02) {
        this.a = jn_02;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import deobf.BlockRendererDispatcher;
import net.minecraft.init.Blocks;
import deobf.MCInvoker;

/*
 * Renamed from net.j5
 */
public class j5_0
extends ju_1<o5_0> {
    public j5_0(RenderManager renderManager) {
        super(renderManager);
    }

    @Override
    protected void a(o5_0 o5_02, float f, IBlockState iBlockState) {
        int n = a9_.a(o5_02);
        if (n > -1 && (float)n - f + 1.0f < 10.0f) {
            float f2 = 1.0f - ((float)n - f + 1.0f) / 10.0f;
            f2 = MathHelper.b(f2, 0.0f, 1.0f);
            f2 *= f2;
            f2 *= f2;
            float f3 = 1.0f + f2 * 0.3f;
            GlStateManagerInvoker.c(f3, f3, f3);
        }
        super.a(o5_02, f, iBlockState);
        if (n > -1 && n / 5 % 2 == 0) {
            BlockRendererDispatcher blockRendererDispatcher = MCInvoker.Y(MCInvoker.f());
            GlStateManagerInvoker.disableTexture2D();
            GlStateManagerInvoker.disableLighting();
            GlStateManagerInvoker.enableBlend();
            GlStateManagerInvoker.b(770, 772);
            GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, (1.0f - ((float)n - f + 1.0f) / 100.0f) * 0.8f);
            GlStateManagerInvoker.pushMatrix();
            xd_0.a(blockRendererDispatcher, BlocksInvoker.t(Blocks.Y), 1.0f);
            GlStateManagerInvoker.popMatrix();
            GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
            GlStateManagerInvoker.disableBlend();
            GlStateManagerInvoker.D();
            GlStateManagerInvoker.enableTexture2D();
        }
    }
}


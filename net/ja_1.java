/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import deobf.BlockRendererDispatcher;
import net.minecraft.init.Blocks;
import deobf.MCInvoker;
import net.minecraft.renderer.texture.TextureMap;

/*
 * Renamed from net.jA
 */
public class ja_1
extends j7_0<od_1> {
    public void a(od_1 od_12, double d, double d2, double d3, float f, float f2) {
        float f3;
        BlockRendererDispatcher blockRendererDispatcher = MCInvoker.Y(MCInvoker.f());
        GlStateManagerInvoker.pushMatrix();
        GlStateManagerInvoker.translate((float)d, (float)d2 + 0.5f, (float)d3);
        if ((float)od_12.ak - f2 + 1.0f < 10.0f) {
            f3 = 1.0f - ((float)od_12.ak - f2 + 1.0f) / 10.0f;
            f3 = MathHelper.b(f3, 0.0f, 1.0f);
            f3 *= f3;
            f3 *= f3;
            float f4 = 1.0f + f3 * 0.3f;
            GlStateManagerInvoker.c(f4, f4, f4);
        }
        f3 = (1.0f - ((float)od_12.ak - f2 + 1.0f) / 100.0f) * 0.8f;
        this.b(od_12);
        GlStateManagerInvoker.translate(-0.5f, -0.5f, 0.5f);
        xd_0.a(blockRendererDispatcher, BlocksInvoker.t(Blocks.Y), B.a(od_12, f2));
        GlStateManagerInvoker.translate(0.0f, 0.0f, 1.0f);
        if (od_12.ak / 5 % 2 == 0) {
            GlStateManagerInvoker.disableTexture2D();
            GlStateManagerInvoker.disableLighting();
            GlStateManagerInvoker.enableBlend();
            GlStateManagerInvoker.b(770, 772);
            GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, f3);
            GlStateManagerInvoker.a(-3.0f, -3.0f);
            GlStateManagerInvoker.u();
            xd_0.a(blockRendererDispatcher, BlocksInvoker.t(Blocks.Y), 1.0f);
            GlStateManagerInvoker.a(0.0f, 0.0f);
            GlStateManagerInvoker.r();
            GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
            GlStateManagerInvoker.disableBlend();
            GlStateManagerInvoker.D();
            GlStateManagerInvoker.enableTexture2D();
        }
        GlStateManagerInvoker.popMatrix();
        super.b(od_12, d, d2, d3, f, f2);
    }

    public ja_1(RenderManager renderManager) {
        super(renderManager);
        this.c = 0.5f;
    }

    @Override
    protected ResourceLocation a(od_1 od_12) {
        return TextureMap.r;
    }
}


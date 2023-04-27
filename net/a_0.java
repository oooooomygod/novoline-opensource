/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import deobf.BlockRendererDispatcher;
import net.minecraft.init.Blocks;
import deobf.MCInvoker;
import net.minecraft.renderer.texture.TextureMap;

/*
 * Renamed from net.a
 */
public class a_0
implements KB<nr_1> {
    private jm_2 a;

    public a_0(jm_2 jm_22) {
        this.a = jm_22;
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public void a(nr_1 nr_12, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        if (!sq_1.b(nr_12) && !sq_1.a(nr_12)) {
            BlockRendererDispatcher blockRendererDispatcher = MCInvoker.Y(MCInvoker.f());
            aXL.a(this.a, TextureMap.r);
            GlStateManagerInvoker.b();
            GlStateManagerInvoker.cullFace(1028);
            GlStateManagerInvoker.pushMatrix();
            GlStateManagerInvoker.c(1.0f, -1.0f, 1.0f);
            GlStateManagerInvoker.translate(0.2f, 0.35f, 0.5f);
            GlStateManagerInvoker.b(42.0f, 0.0f, 1.0f, 0.0f);
            GlStateManagerInvoker.pushMatrix();
            GlStateManagerInvoker.translate(-0.5f, -0.5f, 0.5f);
            xd_0.a(blockRendererDispatcher, a6_0.a(Blocks.bn), 1.0f);
            GlStateManagerInvoker.popMatrix();
            GlStateManagerInvoker.pushMatrix();
            GlStateManagerInvoker.translate(0.1f, 0.0f, -0.6f);
            GlStateManagerInvoker.b(42.0f, 0.0f, 1.0f, 0.0f);
            GlStateManagerInvoker.translate(-0.5f, -0.5f, 0.5f);
            xd_0.a(blockRendererDispatcher, a6_0.a(Blocks.bn), 1.0f);
            GlStateManagerInvoker.popMatrix();
            GlStateManagerInvoker.popMatrix();
            GlStateManagerInvoker.pushMatrix();
            up_0.a(((rg_1)aXL.a((jm_2)this.a)).m, 0.0625f);
            GlStateManagerInvoker.c(1.0f, -1.0f, 1.0f);
            GlStateManagerInvoker.translate(0.0f, 0.7f, -0.2f);
            GlStateManagerInvoker.b(12.0f, 0.0f, 1.0f, 0.0f);
            GlStateManagerInvoker.translate(-0.5f, -0.5f, 0.5f);
            xd_0.a(blockRendererDispatcher, a6_0.a(Blocks.bn), 1.0f);
            GlStateManagerInvoker.popMatrix();
            GlStateManagerInvoker.cullFace(1029);
            GlStateManagerInvoker.A();
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.TessellatorInvoker;
import cc.novoline.invoke.WorldRendererInvoker;
import deobf.DefaultVertexFormats;
import deobf.MCInvoker;
import deobf.Tessellator;
import net.minecraft.renderer.texture.TextureMap;
import net.minecraft.renderer.WorldRenderer;

/*
 * Renamed from net.jo
 */
public class jo_1
extends j7_0<oa_1> {
    private float e;

    @Override
    protected ResourceLocation a(oa_1 oa_12) {
        return TextureMap.r;
    }

    public jo_1(RenderManager renderManager, float f) {
        super(renderManager);
        this.e = f;
    }

    public void a(oa_1 oa_12, double d, double d2, double d3, float f, float f2) {
        GlStateManagerInvoker.pushMatrix();
        this.b(oa_12);
        GlStateManagerInvoker.translate((float)d, (float)d2, (float)d3);
        GlStateManagerInvoker.c();
        GlStateManagerInvoker.c(this.e, this.e, this.e);
        KM kM = aPL.a(DU.a(MCInvoker.A(MCInvoker.f())), Items.fire_charge);
        Tessellator tessellator = TessellatorInvoker.getInstance();
        WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
        float f3 = qg_2.a(kM);
        float f4 = qg_2.m(kM);
        float f5 = qg_2.f(kM);
        float f6 = qg_2.k(kM);
        GlStateManagerInvoker.b(180.0f - this.a.l, 0.0f, 1.0f, 0.0f);
        GlStateManagerInvoker.b(-this.a.b, 1.0f, 0.0f, 0.0f);
        WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.i);
        WorldRendererInvoker.pos(WorldRendererInvoker.d(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, -0.5, -0.25, 0.0), f3, f6), 0.0f, 1.0f, 0.0f));
        WorldRendererInvoker.pos(WorldRendererInvoker.d(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, 0.5, -0.25, 0.0), f4, f6), 0.0f, 1.0f, 0.0f));
        WorldRendererInvoker.pos(WorldRendererInvoker.d(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, 0.5, 0.75, 0.0), f4, f5), 0.0f, 1.0f, 0.0f));
        WorldRendererInvoker.pos(WorldRendererInvoker.d(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, -0.5, 0.75, 0.0), f3, f5), 0.0f, 1.0f, 0.0f));
        TessellatorInvoker.draw(tessellator);
        GlStateManagerInvoker.y();
        GlStateManagerInvoker.popMatrix();
        super.b(oa_12, d, d2, d3, f, f2);
    }
}


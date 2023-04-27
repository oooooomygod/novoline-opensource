/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.TessellatorInvoker;
import cc.novoline.invoke.WorldRendererInvoker;
import deobf.DefaultVertexFormats;
import deobf.Tessellator;
import net.minecraft.renderer.WorldRenderer;
import java.util.Iterator;
import java.util.List;

import org.lwjgl.opengl.GL11;

/*
 * Renamed from net.eO
 */
public class eo_1
extends eg_0<a6G> {
    private static ResourceLocation c = new ResourceLocation(OM.a);

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public void a(a6G a6G2, double d, double d2, double d3, float f, int n) {
        float f2 = IT.b(a6G2);
        GlStateManagerInvoker.alphaFunc(516, 0.1f);
        if (f2 > 0.0f) {
            Tessellator tessellator = TessellatorInvoker.getInstance();
            WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
            GlStateManagerInvoker.disableFog();
            List list = IT.a(a6G2);
            int n2 = 0;
            Iterator iterator = ListInvoker.iterator(list);
            while (dz_0.c(iterator)) {
                adx_0 adx_02 = (adx_0)dz_0.b(iterator);
                int n3 = n2 + aUF.b(adx_02);
                this.a(c);
                GL11.glTexParameterf((int)3553, (int)10242, (float)10497.0f);
                GL11.glTexParameterf((int)3553, (int)10243, (float)10497.0f);
                GlStateManagerInvoker.disableLighting();
                GlStateManagerInvoker.A();
                GlStateManagerInvoker.disableBlend();
                GlStateManagerInvoker.c(true);
                GlStateManagerInvoker.b(770, 1, 1, 0);
                double d4 = (double)aV8.d(a6G2.b()) + (double)f;
                double d5 = MathHelper.d(-d4 * 0.2 - (double)MathHelper.floor_double(-d4 * 0.1));
                float f3 = aUF.a(adx_02)[0];
                float f4 = aUF.a(adx_02)[1];
                float f5 = aUF.a(adx_02)[2];
                double d6 = d4 * 0.025 * -1.5;
                double d7 = 0.5 + (double)MathHelper.b(d6 + 2.356194490192345) * 0.2;
                double d8 = 0.5 + (double)MathHelper.h(d6 + 2.356194490192345) * 0.2;
                double d9 = 0.5 + (double)MathHelper.b(d6 + 0.7853981633974483) * 0.2;
                double d10 = 0.5 + (double)MathHelper.h(d6 + 0.7853981633974483) * 0.2;
                double d11 = 0.5 + (double)MathHelper.b(d6 + 3.9269908169872414) * 0.2;
                double d12 = 0.5 + (double)MathHelper.h(d6 + 3.9269908169872414) * 0.2;
                double d13 = 0.5 + (double)MathHelper.b(d6 + 5.497787143782138) * 0.2;
                double d14 = 0.5 + (double)MathHelper.h(d6 + 5.497787143782138) * 0.2;
                double d15 = -1.0 + d5;
                double d16 = (double)((float)aUF.b(adx_02) * f2) * 2.5 + d15;
                WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.POSITION_TEX_COLOR);
                WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d + d7, d2 + (double)n3, d3 + d8), 1.0, d16), f3, f4, f5, 1.0f));
                WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d + d7, d2 + (double)n2, d3 + d8), 1.0, d15), f3, f4, f5, 1.0f));
                WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d + d9, d2 + (double)n2, d3 + d10), 0.0, d15), f3, f4, f5, 1.0f));
                WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d + d9, d2 + (double)n3, d3 + d10), 0.0, d16), f3, f4, f5, 1.0f));
                WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d + d13, d2 + (double)n3, d3 + d14), 1.0, d16), f3, f4, f5, 1.0f));
                WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d + d13, d2 + (double)n2, d3 + d14), 1.0, d15), f3, f4, f5, 1.0f));
                WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d + d11, d2 + (double)n2, d3 + d12), 0.0, d15), f3, f4, f5, 1.0f));
                WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d + d11, d2 + (double)n3, d3 + d12), 0.0, d16), f3, f4, f5, 1.0f));
                WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d + d9, d2 + (double)n3, d3 + d10), 1.0, d16), f3, f4, f5, 1.0f));
                WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d + d9, d2 + (double)n2, d3 + d10), 1.0, d15), f3, f4, f5, 1.0f));
                WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d + d13, d2 + (double)n2, d3 + d14), 0.0, d15), f3, f4, f5, 1.0f));
                WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d + d13, d2 + (double)n3, d3 + d14), 0.0, d16), f3, f4, f5, 1.0f));
                WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d + d11, d2 + (double)n3, d3 + d12), 1.0, d16), f3, f4, f5, 1.0f));
                WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d + d11, d2 + (double)n2, d3 + d12), 1.0, d15), f3, f4, f5, 1.0f));
                WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d + d7, d2 + (double)n2, d3 + d8), 0.0, d15), f3, f4, f5, 1.0f));
                WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d + d7, d2 + (double)n3, d3 + d8), 0.0, d16), f3, f4, f5, 1.0f));
                TessellatorInvoker.draw(tessellator);
                GlStateManagerInvoker.enableBlend();
                GlStateManagerInvoker.b(770, 771, 1, 0);
                GlStateManagerInvoker.c(false);
                double d17 = -1.0 + d5;
                double d18 = (double)((float)aUF.b(adx_02) * f2) + d17;
                WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.POSITION_TEX_COLOR);
                WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d + 0.2, d2 + (double)n3, d3 + 0.2), 1.0, d18), f3, f4, f5, 0.125f));
                WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d + 0.2, d2 + (double)n2, d3 + 0.2), 1.0, d17), f3, f4, f5, 0.125f));
                WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d + 0.8, d2 + (double)n2, d3 + 0.2), 0.0, d17), f3, f4, f5, 0.125f));
                WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d + 0.8, d2 + (double)n3, d3 + 0.2), 0.0, d18), f3, f4, f5, 0.125f));
                WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d + 0.8, d2 + (double)n3, d3 + 0.8), 1.0, d18), f3, f4, f5, 0.125f));
                WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d + 0.8, d2 + (double)n2, d3 + 0.8), 1.0, d17), f3, f4, f5, 0.125f));
                WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d + 0.2, d2 + (double)n2, d3 + 0.8), 0.0, d17), f3, f4, f5, 0.125f));
                WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d + 0.2, d2 + (double)n3, d3 + 0.8), 0.0, d18), f3, f4, f5, 0.125f));
                WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d + 0.8, d2 + (double)n3, d3 + 0.2), 1.0, d18), f3, f4, f5, 0.125f));
                WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d + 0.8, d2 + (double)n2, d3 + 0.2), 1.0, d17), f3, f4, f5, 0.125f));
                WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d + 0.8, d2 + (double)n2, d3 + 0.8), 0.0, d17), f3, f4, f5, 0.125f));
                WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d + 0.8, d2 + (double)n3, d3 + 0.8), 0.0, d18), f3, f4, f5, 0.125f));
                WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d + 0.2, d2 + (double)n3, d3 + 0.8), 1.0, d18), f3, f4, f5, 0.125f));
                WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d + 0.2, d2 + (double)n2, d3 + 0.8), 1.0, d17), f3, f4, f5, 0.125f));
                WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d + 0.2, d2 + (double)n2, d3 + 0.2), 0.0, d17), f3, f4, f5, 0.125f));
                WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d + 0.2, d2 + (double)n3, d3 + 0.2), 0.0, d18), f3, f4, f5, 0.125f));
                TessellatorInvoker.draw(tessellator);
                GlStateManagerInvoker.D();
                GlStateManagerInvoker.enableTexture2D();
                GlStateManagerInvoker.c(true);
                n2 = n3;
            }
            GlStateManagerInvoker.z();
        }
    }
}


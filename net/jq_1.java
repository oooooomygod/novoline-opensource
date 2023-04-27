/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.TessellatorInvoker;
import cc.novoline.invoke.WorldRendererInvoker;
import deobf.DefaultVertexFormats;
import deobf.EntityArrow;
import deobf.Tessellator;
import net.minecraft.renderer.WorldRenderer;
import org.lwjgl.opengl.GL11;

/*
 * Renamed from net.jQ
 */
public class jq_1
extends j7_0<EntityArrow> {
    private static ResourceLocation e = new ResourceLocation(aP_.a);

    public jq_1(RenderManager renderManager) {
        super(renderManager);
    }

    public void a(EntityArrow entityArrow, double d, double d2, double d3, float f, float f2) {
        this.b(entityArrow);
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManagerInvoker.pushMatrix();
        GlStateManagerInvoker.translate((float)d, (float)d2, (float)d3);
        GlStateManagerInvoker.b(entityArrow.prevRotationYaw + (entityArrow.rotationYaw - entityArrow.prevRotationYaw) * f2 - 90.0f, 0.0f, 1.0f, 0.0f);
        GlStateManagerInvoker.b(entityArrow.prevRotationPitch + (entityArrow.rotationPitch - entityArrow.prevRotationPitch) * f2, 0.0f, 0.0f, 1.0f);
        Tessellator tessellator = TessellatorInvoker.getInstance();
        WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
        int n = 0;
        float f3 = 0.0f;
        float f4 = 0.5f;
        float f5 = (float)(0 + n * 10) / 32.0f;
        float f6 = (float)(5 + n * 10) / 32.0f;
        float f7 = 0.0f;
        float f8 = 0.15625f;
        float f9 = (float)(5 + n * 10) / 32.0f;
        float f10 = (float)(10 + n * 10) / 32.0f;
        float f11 = 0.05625f;
        GlStateManagerInvoker.c();
        float f12 = (float)entityArrow.aq - f2;
        if (f12 > 0.0f) {
            float f13 = -MathHelper.sin(f12 * 3.0f) * f12;
            GlStateManagerInvoker.b(f13, 0.0f, 0.0f, 1.0f);
        }
        GlStateManagerInvoker.b(45.0f, 1.0f, 0.0f, 0.0f);
        GlStateManagerInvoker.c(f11, f11, f11);
        GlStateManagerInvoker.translate(-4.0f, 0.0f, 0.0f);
        GL11.glNormal3f((float)f11, (float)0.0f, (float)0.0f);
        WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.a);
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, -7.0, -2.0, -2.0), f7, f9));
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, -7.0, -2.0, 2.0), f8, f9));
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, -7.0, 2.0, 2.0), f8, f10));
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, -7.0, 2.0, -2.0), f7, f10));
        TessellatorInvoker.draw(tessellator);
        GL11.glNormal3f((float)(-f11), (float)0.0f, (float)0.0f);
        WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.a);
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, -7.0, 2.0, -2.0), f7, f9));
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, -7.0, 2.0, 2.0), f8, f9));
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, -7.0, -2.0, 2.0), f8, f10));
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, -7.0, -2.0, -2.0), f7, f10));
        TessellatorInvoker.draw(tessellator);
        int n2 = 0;
        while (true) {
            GlStateManagerInvoker.b(90.0f, 1.0f, 0.0f, 0.0f);
            GL11.glNormal3f((float)0.0f, (float)0.0f, (float)f11);
            WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.a);
            WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, -8.0, -2.0, 0.0), f3, f5));
            WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, 8.0, -2.0, 0.0), f4, f5));
            WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, 8.0, 2.0, 0.0), f4, f6));
            WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, -8.0, 2.0, 0.0), f3, f6));
            TessellatorInvoker.draw(tessellator);
            ++n2;
        }
    }

    @Override
    protected ResourceLocation a(EntityArrow entityArrow) {
        return e;
    }
}


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
import deobf.Vec3;
import net.minecraft.renderer.WorldRenderer;

/*
 * Renamed from net.jk
 */
public class jk_1
extends j7_0<oo_1> {
    private static ResourceLocation e = new ResourceLocation(OX.a);

    @Override
    protected ResourceLocation a(oo_1 oo_12) {
        return e;
    }

    public jk_1(RenderManager renderManager) {
        super(renderManager);
    }

    public void a(oo_1 oo_12, double d, double d2, double d3, float f, float f2) {
        GlStateManagerInvoker.pushMatrix();
        GlStateManagerInvoker.translate((float)d, (float)d2, (float)d3);
        GlStateManagerInvoker.c();
        GlStateManagerInvoker.c(0.5f, 0.5f, 0.5f);
        this.b(oo_12);
        Tessellator tessellator = TessellatorInvoker.getInstance();
        WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
        GlStateManagerInvoker.b(180.0f - this.a.l, 0.0f, 1.0f, 0.0f);
        GlStateManagerInvoker.b(-this.a.b, 1.0f, 0.0f, 0.0f);
        WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.i);
        WorldRendererInvoker.pos(WorldRendererInvoker.d(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, -0.5, -0.5, 0.0), 0.0625, 0.1875), 0.0f, 1.0f, 0.0f));
        WorldRendererInvoker.pos(WorldRendererInvoker.d(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, 0.5, -0.5, 0.0), 0.125, 0.1875), 0.0f, 1.0f, 0.0f));
        WorldRendererInvoker.pos(WorldRendererInvoker.d(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, 0.5, 0.5, 0.0), 0.125, 0.125), 0.0f, 1.0f, 0.0f));
        WorldRendererInvoker.pos(WorldRendererInvoker.d(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, -0.5, 0.5, 0.0), 0.0625, 0.125), 0.0f, 1.0f, 0.0f));
        TessellatorInvoker.draw(tessellator);
        GlStateManagerInvoker.y();
        GlStateManagerInvoker.popMatrix();
        if (oo_12.ax != null) {
            float f3 = a6w_0.b(oo_12.ax, f2);
            float f4 = MathHelper.sin(MathHelper.g(f3) * (float)Math.PI);
            Vec3 vec3 = new Vec3(-0.36, 0.03, 0.35);
            vec3 = aNE.b(vec3, -(oo_12.ax.prevRotationPitch + (oo_12.ax.rotationPitch - oo_12.ax.prevRotationPitch) * f2) * (float)Math.PI / 180.0f);
            vec3 = aNE.a(vec3, -(oo_12.ax.prevRotationYaw + (oo_12.ax.rotationYaw - oo_12.ax.prevRotationYaw) * f2) * (float)Math.PI / 180.0f);
            vec3 = aNE.a(vec3, f4 * 0.5f);
            vec3 = aNE.b(vec3, -f4 * 0.7f);
            double d4 = oo_12.ax.prevPosX + (oo_12.ax.posX - oo_12.ax.prevPosX) * (double)f2 + vec3.xCoord;
            double d5 = oo_12.ax.prevPosY + (oo_12.ax.posY - oo_12.ax.prevPosY) * (double)f2 + vec3.yCoord;
            double d6 = oo_12.ax.prevPosZ + (oo_12.ax.posZ - oo_12.ax.prevPosZ) * (double)f2 + vec3.zCoord;
            double d7 = a6w_0.q(oo_12.ax);
            if (this.a.u != null && awu_1.f(this.a.u) > 0 || oo_12.ax != MCInvoker.f().player) {
                float f5 = (oo_12.ax.ay + (oo_12.ax.aD - oo_12.ax.ay) * f2) * (float)Math.PI / 180.0f;
                double d8 = MathHelper.sin(f5);
                double d9 = MathHelper.cos(f5);
                d4 = oo_12.ax.prevPosX + (oo_12.ax.posX - oo_12.ax.prevPosX) * (double)f2 - d9 * 0.35 - d8 * 0.8;
                d5 = oo_12.ax.prevPosY + d7 + (oo_12.ax.posY - oo_12.ax.prevPosY) * (double)f2 - 0.45;
                d6 = oo_12.ax.prevPosZ + (oo_12.ax.posZ - oo_12.ax.prevPosZ) * (double)f2 - d8 * 0.35 + d9 * 0.8;
                d7 = a6w_0.N(oo_12.ax) ? -0.1875 : 0.0;
            }
            double d10 = oo_12.prevPosX + (oo_12.posX - oo_12.prevPosX) * (double)f2;
            double d11 = oo_12.prevPosY + (oo_12.posY - oo_12.prevPosY) * (double)f2 + 0.25;
            double d12 = oo_12.prevPosZ + (oo_12.posZ - oo_12.prevPosZ) * (double)f2;
            double d13 = (float)(d4 - d10);
            double d14 = (double)((float)(d5 - d11)) + d7;
            double d15 = (float)(d6 - d12);
            GlStateManagerInvoker.disableTexture2D();
            GlStateManagerInvoker.disableLighting();
            WorldRendererInvoker.begin(worldRenderer, 3, DefaultVertexFormats.d);
            int n = 0;
            while (true) {
                float f6 = (float)n / 16.0f;
                WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, d + d13 * (double)f6, d2 + d14 * (double)(f6 * f6 + f6) * 0.5 + 0.25, d3 + d15 * (double)f6), 0, 0, 0, 255));
                ++n;
            }
        }
    }
}


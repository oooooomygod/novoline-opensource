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
import net.minecraft.renderer.WorldRenderer;
import java.nio.FloatBuffer;
import java.util.Random;

/*
 * Renamed from net.eZ
 */
public class ez_1
extends eg_0<a6a_0> {
    FloatBuffer c = N4.d(16);
    private static Random e;
    private static ResourceLocation f;
    private static ResourceLocation d;

    @Override
    public void a(a6a_0 a6a_02, double d, double d2, double d3, float f, int n) {
        float f2 = (float)this.b.f;
        float f3 = (float)this.b.e;
        float f4 = (float)this.b.k;
        GlStateManagerInvoker.disableLighting();
        a5_0.a(e, 31100L);
        float f5 = 0.75f;
        int n2 = 0;
        while (true) {
            GlStateManagerInvoker.pushMatrix();
            float f6 = 16 - n2;
            float f7 = 0.0625f;
            float f8 = 1.0f / (f6 + 1.0f);
            this.a(ez_1.d);
            f8 = 0.1f;
            f6 = 65.0f;
            f7 = 0.125f;
            GlStateManagerInvoker.enableBlend();
            GlStateManagerInvoker.b(770, 771);
            float f9 = (float)(-(d2 + (double)f5));
            float f10 = f9 + (float)aIH.f().yCoord;
            float f11 = f9 + f6 + (float)aIH.f().yCoord;
            float f12 = f10 / f11;
            f12 = (float)(d2 + (double)f5) + f12;
            GlStateManagerInvoker.translate(f2, f12, f4);
            GlStateManagerInvoker.a(ajH.S, 9217);
            GlStateManagerInvoker.a(ajH.T, 9217);
            GlStateManagerInvoker.a(ajH.R, 9217);
            GlStateManagerInvoker.a(ajH.Q, 9216);
            GlStateManagerInvoker.a(ajH.S, 9473, this.a(1.0f, 0.0f, 0.0f, 0.0f));
            GlStateManagerInvoker.a(ajH.T, 9473, this.a(0.0f, 0.0f, 1.0f, 0.0f));
            GlStateManagerInvoker.a(ajH.R, 9473, this.a(0.0f, 0.0f, 0.0f, 1.0f));
            GlStateManagerInvoker.a(ajH.Q, 9474, this.a(0.0f, 1.0f, 0.0f, 0.0f));
            GlStateManagerInvoker.b(ajH.S);
            GlStateManagerInvoker.b(ajH.T);
            GlStateManagerInvoker.b(ajH.R);
            GlStateManagerInvoker.b(ajH.Q);
            GlStateManagerInvoker.popMatrix();
            GlStateManagerInvoker.matrixMode(5890);
            GlStateManagerInvoker.pushMatrix();
            GlStateManagerInvoker.loadIdentity();
            GlStateManagerInvoker.translate(0.0f, (float)(MCInvoker.a() % 700000L) / 700000.0f, 0.0f);
            GlStateManagerInvoker.c(f7, f7, f7);
            GlStateManagerInvoker.translate(0.5f, 0.5f, 0.0f);
            GlStateManagerInvoker.b((float)(n2 * n2 * 4321 + n2 * 9) * 2.0f, 0.0f, 0.0f, 1.0f);
            GlStateManagerInvoker.translate(-0.5f, -0.5f, 0.0f);
            GlStateManagerInvoker.translate(-f2, -f4, -f3);
            f10 = f9 + (float)aIH.f().yCoord;
            GlStateManagerInvoker.translate((float)aIH.f().xCoord * f6 / f10, (float)aIH.f().zCoord * f6 / f10, -f3);
            Tessellator tessellator = TessellatorInvoker.getInstance();
            WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
            WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.d);
            float f13 = (a5_0.e(e) * 0.5f + 0.1f) * f8;
            float f14 = (a5_0.e(e) * 0.5f + 0.4f) * f8;
            float f15 = (a5_0.e(e) * 0.5f + 0.5f) * f8;
            f14 = f15 = 1.0f * f8;
            f13 = f15;
            WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.endVertex(worldRenderer, d, d2 + (double)f5, d3), f13, f14, f15, 1.0f));
            WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.endVertex(worldRenderer, d, d2 + (double)f5, d3 + 1.0), f13, f14, f15, 1.0f));
            WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.endVertex(worldRenderer, d + 1.0, d2 + (double)f5, d3 + 1.0), f13, f14, f15, 1.0f));
            WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.endVertex(worldRenderer, d + 1.0, d2 + (double)f5, d3), f13, f14, f15, 1.0f));
            TessellatorInvoker.draw(tessellator);
            GlStateManagerInvoker.popMatrix();
            GlStateManagerInvoker.matrixMode(5888);
            this.a(ez_1.d);
            ++n2;
        }
    }

    private FloatBuffer a(float f, float f2, float f3, float f4) {
        aHB.a(this.c);
        aHB.a(aHB.a(aHB.a(aHB.a(this.c, f), f2), f3), f4);
        aHB.b(this.c);
        return this.c;
    }

    static {
        d = new ResourceLocation(apb_0.a);
        f = new ResourceLocation(apb_0.b);
        e = new Random(31100L);
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.TessellatorInvoker;
import cc.novoline.invoke.WorldRendererInvoker;
import deobf.DefaultVertexFormats;
import deobf.Tessellator;
import net.minecraft.renderer.WorldRenderer;
import java.util.Random;

/*
 * Renamed from net.va
 */
public class va_1
implements KB<ns_2> {
    @Override
    public void a(ns_2 ns_22, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        if (ns_22.bE > 0) {
            Tessellator tessellator = TessellatorInvoker.getInstance();
            WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
            ne_0.e();
            float f8 = ((float)ns_22.bE + f3) / 200.0f;
            float f9 = 0.0f;
            if (f8 > 0.8f) {
                f9 = (f8 - 0.8f) / 0.2f;
            }
            Random random = new Random(432L);
            GlStateManagerInvoker.disableTexture2D();
            GlStateManagerInvoker.shadeModel(7425);
            GlStateManagerInvoker.enableBlend();
            GlStateManagerInvoker.b(770, 1);
            GlStateManagerInvoker.C();
            GlStateManagerInvoker.b();
            GlStateManagerInvoker.c(false);
            GlStateManagerInvoker.pushMatrix();
            GlStateManagerInvoker.translate(0.0f, -1.0f, -2.0f);
            int n = 0;
            while ((float)n < (f8 + f8 * f8) / 2.0f * 60.0f) {
                GlStateManagerInvoker.b(a5_0.e(random) * 360.0f, 1.0f, 0.0f, 0.0f);
                GlStateManagerInvoker.b(a5_0.e(random) * 360.0f, 0.0f, 1.0f, 0.0f);
                GlStateManagerInvoker.b(a5_0.e(random) * 360.0f, 0.0f, 0.0f, 1.0f);
                GlStateManagerInvoker.b(a5_0.e(random) * 360.0f, 1.0f, 0.0f, 0.0f);
                GlStateManagerInvoker.b(a5_0.e(random) * 360.0f, 0.0f, 1.0f, 0.0f);
                GlStateManagerInvoker.b(a5_0.e(random) * 360.0f + f8 * 90.0f, 0.0f, 0.0f, 1.0f);
                float f10 = a5_0.e(random) * 20.0f + 5.0f + f9 * 10.0f;
                float f11 = a5_0.e(random) * 2.0f + 1.0f + f9 * 2.0f;
                WorldRendererInvoker.begin(worldRenderer, 6, DefaultVertexFormats.d);
                WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, 0.0, 0.0, 0.0), 255, 255, 255, (int)(255.0f * (1.0f - f9))));
                WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, -0.866 * (double)f11, f10, -0.5f * f11), 255, 0, 255, 0));
                WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, 0.866 * (double)f11, f10, -0.5f * f11), 255, 0, 255, 0));
                WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, 0.0, f10, 1.0f * f11), 255, 0, 255, 0));
                WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, -0.866 * (double)f11, f10, -0.5f * f11), 255, 0, 255, 0));
                TessellatorInvoker.draw(tessellator);
                ++n;
            }
            GlStateManagerInvoker.popMatrix();
            GlStateManagerInvoker.c(true);
            GlStateManagerInvoker.A();
            GlStateManagerInvoker.disableBlend();
            GlStateManagerInvoker.shadeModel(7424);
            GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
            GlStateManagerInvoker.enableTexture2D();
            GlStateManagerInvoker.enableAlpha();
            ne_0.a();
        }
    }

    @Override
    public boolean a() {
        return false;
    }
}


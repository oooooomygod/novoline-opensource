/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.client.gui;

import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.TessellatorInvoker;
import cc.novoline.invoke.WorldRendererInvoker;
import deobf.DefaultVertexFormats;
import deobf.FontRenderer;
import deobf.Tessellator;
import net.minecraft.renderer.WorldRenderer;

public class Gui {
    protected static float zLevel;
    public static ResourceLocation a;
    public static ResourceLocation d;
    public static ResourceLocation e;
    public static boolean b;

    public static void a(int n, int n2, int n3, int n4, int n5, int n6) {
        float f = 0.00390625f;
        float f2 = 0.00390625f;
        Tessellator tessellator = TessellatorInvoker.getInstance();
        WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
        WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.a);
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n, n2 + n6, zLevel), (float)n3 * f, (float)(n4 + n6) * f2));
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n + n5, n2 + n6, zLevel), (float)(n3 + n5) * f, (float)(n4 + n6) * f2));
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n + n5, n2, zLevel), (float)(n3 + n5) * f, (float)n4 * f2));
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n, n2, zLevel), (float)n3 * f, (float)n4 * f2));
        TessellatorInvoker.draw(tessellator);
    }

    public void a(float f, float f2, int n, int n2, int n3, int n4) {
        float f3 = 0.00390625f;
        float f4 = 0.00390625f;
        Tessellator tessellator = TessellatorInvoker.getInstance();
        WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
        WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.a);
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, f + 0.0f, f2 + (float)n4, zLevel), (float)n * f3, (float)(n2 + n4) * f4));
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, f + (float)n3, f2 + (float)n4, zLevel), (float)(n + n3) * f3, (float)(n2 + n4) * f4));
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, f + (float)n3, f2 + 0.0f, zLevel), (float)(n + n3) * f3, (float)n2 * f4));
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, f + 0.0f, f2 + 0.0f, zLevel), (float)n * f3, (float)n2 * f4));
        TessellatorInvoker.draw(tessellator);
    }

    public static void a(int n, int n2, float f, float f2, int n3, int n4, int n5, int n6, float f3, float f4) {
        float f5 = 1.0f / f3;
        float f6 = 1.0f / f4;
        Tessellator tessellator = TessellatorInvoker.getInstance();
        WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
        WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.a);
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n, n2 + n6, 0.0), f * f5, (f2 + (float)n4) * f6));
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n + n5, n2 + n6, 0.0), (f + (float)n3) * f5, (f2 + (float)n4) * f6));
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n + n5, n2, 0.0), (f + (float)n3) * f5, f2 * f6));
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n, n2, 0.0), f * f5, f2 * f6));
        TessellatorInvoker.draw(tessellator);
    }

    public static void b(double d, double d2, double d3, double d4, int n) {
        double d5;
        if (d < d3) {
            d5 = d;
            d = d3;
            d3 = d5;
        }
        if (d2 < d4) {
            d5 = d2;
            d2 = d4;
            d4 = d5;
        }
        float f = (float)(n >> 24 & 0xFF) / 255.0f;
        float f2 = (float)(n >> 16 & 0xFF) / 255.0f;
        float f3 = (float)(n >> 8 & 0xFF) / 255.0f;
        float f4 = (float)(n & 0xFF) / 255.0f;
        Tessellator tessellator = TessellatorInvoker.getInstance();
        WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
        GlStateManagerInvoker.enableBlend();
        GlStateManagerInvoker.disableTexture2D();
        GlStateManagerInvoker.b(770, 771, 1, 0);
        GlStateManagerInvoker.color(f2, f3, f4, f);
        WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.k);
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, d, d4, 0.0));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, d3, d4, 0.0));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, d3, d2, 0.0));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, d, d2, 0.0));
        TessellatorInvoker.draw(tessellator);
        GlStateManagerInvoker.enableTexture2D();
        GlStateManagerInvoker.disableBlend();
    }

    public void a(int n, int n2, int n3, int n4, int n5) {
        int n6;
        if (n < n3) {
            n6 = n;
            n = n3;
            n3 = n6;
        }
        if (n2 < n4) {
            n6 = n2;
            n2 = n4;
            n4 = n6;
        }
        float f = (float)(n5 >> 24 & 0xFF) / 255.0f;
        float f2 = (float)(n5 >> 16 & 0xFF) / 255.0f;
        float f3 = (float)(n5 >> 8 & 0xFF) / 255.0f;
        float f4 = (float)(n5 & 0xFF) / 255.0f;
        Tessellator tessellator = TessellatorInvoker.getInstance();
        WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
        GlStateManagerInvoker.enableBlend();
        GlStateManagerInvoker.disableTexture2D();
        GlStateManagerInvoker.b(770, 771, 1, 0);
        GlStateManagerInvoker.color(f2, f3, f4, f);
        WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.k);
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, n, n4, 0.0));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, n3, n4, 0.0));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, n3, n2, 0.0));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, n, n2, 0.0));
        TessellatorInvoker.draw(tessellator);
        GlStateManagerInvoker.enableTexture2D();
        GlStateManagerInvoker.disableBlend();
    }

    static {
        a = new ResourceLocation(afl_0.a);
        e = new ResourceLocation(afl_0.b);
        d = new ResourceLocation(afl_0.c);
    }

    public void c(int n, int n2, int n3, int n4, int n5, int n6) {
        float f = 0.00390625f;
        float f2 = 0.00390625f;
        Tessellator tessellator = TessellatorInvoker.getInstance();
        WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
        WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.a);
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n, n2 + n6, zLevel), (float)n3 * f, (float)(n4 + n6) * f2));
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n + n5, n2 + n6, zLevel), (float)(n3 + n5) * f, (float)(n4 + n6) * f2));
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n + n5, n2, zLevel), (float)(n3 + n5) * f, (float)n4 * f2));
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n, n2, zLevel), (float)n3 * f, (float)n4 * f2));
        TessellatorInvoker.draw(tessellator);
    }

    protected void b(int n, int n2, int n3, int n4) {
        if (n2 < n) {
            int n5 = n;
            n = n2;
            n2 = n5;
        }
        this.a(n, n3, n2 + 1, n3 + 1, n4);
    }

    public void a(FontRenderer fontRenderer, String string, int n, int n2, int n3) {
        FontRendererInvoker.drawStringWithShadow(fontRenderer, string, n, n2, n3);
    }

    public static void a(double d, double d2, float f, float f2, int n, int n2, double d3, double d4, float f3, float f4) {
        float f5 = 1.0f / f3;
        float f6 = 1.0f / f4;
        Tessellator tessellator = TessellatorInvoker.getInstance();
        WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
        WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.a);
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d, d2 + d4, 0.0), f * f5, (f2 + (float)n2) * f6));
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d + d3, d2 + d4, 0.0), (f + (float)n) * f5, (f2 + (float)n2) * f6));
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d + d3, d2, 0.0), (f + (float)n) * f5, f2 * f6));
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d, d2, 0.0), f * f5, f2 * f6));
        TessellatorInvoker.draw(tessellator);
    }

    protected void a(double d, double d2, double d3, double d4, int n, int n2) {
        float f = (float)(n >> 24 & 0xFF) / 255.0f;
        float f2 = (float)(n >> 16 & 0xFF) / 255.0f;
        float f3 = (float)(n >> 8 & 0xFF) / 255.0f;
        float f4 = (float)(n & 0xFF) / 255.0f;
        float f5 = (float)(n2 >> 24 & 0xFF) / 255.0f;
        float f6 = (float)(n2 >> 16 & 0xFF) / 255.0f;
        float f7 = (float)(n2 >> 8 & 0xFF) / 255.0f;
        float f8 = (float)(n2 & 0xFF) / 255.0f;
        GlStateManagerInvoker.disableTexture2D();
        GlStateManagerInvoker.enableBlend();
        GlStateManagerInvoker.C();
        GlStateManagerInvoker.b(770, 771, 1, 0);
        GlStateManagerInvoker.shadeModel(7425);
        Tessellator tessellator = TessellatorInvoker.getInstance();
        WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
        WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.d);
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.endVertex(worldRenderer, d3, d2, zLevel), f2, f3, f4, f));
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.endVertex(worldRenderer, d, d2, zLevel), f2, f3, f4, f));
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.endVertex(worldRenderer, d, d4, zLevel), f6, f7, f8, f5));
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.endVertex(worldRenderer, d3, d4, zLevel), f6, f7, f8, f5));
        TessellatorInvoker.draw(tessellator);
        GlStateManagerInvoker.shadeModel(7424);
        GlStateManagerInvoker.disableBlend();
        GlStateManagerInvoker.enableAlpha();
        GlStateManagerInvoker.enableTexture2D();
    }

    public void a(double d, double d2, double d3, double d4, int n) {
        double d5;
        if (d < d3) {
            d5 = d;
            d = d3;
            d3 = d5;
        }
        if (d2 < d4) {
            d5 = d2;
            d2 = d4;
            d4 = d5;
        }
        float f = (float)(n >> 24 & 0xFF) / 255.0f;
        float f2 = (float)(n >> 16 & 0xFF) / 255.0f;
        float f3 = (float)(n >> 8 & 0xFF) / 255.0f;
        float f4 = (float)(n & 0xFF) / 255.0f;
        Tessellator tessellator = TessellatorInvoker.getInstance();
        WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
        GlStateManagerInvoker.enableBlend();
        GlStateManagerInvoker.disableTexture2D();
        GlStateManagerInvoker.b(770, 771, 1, 0);
        GlStateManagerInvoker.color(f2, f3, f4, f);
        WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.k);
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, d, d4, 0.0));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, d3, d4, 0.0));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, d3, d2, 0.0));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, d, d2, 0.0));
        TessellatorInvoker.draw(tessellator);
        GlStateManagerInvoker.enableTexture2D();
        GlStateManagerInvoker.disableBlend();
    }

    public void a(int n, int n2, KM kM, int n3, int n4) {
        Tessellator tessellator = TessellatorInvoker.getInstance();
        WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
        WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.a);
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n, n2 + n4, zLevel), qg_2.a(kM), qg_2.k(kM)));
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n + n3, n2 + n4, zLevel), qg_2.m(kM), qg_2.k(kM)));
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n + n3, n2, zLevel), qg_2.m(kM), qg_2.f(kM)));
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n, n2, zLevel), qg_2.a(kM), qg_2.f(kM)));
        TessellatorInvoker.draw(tessellator);
    }

    public void b(FontRenderer fontRenderer, String string, int n, int n2, int n3) {
        FontRendererInvoker.drawStringWithShadow(fontRenderer, string, n - FontRendererInvoker.a(fontRenderer, string) / 2, n2, n3);
    }

    public static void a(double d, double d2, int n, int n2, int n3, int n4) {
        float f = 0.00390625f;
        float f2 = 0.00390625f;
        Tessellator tessellator = TessellatorInvoker.getInstance();
        WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
        WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.a);
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d, d2 + (double)n4, zLevel), (float)n * f, (float)(n2 + n4) * f2));
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d + (double)n3, d2 + (double)n4, zLevel), (float)(n + n3) * f, (float)(n2 + n4) * f2));
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d + (double)n3, d2, zLevel), (float)(n + n3) * f, (float)n2 * f2));
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d, d2, zLevel), (float)n * f, (float)n2 * f2));
        TessellatorInvoker.draw(tessellator);
    }

    protected void b(int n, int n2, int n3, int n4, int n5, int n6) {
        float f = (float)(n5 >> 24 & 0xFF) / 255.0f;
        float f2 = (float)(n5 >> 16 & 0xFF) / 255.0f;
        float f3 = (float)(n5 >> 8 & 0xFF) / 255.0f;
        float f4 = (float)(n5 & 0xFF) / 255.0f;
        float f5 = (float)(n6 >> 24 & 0xFF) / 255.0f;
        float f6 = (float)(n6 >> 16 & 0xFF) / 255.0f;
        float f7 = (float)(n6 >> 8 & 0xFF) / 255.0f;
        float f8 = (float)(n6 & 0xFF) / 255.0f;
        GlStateManagerInvoker.disableTexture2D();
        GlStateManagerInvoker.enableBlend();
        GlStateManagerInvoker.C();
        GlStateManagerInvoker.b(770, 771, 1, 0);
        GlStateManagerInvoker.shadeModel(7425);
        Tessellator tessellator = TessellatorInvoker.getInstance();
        WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
        WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.d);
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.endVertex(worldRenderer, n3, n2, zLevel), f2, f3, f4, f));
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.endVertex(worldRenderer, n, n2, zLevel), f2, f3, f4, f));
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.endVertex(worldRenderer, n, n4, zLevel), f6, f7, f8, f5));
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.endVertex(worldRenderer, n3, n4, zLevel), f6, f7, f8, f5));
        TessellatorInvoker.draw(tessellator);
        GlStateManagerInvoker.shadeModel(7424);
        GlStateManagerInvoker.disableBlend();
        GlStateManagerInvoker.enableAlpha();
        GlStateManagerInvoker.enableTexture2D();
    }

    protected void a(int n, int n2, int n3, int n4) {
        if (n3 < n2) {
            int n5 = n2;
            n2 = n3;
            n3 = n5;
        }
        this.a(n, n2 + 1, n + 1, n3, n4);
    }

    public static void b(double d, double d2, int n, int n2, int n3, int n4) {
        float f = 0.00390625f;
        float f2 = 0.00390625f;
        Tessellator tessellator = TessellatorInvoker.getInstance();
        WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
        WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.a);
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d + 0.0, d2 + (double)n4, zLevel), (float)n * f, (float)(n2 + n4) * f2));
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d + (double)n3, d2 + (double)n4, zLevel), (float)(n + n3) * f, (float)(n2 + n4) * f2));
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d + (double)n3, d2 + 0.0, zLevel), (float)(n + n3) * f, (float)n2 * f2));
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d + 0.0, d2 + 0.0, zLevel), (float)n * f, (float)n2 * f2));
        TessellatorInvoker.draw(tessellator);
    }

    public static void a(int n, int n2, float f, float f2, int n3, int n4, float f3, float f4) {
        float f5 = 1.0f / f3;
        float f6 = 1.0f / f4;
        Tessellator tessellator = TessellatorInvoker.getInstance();
        WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
        WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.a);
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n, n2 + n4, 0.0), f * f5, (f2 + (float)n4) * f6));
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n + n3, n2 + n4, 0.0), (f + (float)n3) * f5, (f2 + (float)n4) * f6));
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n + n3, n2, 0.0), (f + (float)n3) * f5, f2 * f6));
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n, n2, 0.0), f * f5, f2 * f6));
        TessellatorInvoker.draw(tessellator);
    }
}


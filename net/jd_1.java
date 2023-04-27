/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.TessellatorInvoker;
import cc.novoline.invoke.WorldRendererInvoker;
import deobf.DefaultVertexFormats;
import deobf.Tessellator;
import net.minecraft.renderer.WorldRenderer;

/*
 * Renamed from net.jd
 */
public class jd_1
extends jo_0<ns_2> {
    protected rk_2 p;
    private static ResourceLocation m;
    private static ResourceLocation o;
    private static ResourceLocation n;

    public jd_1(RenderManager renderManager) {
        super(renderManager, new rk_2(0.0f), 0.5f);
        this.p = (rk_2)this.h;
        this.b(new tz_0(this));
        this.b(new va_1());
    }

    @Override
    protected ResourceLocation a(ns_2 ns_22) {
        return m;
    }

    static {
        n = new ResourceLocation(awa_2.b);
        o = new ResourceLocation(awa_2.a);
        m = new ResourceLocation(awa_2.c);
    }

    @Override
    public void a(ns_2 ns_22, double d, double d2, double d3, float f, float f2) {
        ay9_0.a(ns_22, false);
        super.b(ns_22, d, d2, d3, f, f2);
        if (ns_22.bQ != null) {
            this.a(ns_22, d, d2, d3, f2);
        }
    }

    protected void a(ns_2 ns_22, double d, double d2, double d3, float f) {
        float f2 = (float)ns_22.bQ.ak + f;
        float f3 = MathHelper.sin(f2 * 0.2f) / 2.0f + 0.5f;
        f3 = (f3 * f3 + f3) * 0.2f;
        float f4 = (float)(ns_22.bQ.posX - ns_22.posX - (ns_22.prevPosX - ns_22.posX) * (double)(1.0f - f));
        float f5 = (float)((double)f3 + ns_22.bQ.posY - 1.0 - ns_22.posY - (ns_22.prevPosY - ns_22.posY) * (double)(1.0f - f));
        float f6 = (float)(ns_22.bQ.posZ - ns_22.posZ - (ns_22.prevPosZ - ns_22.posZ) * (double)(1.0f - f));
        float f7 = MathHelper.g(f4 * f4 + f6 * f6);
        float f8 = MathHelper.g(f4 * f4 + f5 * f5 + f6 * f6);
        GlStateManagerInvoker.pushMatrix();
        GlStateManagerInvoker.translate((float)d, (float)d2 + 2.0f, (float)d3);
        GlStateManagerInvoker.b((float)(-MathInvoker.c(f6, f4)) * 180.0f / (float)Math.PI - 90.0f, 0.0f, 1.0f, 0.0f);
        GlStateManagerInvoker.b((float)(-MathInvoker.c(f7, f5)) * 180.0f / (float)Math.PI - 90.0f, 1.0f, 0.0f, 0.0f);
        Tessellator tessellator = TessellatorInvoker.getInstance();
        WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
        ne_0.e();
        GlStateManagerInvoker.A();
        this.a(n);
        GlStateManagerInvoker.shadeModel(7425);
        float f9 = 0.0f - ((float)ns_22.ticksExisted + f) * 0.01f;
        float f10 = MathHelper.g(f4 * f4 + f5 * f5 + f6 * f6) / 32.0f - ((float)ns_22.ticksExisted + f) * 0.01f;
        WorldRendererInvoker.begin(worldRenderer, 5, DefaultVertexFormats.POSITION_TEX_COLOR);
        int n = 0;
        while (true) {
            float f11 = MathHelper.sin((float)(n % 8) * (float)Math.PI * 2.0f / 8.0f) * 0.75f;
            float f12 = MathHelper.cos((float)(n % 8) * (float)Math.PI * 2.0f / 8.0f) * 0.75f;
            float f13 = (float)(n % 8) * 1.0f / 8.0f;
            WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, f11 * 0.2f, f12 * 0.2f, 0.0), f13, f10), 0, 0, 0, 255));
            WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, f11, f12, f8), f13, f9), 255, 255, 255, 255));
            ++n;
        }
    }

    @Override
    public void a(ns_2 ns_22, float f, float f2, float f3, float f4, float f5, float f6) {
        if (ns_22.bE > 0) {
            float f7 = (float)ns_22.bE / 200.0f;
            GlStateManagerInvoker.depthFunc(515);
            GlStateManagerInvoker.enableAlpha();
            GlStateManagerInvoker.alphaFunc(516, f7);
            this.a(o);
            aV7.a(this.h, ns_22, f, f2, f3, f4, f5, f6);
            GlStateManagerInvoker.alphaFunc(516, 0.1f);
            GlStateManagerInvoker.depthFunc(514);
        }
        this.b(ns_22);
        aV7.a(this.h, ns_22, f, f2, f3, f4, f5, f6);
        if (ns_22.a8 > 0) {
            GlStateManagerInvoker.depthFunc(514);
            GlStateManagerInvoker.disableTexture2D();
            GlStateManagerInvoker.enableBlend();
            GlStateManagerInvoker.b(770, 771);
            GlStateManagerInvoker.color(1.0f, 0.0f, 0.0f, 0.5f);
            aV7.a(this.h, ns_22, f, f2, f3, f4, f5, f6);
            GlStateManagerInvoker.enableTexture2D();
            GlStateManagerInvoker.disableBlend();
            GlStateManagerInvoker.depthFunc(515);
        }
    }

    @Override
    protected void a(ns_2 ns_22, float f, float f2, float f3) {
        float f4 = (float)CH.a(ns_22, 7, f3)[0];
        float f5 = (float)(CH.a(ns_22, 5, f3)[1] - CH.a(ns_22, 10, f3)[1]);
        GlStateManagerInvoker.b(-f4, 0.0f, 1.0f, 0.0f);
        GlStateManagerInvoker.b(f5 * 10.0f, 1.0f, 0.0f, 0.0f);
        GlStateManagerInvoker.translate(0.0f, 0.0f, 1.0f);
        if (ns_22.aS > 0) {
            float f6 = ((float)ns_22.aS + f3 - 1.0f) / 20.0f * 1.6f;
            if ((f6 = MathHelper.g(f6)) > 1.0f) {
                f6 = 1.0f;
            }
            GlStateManagerInvoker.b(f6 * this.a(ns_22), 0.0f, 0.0f, 1.0f);
        }
    }
}


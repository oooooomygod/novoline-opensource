/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.TessellatorInvoker;
import cc.novoline.invoke.WorldRendererInvoker;
import deobf.DefaultVertexFormats;
import deobf.Entity;
import deobf.OpenGlHelper;
import deobf.Tessellator;
import net.minecraft.renderer.WorldRenderer;

/*
 * Renamed from net.jh
 */
public class jh_1
extends j7_0 {
    private static ResourceLocation e;
    private static String f = "CL_00000993";

    public void b(Entity entity, double d, double d2, double d3, float f, float f2) {
        this.a((oa_2)entity, d, d2, d3, f, f2);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "\u001emC\u001c~\u0003nm\u0018%\u001f".toCharArray();
        int n2 = 0;
        int n3 = 37;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x78));
            n3 = n3;
        }
    }

    public jh_1(RenderManager renderManager) {
        super(renderManager);
        this.c = 0.15f;
        this.b = 0.75f;
    }

    protected ResourceLocation a(Entity entity) {
        return this.a((oa_2)entity);
    }

    protected ResourceLocation a(oa_2 oa_22) {
        return e;
    }

    public void a(oa_2 oa_22, double d, double d2, double d3, float f, float f2) {
        GlStateManagerInvoker.pushMatrix();
        GlStateManagerInvoker.translate((float)d, (float)d2, (float)d3);
        this.b(oa_22);
        int n = TC.b(oa_22);
        float f3 = (float)(n % 4 * 16) / 64.0f;
        float f4 = (float)(n % 4 * 16 + 16) / 64.0f;
        float f5 = (float)(n / 4 * 16) / 64.0f;
        float f6 = (float)(n / 4 * 16 + 16) / 64.0f;
        float f7 = 1.0f;
        float f8 = 0.5f;
        float f9 = 0.25f;
        int n2 = TC.a(oa_22, f2);
        int n3 = n2 % 65536;
        int n4 = n2 / 65536;
        OpenGlHelper.a(apl_1.ab, (float)n3 / 1.0f, (float)n4 / 1.0f);
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
        float f10 = ((float)oa_22.an + f2) / 2.0f;
        n4 = (int)((MathHelper.sin(f10 + 0.0f) + 1.0f) * 0.5f * 255.0f);
        int n5 = (int)((MathHelper.sin(f10 + 4.1887903f) + 1.0f) * 0.1f * 255.0f);
        GlStateManagerInvoker.b(180.0f - this.a.l, 0.0f, 1.0f, 0.0f);
        GlStateManagerInvoker.b(-this.a.b, 1.0f, 0.0f, 0.0f);
        GlStateManagerInvoker.c(0.3f, 0.3f, 0.3f);
        Tessellator tessellator = TessellatorInvoker.getInstance();
        WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
        WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.c);
        int n6 = n4;
        int n7 = 255;
        int n8 = n5;
        if (ys_2.aF()) {
            int n9 = ajT.a(f10);
            n6 = n9 >> 16 & 0xFF;
            n7 = n9 >> 8 & 0xFF;
            n8 = n9 >> 0 & 0xFF;
        }
        WorldRendererInvoker.pos(WorldRendererInvoker.d(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, 0.0f - f8, 0.0f - f9, 0.0), f3, f6), n6, n7, n8, 128), 0.0f, 1.0f, 0.0f));
        WorldRendererInvoker.pos(WorldRendererInvoker.d(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, f7 - f8, 0.0f - f9, 0.0), f4, f6), n6, n7, n8, 128), 0.0f, 1.0f, 0.0f));
        WorldRendererInvoker.pos(WorldRendererInvoker.d(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, f7 - f8, 1.0f - f9, 0.0), f4, f5), n6, n7, n8, 128), 0.0f, 1.0f, 0.0f));
        WorldRendererInvoker.pos(WorldRendererInvoker.d(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, 0.0f - f8, 1.0f - f9, 0.0), f3, f5), n6, n7, n8, 128), 0.0f, 1.0f, 0.0f));
        TessellatorInvoker.draw(tessellator);
        GlStateManagerInvoker.disableBlend();
        GlStateManagerInvoker.y();
        GlStateManagerInvoker.popMatrix();
        super.b(oa_22, d, d2, d3, f, f2);
    }
}

